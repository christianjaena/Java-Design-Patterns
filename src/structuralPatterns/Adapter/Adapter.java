package structuralPatterns.Adapter;

public class Adapter {
    public static void main(String[] args) {
        // Step 3: Send the request from the client to the adapter using the target interface.
        String webHost = "Host: https://google.com/n/r";
        WebService service = new WebService(webHost);
        WebAdapter adapter = new WebAdapter();
        adapter.connect(service);
        WebClient client = new WebClient(adapter);
        client.doWork();
    }

}

// Step 1: Design the target interface.
interface IWebRequester {
   public int request(String obj);
}

// Step 2: Implement the target interface with the adapter class.
class WebAdapter implements IWebRequester {
   private WebService service;

   public void connect(WebService service) {
      this.service = service;
   }

   private String toJson(Object obj) {
      return null;
   }

   @Override
   public int request(String request) {
       String result = this.toJson(request);
       String response = service.request(result);
       if (response != null) {
          return 200;
       }
       return 500;
   }
}

class WebService {
    public WebService(String host) { }
   public String request(String jsonObj) {
      return null;
   }
}

class WebClient {
    private IWebRequester webRequester;

    public WebClient(IWebRequester webRequester) {
        this.webRequester = webRequester;
    }

    private String makeObject() {
        return null;
    }

    public void doWork() {
        String object = makeObject();
        int status = webRequester.request(object);

        if (status == 200) {
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }
        return;
    }
}