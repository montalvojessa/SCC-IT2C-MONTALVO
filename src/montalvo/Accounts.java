package montalvo;

public class Accounts {
    private double id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;


    public void addAccount(double id, String firstName, String lastName, String email, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    
    public void viewAccount() {
        
        System.out.printf("%-10.0f %-10s %-10s %-10s %-10s %-10s\n",
                this.id, this.firstName, this.lastName, this.email, this.username, this.password);
    }
}