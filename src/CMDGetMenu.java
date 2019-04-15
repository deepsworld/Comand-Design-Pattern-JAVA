public class CMDGetMenu implements Command {

    private Aggregator agg;

    public CMDGetMenu(Aggregator agg){
        this.agg = agg;
    }

    @Override
    public Object execute() {
        return agg.getMenu();
    }
}
