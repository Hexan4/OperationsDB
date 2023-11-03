public class accounts {
    private String login;
    private String password; // Dla ulatwienia podaje password jako string, wiem, ze nie jest to bezpieczna opcja.
    public accounts(String login, String password){
        this.login = login;
        this.setPassword(password);
    }

    public String getLogin() {
        return login;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
