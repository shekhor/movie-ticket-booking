package people;

public class Account {
    private String password;
    private String id;
    private TicketInfoEnum.AccountStatus status;

    public Account(String password, String id, TicketInfoEnum.AccountStatus status) {
        this.password = password;
        this.id = id;
        this.status = status;
    }

    public void resetPassword(){

    }
}
