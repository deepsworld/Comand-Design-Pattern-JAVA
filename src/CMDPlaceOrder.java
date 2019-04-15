import java.util.ArrayList;

public class CMDPlaceOrder implements Command {

    private Aggregator agg;
    private ArrayList<Integer> orderList ;

    public CMDPlaceOrder(Aggregator agg, ArrayList<Integer> orderList){
        this.agg = agg;
        this.orderList = orderList;
    }

    @Override
    public Object execute() {
        return agg.placeOrders(orderList);
    }
}