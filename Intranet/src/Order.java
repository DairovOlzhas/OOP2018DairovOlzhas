public class Order {
    private String description;
    private Employee sender;
    private boolean status;

    public Order(String description, Employee sender){
        this.sender = sender;
        this.description = description;
        status = false;
    }

    public Employee getSender() { return sender; }

    public String getDescription() { return description; }

    public void setStatus(boolean status) { this.status = status; }
}
