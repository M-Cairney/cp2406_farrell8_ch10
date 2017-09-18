import javax.swing.*;

/**
 * Created by jc260799 on 18/09/17.
 */
public class ItemSold {
    protected String itemDescription;
    protected double itemPrice;
    protected int itemsInvoiceNumber;

    public void fixItemSold(String description, double price, int invoiceNumber){
        itemDescription = description;
        itemPrice = price;
        itemsInvoiceNumber = invoiceNumber;
    }

    public void getItemSold(){
        JOptionPane.showMessageDialog(null,"The Invoice number for this transaction is " + itemsInvoiceNumber +
                ".\n The item is described as " + itemDescription + ".\n The price for this is " +
                itemPrice);
    }
}
