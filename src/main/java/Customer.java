public class Customer{
    private final String username;
    private final String password;

    private String login_username;
    private String password_login;

    public Customer(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void login(String username_log, String password_log){
        this.login_username = username_log;
        this.password_login = password_log;
    }

    public boolean validate_password(){
        return (this.password.contentEquals(this.password_login));
    }

    public boolean validate_username(){
        return (this.username.contentEquals(this.login_username));
    }

}