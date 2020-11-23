package MVC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Observable;
import java.util.Observer;

public class OrderView extends JPanel implements Observer, ActionListener {

   private OrderController controller;

   private JFrame frame;
   private JButton changePriceButton;
   private JButton deleteItemButton;
   private JTextField newPriceField;
   private JLabel totalLabel;
   private JTable groceryList;


   private void createUI() {
       deleteItemButton = new JButton("Delete Item");
       add(deleteItemButton);
       deleteItemButton.addActionListener(this);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == deleteItemButton) {
            controller.deleteItem(groceryList.getSelectedRow());
        } else if (e.getSource() == changePriceButton) {
            BigDecimal newPrice = new BigDecimal(newPriceField.getText());
            controller.changePrice(groceryList.getSelectedRow(), newPrice);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        display(((StoreOrder) o).getItemList(), ((StoreOrder) o).getPriceList());
    }

    public OrderView(OrderController controller) {
       this.controller = controller;
       createUI();
    }

    public void display(ListIterator<String> itemList, ListIterator<BigDecimal> priceList) {

    }
}
