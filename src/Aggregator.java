import java.util.ArrayList;

public class Aggregator {
    private Menu menu;
    private Orders order;

    public Aggregator(Menu menu, Orders order){
        this.menu = menu;
        this.order = order;
        fillMenu();
    }

    public Menu getMenu(){
        return menu;
    }

    public Object placeOrders(ArrayList<Integer> orders){
        for(int i = 0;i < orders.size(); i++){
            order.addItem(new OrderItem(orders.get(i)));
        }
        return true;
    }

    public Orders getOrders(){
        return order;
    }

    private void fillMenu(){
        menu.addItem(new MenuItem("Chicken Kadai", 1, 6.99));
        menu.addItem(new MenuItem("Ice cream", 2, 2.99));
        menu.addItem(new MenuItem("Sandwich", 3, 5.99));
        menu.addItem(new MenuItem("Tanduri Nan", 4, 8.99));
        menu.addItem(new MenuItem("Ketchup", 5, 1.99));
        menu.addItem(new MenuItem("Roasted nuts", 6, 3.99));
    }

}
