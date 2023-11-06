import java.util.HashMap;
import java.util.Map;

public class manageAcc {
    private Map<String, accounts> account = new HashMap<>();
    public void createAcc(String login, String password){
        if (!(account.containsKey(login))){
            account.put(login, new accounts(login,password));
            System.out.println("Successful! - Welcome " + login);
        }else {
            System.out.println("This username already exist.");
        }
    }
    public boolean authorisation(String login, String password){
        accounts konto = new accounts(login, password);
        if (konto.checkPassword(password)){
            System.out.println("You are log in.");
            return true;
        }else {
            System.out.println("incorrect password");
            return false;
        }
    }
}
