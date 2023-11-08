import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        manageAcc manager = new manageAcc();
        DBManager base = new DBManager();
        System.out.println("What do you want? - enter ''create'' to create account or ''sing in'' to sing in");
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
                System.out.println("Try again enter ''create'' to create account or ''sing in'' to sing in :)");
            }
        }
        System.out.println("What do you want to do?");
        System.out.println("enter 1 for see rows, enter 2 for modify row, enter 3 for delete row, enter 4 for create new row");
        String select = scanner.nextLine();
        if (select.equals("1")){
            base.main();
        } else if (select.equals("2")) {
            System.out.println("To modify set new values as 'column1 = value1'");
            String setValue = scanner.nextLine();
            System.out.println("And set condition");
            String condition = scanner.nextLine();
            update modify = new update(condition,setValue);
            modify.updateDatabase();
        } else if (select.equals("3")) {
            System.out.println("To delete row enter id");
            int deleteRow = scanner.nextInt();
        } else if (select.equals("4")) {
            System.out.println("enter imie");
            String name = scanner.nextLine();
            System.out.println("enter nazwisko");
            String surname = scanner.nextLine();
            System.out.println("enter aktywny");
            int active = scanner.nextInt();
        }
    }
}