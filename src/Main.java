import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        manageAcc manager = new manageAcc();
        System.out.println("What do you want? - enter ''create'' to create accout or ''sing in'' to sing in");
        while (true){
            String decision = scanner.nextLine();
            if (decision.equals("create")){
                System.out.println("enter login:");
                String login = scanner.nextLine();
                System.out.println("enter password:");
                String password = scanner.nextLine();
                manager.createAcc(login,password);
                manager.authorisation(login,password);
                break;
            } else if (decision.equals("sing in")) {
                System.out.println("enter login:");
                String login = scanner.nextLine();
                System.out.println("enter password:");
                String password = scanner.nextLine();
                manager.authorisation(login,password);
                break;
            }else {
                System.out.println("Try again enter ''create'' to create accout or ''sing in'' to sing in :)");
            }
        }
        System.out.println("What do you want to do?");
        System.out.println("enter 1 - Select Customers, enter 2 - Select one Customer");
        String select = scanner.nextLine();
    }
}