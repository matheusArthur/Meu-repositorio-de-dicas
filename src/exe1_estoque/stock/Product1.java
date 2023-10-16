package exe1_estoque.stock;

public class Product1 {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStuck (){

        return quantity * price;
    }
    public void addProduct (int quantity){

        this.quantity += quantity;
    }
    public void removeProduct (int quantity){

        this.quantity -= quantity;
    }
}
