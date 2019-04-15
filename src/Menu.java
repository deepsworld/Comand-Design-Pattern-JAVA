import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;

    public Menu(){
        menuItems = new ArrayList<MenuItem>();
    }

    // add item to the list
    public void addItem(MenuItem item){
        menuItems.add(item);
    }

    public void displayMenu(ArrayList<MenuItem> menuItems){
        for (MenuItem temp : menuItems) {
            temp.toString();
            System.out.println();
        }
    }
    public ArrayList<MenuItem> getMenuItemsList(){
        return menuItems;
    }

}
