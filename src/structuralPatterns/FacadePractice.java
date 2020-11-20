package structuralPatterns;

import java.util.ArrayList;

public class FacadePractice {
    public static void main(String[] args) {
        OnlineShoppingApp onlineShoppingApp = new OnlineShoppingApp();

        onlineShoppingApp.order("shopee", "Cap");
        onlineShoppingApp.order("lazada", "Keyboard");
    }
}

interface IOnlineShoppingApp {
    public void addToCart(String item);
    public void checkout();
}


class Shopee implements IOnlineShoppingApp {
    ArrayList<String> cart = new ArrayList<>();

    @Override
    public void addToCart(String item) {
       cart.add(item);
    }

    @Override
    public void checkout() { }
}

class Lazada implements IOnlineShoppingApp {
    ArrayList<String> cart = new ArrayList<>();

    @Override
    public void addToCart(String item) {
        cart.add(item);
    }

    @Override
    public void checkout() { }
}

class OnlineShoppingApp {
    IOnlineShoppingApp onlineShop = null;

    public void order(String shop, String item) {
        switch (shop) {
            case "shopee" -> onlineShop = new Shopee();
            case "lazada" -> onlineShop = new Lazada();
            default -> System.out.println("No shopping app found");
        }
        if (onlineShop != null) {
            onlineShop.addToCart(item);
            onlineShop.checkout();
        }
    }

}