public class MenuItem {
    private String item_name;
    private int item_num;
    private double price;

    public MenuItem(String item_name, int number, double price){
        this.item_name = item_name;
        this.item_num = number;
        this.price = price;
    }

    public String getItem_name() {
        return item_name;
    }

    public int getItem_num() {
        return item_num;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return (item_num + "\t" + item_name + "\t $" + price);
    }
}
