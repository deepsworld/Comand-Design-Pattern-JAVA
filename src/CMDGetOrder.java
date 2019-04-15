public class CMDGetOrder implements Command {

    private Aggregator agg;

    public CMDGetOrder(Aggregator agg){
        this.agg = agg;
    }

    @Override
    public Object execute() {
        return agg.getOrders();
    }
}
