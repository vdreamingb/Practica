public class LogInLogic {
    private String username;
    private String password;
    private String trueUsername = "admin";
    private String truePassword = "admin1234#!";

    public LogInLogic(String username, String password){
        this.username = username;
        this.password = password;
    }

    public boolean logIn(){
        if(username.toLowerCase().equals(trueUsername.toLowerCase()) &&  password.toLowerCase().equals(truePassword.toLowerCase())){
            return true;
        }
        return false;
    }
}
