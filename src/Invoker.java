import java.util.ArrayList;

public class Invoker {

    private Aggregator agg;

    public  Invoker(Aggregator agg){
        this.agg = agg;
    }

    public Menu getMenu(){
        return (Menu) new CMDGetMenu(agg).execute();
    }

    public Boolean placeOrder(ArrayList<Integer> orders){
        return (Boolean) new CMDPlaceOrder(agg, orders).execute();
    }

    public Orders getOrders(){
        return (Orders) new CMDGetOrder(agg).execute();
    }

    public Tab getTab(){
        return (Tab) new CMDGetTab(agg).execute();
    }
}
