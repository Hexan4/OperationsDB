import java.util.HashMap;
import java.util.Map;

public class manageAcc {
    private Map<String, accounts> account = new HashMap<>();
    public void createAcc(String login, String password){
        if (!(account.containsKey(login))){
            account.put(login, new accounts(login,password));
            System.out.println("Successful!");
        }else {
            System.out.println("This username already exist.");
        }
    }
}
