import java.util.Arrays;

public class Basket extends Product{
    protected Product[] products;
    protected int counter;

    public Basket() {

    }

    public Basket(String productName, double price, Product[] products, int counter) {
        super(productName, price);
        this.products = products;
        this.counter = 0;
    }

    public Basket(int counter) {
        this.products = new Product[counter];
        this.counter = 0;
    }

    public void addProduct(Product product){
        if (counter < products.length){
            products[counter++] = product;
        } else {
            System.out.println("ERROR");
        }
    }

}
