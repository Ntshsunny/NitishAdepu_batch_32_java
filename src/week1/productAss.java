package week1;

class Product{
    private double price;
    private double prce;
    private int quantity;
    public void setPrice( double price){
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public  void setQuantity(int quantity, double prce){
        this.quantity= quantity;
        this.prce = prce;
    }
    public double getQuanity(){
        return prce;
    }
}

public class productAss {
    public static void main(String args[])
    {
        Product p = new Product();
        p.setPrice(256.3);
        p.setQuantity(25, 128.78);
        System.out.println("the price of the product is " +p.getPrice());
        System.out.println("the price of product for above quantity is "+p.getQuanity());
    }
}

