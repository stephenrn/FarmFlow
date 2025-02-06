//FOR EACH ITEM CLASS

public class ItemsClass {
    private String itemName;
    private String itemCategory;
    private int itemQuantity = 1;
    private double itemPrice;

    // Constructor
    public ItemsClass(String itemName, double itemPrice, String itemCategory) {
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.itemPrice = itemPrice;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public double getItemTotalPrice() {
        return itemPrice * itemQuantity;
    }

    // Quantity manipulation methods
    public void incrementItem() {
        this.itemQuantity++;
    }

    public void decrementItem() {
       
            this.itemQuantity--;
        
    }
}
