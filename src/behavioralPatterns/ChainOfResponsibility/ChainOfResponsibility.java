package behavioralPatterns.ChainOfResponsibility;

import java.util.ArrayList;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        RequestHandlers requestHandlers = new RequestHandlers();
        requestHandlers.addHandler(new Paypal());
        requestHandlers.addHandler(new Strapi());
        requestHandlers.handleRequest("paypal");
    }
}

interface Endpoint {
    public void handleRequest(String request);
}

class Strapi implements Endpoint {

    @Override
    public void handleRequest(String request) {
        if (request == "strapi") {
            System.out.println("Handling request with strapi");
            System.exit(0);
        } else {
            System.out.println("Redirecting");
        }
    }
}

class Paypal implements Endpoint {
    @Override
    public void handleRequest(String request) {
        if (request == "paypal") {
            System.out.println("Paypal Handling");
            System.exit(0);
        } else {
            System.out.println("Redirecting");
        }
    }
}

class RequestHandlers {
    private ArrayList<Endpoint> handlers = new ArrayList<Endpoint>();

    public void addHandler(Endpoint endpoint) {
        handlers.add(endpoint);
    }

    public void handleRequest(String request) {
       for (Endpoint endpoint : handlers) {
           endpoint.handleRequest(request);
       }
    }
}
