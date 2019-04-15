import java.util.ArrayList;

public class SystemInterface {

    private static Invoker myInv;

    public static void init(Invoker inv) {
        myInv = inv;
    }

    public static ArrayList<String> getMenu(){
        Menu myMenu = myInv.getMenu();
        ArrayList<String> displayMenu = new ArrayList<String>();

        for (MenuItem temp : myMenu.getMenuItemsList()) {
            displayMenu.add(temp.toString());
        }
        return displayMenu;
    }

    public static Boolean placeOrder(ArrayList<Integer> orderList){
        return myInv.placeOrder(orderList);
    }

    public static ArrayList<String> getOrder(){
        Menu myMenu = myInv.getMenu();
        Orders myOrder = myInv.getOrders();
        ArrayList<String> displayOrder = new ArrayList<String>();

        for (MenuItem a : myMenu.getMenuItemsList()) {
            for (OrderItem b : myOrder.getOrderItems()){
                if (a.getItem_num() == b.getItem_num()){
                    displayOrder.add(a.toString());
                }
            }
        }
        return displayOrder;
    }

    public static double getTab(){
        return myInv.getTab().produceTab();
    }
}
