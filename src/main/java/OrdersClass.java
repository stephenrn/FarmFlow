public class OrdersClass {
    private String name;
    private int totalProducts;
    private double totalAmount;
    private String itemList;
    private int orderNo; 

    // STATIC TO HOLD ORDERS
    private static OrdersClass[] ordersList = new OrdersClass[20];
    private static int orderCount = 0;

    public OrdersClass(String name, int totalProducts, double totalAmount, String itemList) {
        this.name = name;
        this.totalProducts = totalProducts;
        this.totalAmount = totalAmount;
        this.itemList = itemList;
        this.orderNo = orderCount + 1; 
        ordersList[orderCount++] = this;
    }

    public static int getOrderCount() {
        return orderCount;
    }

    public static OrdersClass[] getOrdersList() {
        return ordersList;
    }

    public String getName() {
        return name;
    }

    public int getTotalProducts() {
        return totalProducts;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getItemList() {
        return itemList;
    }

    public int getOrderNo() {
        return orderNo; 
    }

    //Searches through a list of orders (ordersList) to find an order with a specific order number (orderNo).
    public static OrdersClass getOrderByOrderNo(int orderNo) {
        for (OrdersClass order : ordersList) {
            if (order != null && order.getOrderNo() == orderNo) {
                return order;
            }
        }
        return null;
    }
    
    
    //removes an order from the ordersList array by its orderNo.
    public static void removeOrderByOrderNo(int orderNo) {
    for (int i = 0; i < ordersList.length; i++) {
        if (ordersList[i] != null && ordersList[i].getOrderNo() == orderNo) {
       
            for (int j = i; j < ordersList.length - 1; j++) {
                ordersList[j] = ordersList[j + 1];
            }
            ordersList[ordersList.length - 1] = null; 
            orderCount--;
            break;
        }
    }
}

}
