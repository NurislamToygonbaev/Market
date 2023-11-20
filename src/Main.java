import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("Nurislam", "Toigonbaev", "234568765434", 2000, "1234");

        Basket basket = new Basket(100);
        basket.addProduct(new Product("limonade", 50));
        basket.addProduct(new Product("kartoshka", 50));
        basket.addProduct(new Product("sabiz", 80));
        basket.addProduct(new Product("piyaz", 30));

        Client client = new Client("Zhigit", "Turumbekov", 20, card, basket);

        client.payWithCard();

        System.out.println(" Ostavshiesya summa na balanse = " + client.getCardBalance());

    }

}