public abstract class AbstractClass{
   private double subtotal, discount, shippingFee, newGrandTotal;
   String items, delivery, payment, address, username;

   public AbstractClass(String items, double subtotal, double discount, double shippingFee, double newGrandTotal, 
           String payment, String delivery, String address, String username){
       this.items = items;
       this.subtotal = subtotal;
       this.discount = discount;
       this.shippingFee = shippingFee;
       this.newGrandTotal = newGrandTotal;
       this.payment = payment;
       this.delivery = delivery;
       this.address = address;
       this.username = username;
   }
   
    public String viewReceipt(String items, double subtotal, double discount, double shippingFee, double newGrandTotal, 
           String payment, String delivery, String address, String username){
     return
    "=== RECEIPT ===\n"+
    "Product Name\tPrice\tQuantity\tTotal\n"+
    "===========================================\n"+ items+
    "===========================================\n\n"+
    "Subtotal:\t\t₱" + subtotal + "\n"+
    "Discount:\t\t₱" + String.format("%.1f",discount) + "\n"+
    "Shipping Fee:\t\t₱" + shippingFee + "\n"+
    "Total Amount:\t\t₱" + newGrandTotal + "\n"+
    "Mode of payment:\t" + payment + "\n"+
    "Delivery:\t\t" + delivery + "\n"+
    "Address:\t\t" + address + "\n\n"+
    "Thank you for your purchase, " + username + "!\n";
    }
}