package structuralPatterns.Proxy;

import java.util.Hashtable;

public class Proxy {

}

// Step 1: Design the subject interface.
interface IOrder {
    public void fulfillOrder(Order order);
}

// Step 2: Implement the real subject class
class Warehouse implements IOrder {
    private Hashtable<String, Integer> stock;
    private String address;

    /* Constructors and other attributes would go here */

    @Override
    public void fulfillOrder(Order order) {
        for (Item item: order.itemList)
            this.stock.replace(item.sku, stock.get(item) - 1);

       /* Process the order for shipment and delivery */
    }

    public int currentInventory(Item item) {
        if (stock.containsKey(item.sku))
            return stock.get(item.sku).intValue();
        return 0;
    }
}

// Step 3: Implement the proxy class
class OrderFulfillment implements IOrder {

    /* Constructors and other attributes would go here */

    @Override
    public void fulfillOrder(Order order) {
       /* For each item in a customer order, check each warehouse to see if it is in stock.

          If it is then create a new order for that warehouse.
          Else check the next warehouse.

          Send all the Orders to the warehouse(s) after you finish iterating over all the items in the original order.
        */
       for (Item item: order.itemList) {
           for (Warehouse warehouse: warehouses) {

           }
       }
       return;

    }
}
