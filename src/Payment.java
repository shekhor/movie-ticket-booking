import java.time.LocalDate;
public class Payment {
    private double amount;
    private String transaction_id;
    private String payment_status;
    private LocalDate createdOn;


    public Payment(int amount, String transaction_id, String payment_status) {
        this.amount = amount;
        this.transaction_id = transaction_id;
        this.payment_status = payment_status;
        this.createdOn = LocalDate.now();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }
}
