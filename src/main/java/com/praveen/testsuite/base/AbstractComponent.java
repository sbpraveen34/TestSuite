package com.praveen.testsuite.base;

public abstract class AbstractComponent<Request extends ComponentRequest, Response extends ComponentResponse> {
    final AbstractComponent<Request, Response> nextComponent;

    public AbstractComponent(AbstractComponent<Request, Response> nextComponent) {
        this.nextComponent = nextComponent;
    }

    public abstract void apply(Request request, Response response) throws ComponentException;

    public boolean isTerminateChainFails() {
        return true;
    }


    public static class ComponentChain<Request extends ComponentRequest, Response extends ComponentResponse> {
        AbstractComponent<Request, Response> headComponent;

        public ComponentChain(AbstractComponent<Request, Response> headComponent) {
            this.headComponent = headComponent;
        }

        public void run(Request request, Response response) {
            AbstractComponent<Request, Response> temp = this.headComponent;

            while (temp!=null) {
                try {
                    temp.apply(request, response);
                } catch (ComponentException componentException) {
                    System.out.println(componentException.getMessage());
                }
            }
        }

    }
}
