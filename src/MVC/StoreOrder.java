package MVC;

import java.math.BigDecimal;
import java.util.*;
public class StoreOrder extends Observable {
    private ArrayList<String> itemList;
    private ArrayList<BigDecimal> priceList;

    public StoreOrder() {
        itemList = new ArrayList<String>();
        priceList = new ArrayList<BigDecimal>();
    }

    public String getItem(int itemNum) {
        return itemList.get(itemNum);
    }

    public BigDecimal getPrice(int itemNum) {
        return priceList.get(itemNum);
    }

    public ListIterator<String> getItemList() {
        ListIterator<String> itemItr = itemList.listIterator();
        return itemItr;
    }

    public ListIterator<BigDecimal> getPriceList() {
        ListIterator<BigDecimal> priceItr = priceList.listIterator();
        return priceItr;
    }

    public void deleteItem(int itemNum) {
        itemList.remove(itemNum);
        priceList.remove(itemNum);
        setChanged();
        notifyObservers();
    }

    public void addItem(int barcode) {
        setChanged();
        notifyObservers();
    }

    public void changePrice(int itemNum, BigDecimal newPrice) {
        priceList.set(itemNum, newPrice);
        setChanged();
        notifyObservers();
    }
}
