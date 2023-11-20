import java.time.ZonedDateTime;
import java.util.Scanner;

public class Client extends Card implements CardInterface {
    protected int age;
    protected Card card;
    protected Basket basket;

    public Client() {

    }

    public Client(String firstName, String lastName, int age, Card card, Basket basket) {
        super(firstName, lastName, card.cardNumber, card.balance, card.password);
        this.age = age;
        this.card = card;
        this.basket = basket;
    }

    @Override
    public void payWithCard() {
        double totalMoney = 0;

        for (int i = 0; i < basket.counter; i++) {
            totalMoney += basket.products[i].price;
        }

        if (totalMoney >= 100) {
            System.out.print("Enter Password: ");
            String passwordEnter = new Scanner(System.in).nextLine();
            if (checkPassword(passwordEnter)) {
                if (balance >= totalMoney) {
                    balance -= totalMoney;
                    for (int i = 0; i < basket.counter; i++) {
                        System.out.println(basket.products[i].productName + " " + basket.products[i].price + " som");
                    }
                    System.out.println("Obshiy product summa: " + totalMoney + " som. Date: " + ZonedDateTime.now());
                } else System.out.println("nedostatochno deneg");
            } else System.out.println("invalid password");
        } else {
            if (balance >= totalMoney) {
                balance -= totalMoney;
                for (int i = 0; i < basket.counter; i++) {
                    System.out.println(basket.products[i].productName + " " + basket.products[i].price + " som");
                }
                System.out.println("Obshiy product summa: " + totalMoney + " som. Date: " + ZonedDateTime.now());
            } else System.out.println("nedostatochno deneg");

        }
    }

    @Override
    public double getCardBalance() {
        return balance;
    }
}
