public class PurchaseClass {
    private String UserName;
    private String modePayment="";
    private String deliveryOption="";
    private String customerLocation="";
    
    PurchaseClass(String UserName){
        this.UserName=UserName;
    }
    //setter
    public void setPayment(String payment) {
        modePayment = payment;
    }
    
    public void setDelivery(String delivery) {
        deliveryOption = delivery;
    }
    
    public void setLocation(String location) {
        customerLocation = location;
    }
        
    //getter
    
    public String getUserName(){
        return UserName;
    }
    public String getPayment() {
        return modePayment;
    }
    
    public String getDelivery() {
        return deliveryOption;
    }
    
    public String getLocation() {
        return customerLocation;
    }
    
}
