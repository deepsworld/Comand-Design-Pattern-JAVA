import java.util.ArrayList;

public class Tab {

    private Menu myMenu;
    private Orders myOrder;
    private ArrayList<MenuItem> tabItem;

    public Tab(Menu menu, Orders order){
        this.myMenu = menu;
        this.myOrder = order;
    }

    public double produceTab(){
        double tab = 0;
        for (OrderItem oItem : myOrder.getOrderItems()) {
            for (MenuItem mItem : myMenu.getMenuItemsList()){
                if(oItem.getItem_num() == mItem.getItem_num()){
                    tab = tab + mItem.getPrice();
                }
            }
        }
        return tab;
    }

}
