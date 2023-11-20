public class Card {
    protected String firstName;
    protected String lastName;
    protected String cardNumber;
    protected double balance;
    protected String password;

    public Card(){

    }

    public Card(String firstName, String lastName, String cardNumber, double balance, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.password = password;
    }

    public boolean checkPassword(String pass){
        return password.equals(pass);
    }
}
