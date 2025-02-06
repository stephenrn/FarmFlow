public class ComputationClass{
   
   public double getDiscount(String customer){
       if (customer == "Regular"){
           return 0.0;
       }
       else if (customer == "Student"){
           return 0.10;
       }
       else{
           return 0.20;
       }
   }
   
   public double getDiscount(double discount, double grandTotal) {
       return discount*grandTotal;
   }
   
   public double getShippingFee(String delivery){
       if (delivery == "Pick-up") {
            return 0.0;
        }
        else {
            return 50.0;
        }
   }
   
   public double getNewGrandTotal(double grandTotal, double discount, double shippingFee){
       return grandTotal - discount + shippingFee;
   }
}
