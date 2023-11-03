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
                System.out.println("now you can sing in:");
            } else if (decision.equals("sing in")) {
                System.out.println("enter login:");
                String login = scanner.nextLine();
                System.out.println("enter password:");
                String password = scanner.nextLine();
            }else {
                System.out.println("Try again enter ''create'' to create accout or ''sing in'' to sing in :)");
                break;
            }
        }
    }
}