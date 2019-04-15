
public class Driver {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Aggregator agg = new Aggregator(menu, new Orders());
        Invoker inv = new Invoker(agg);
        SystemInterface.init(inv);
        UserInterface ui = new UserInterface();
        ui.start();
    }
}
