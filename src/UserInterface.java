import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    public void start() {
        Scanner scan = new Scanner(System.in);
        int user_choice;
        do {
            showInstructions();
            System.out.print("Your Choice: ");
            user_choice = scan.nextInt();

            switch (user_choice){

                case 0:{
                    user_choice = 0;
                    System.out.println("Exiting...");
                    break;
                }

                case 1: {
                    display(SystemInterface.getMenu());
                    break;
                }

                case 2: {
                    int orderNum;
                    boolean value = true;
                    ArrayList<Integer> orderList = new ArrayList<Integer>();
                    while(value){
                        System.out.print("Enter items number to order(0 to exit): ");
                        orderNum = scan.nextInt();
                        if(orderNum != 0){
                            orderList.add(orderNum);
                            System.out.println("Item Added to order list");
                        }
                        else{
                            value = false;
                            System.out.println("Order Submitted");
                        }
                    }

                    if(SystemInterface.placeOrder(orderList)){
                        System.out.println("Order Confirmed");
                        System.out.println("---- Your Orders ----");
                        display(SystemInterface.getOrder());
                    }
                    else{
                        System.out.println("Order Unsuccessful");
                    }
                    break;
                }

                case 3: {
                    System.out.println("---- Your Tab ----");
                    display(SystemInterface.getOrder());
                    System.out.println("Total: \t" + "$" + String.format("%.2f" , SystemInterface.getTab()));
                    break;
                }
                default:{
                    System.out.println();
                    System.out.println("Input choice does not exist");
                }
            }
        } while(user_choice != 0);
    }

    // Display Instructions method.
    private void showInstructions() {
        String instructions = "---- Make a Choice ---- \n" +
                "1 – Display menu \n" +
                "2 – Submit order \n" +
                "3 – Display tab \n" +
                "0 - quit\n";
        System.out.print(instructions);
    }

    private void display(ArrayList<String> list){
        for (String temp : list) {
            System.out.println(temp);
        }

    }
}
