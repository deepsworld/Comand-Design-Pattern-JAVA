public class CMDGetTab implements Command {

    private Aggregator agg;


    public CMDGetTab(Aggregator agg){
        this.agg = agg;
    }

    @Override
    public Object execute() {
        return new Tab(agg.getMenu(),agg.getOrders());
    }
}
