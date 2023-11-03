import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want? - enter ''create'' to create accout or ''sing in'' to sing in");
        while (true){
            String decision = scanner.nextLine();
            if (decision.equals("create")){

                break;
            } else if (decision.equals("sing in")) {
                System.out.println("Enter login");
                System.out.println("Enter password");
                break;
            }else {
                System.out.println("Try again enter ''create'' to create accout or ''sing in'' to sing in :)");
            }
        }
        System.out.println("siemano");

    }
}