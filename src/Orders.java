import java.util.ArrayList;

public class Orders {
    private ArrayList<OrderItem> orderItems;

    public Orders(){
        orderItems = new ArrayList<OrderItem>();
    }

    // add item to the list
    public void addItem(OrderItem item){
        orderItems.add(item);
    }

    public ArrayList<OrderItem> getOrderItems(){
        return orderItems;
    }
}
