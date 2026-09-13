public class Product {
    private String name = "ABC";
    private double price = 0.0;
    private int stock = 0;

    // Métodos para Name
    public boolean setName(String newName) {
        if ((newName==null) || (newName.trim().isEmpty()) ){
            return false;
        }
        else{
            this.name= newName;
            return true;
        }
    }

    public String getName() {
        return name;
    }

    // Métodos para Price
    public boolean setPrice(double newPrice) {
        if (newPrice<=0){
            return false;
        }
        else{
            this.price= newPrice;
            return true;
        }
    }

    public double getPrice() {
        return price;
    }

    // Métodos para Stock
    public boolean setStock(int newStock) {
        if (newStock<0){
            return false;
        }
        else{
            this.stock= newStock;
            return true;
        }
    }

    public int getStock() {
        return stock;
    }
}
