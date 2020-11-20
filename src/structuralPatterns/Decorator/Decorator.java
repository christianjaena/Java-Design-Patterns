package structuralPatterns.Decorator;

import java.awt.event.WindowEvent;

public class Decorator {
    public static void main(String[] args) {
        WebPage myPage = new BasicWebPage();
        myPage = new AuthorizedWebpage(myPage);
        myPage = new AuthorizedWebpage(myPage);
        myPage.display();
    }

}

// Step 1: Design the component interface.
interface WebPage {
    public void display();
}

// Step 2: Implement the interfae with your base concrete component class
class BasicWebPage implements WebPage {
    private String html = "";
    private String styleSheet = "";
    private String scripts = "";

    @Override
    public void display() {
        /* Renders the HTML to the stylesheet, and run any embedded scripts */
        System.out.println("Basic web page");
    }
}

// Step 3: Implement the interface with your abstract decorator class.
abstract class WebPageDecorator implements WebPage {
    protected WebPage page;

    public WebPageDecorator(WebPage webPage) {
        this.page = webPage;
    }

    public void display() {
        this.page.display();
    }
}

// Step 4: Inherit from the abstract decorator and implement the component interface with concrete decorator classes.
class AuthorizedWebpage extends WebPageDecorator {
    public AuthorizedWebpage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void authorizedUser() {
        System.out.println("Authorizing user.");
    }

    public void display() {
        super.display();
        this.authorizedUser();
    }
}

class AuthenticatedWebPage extends WebPageDecorator {
    public AuthenticatedWebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void authenticateUser() {
        System.out.println("Authenticating User");
    }

    public void display() {
        super.display();
        this.authenticateUser();
    }

}