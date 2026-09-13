public class TestProduct {
    public static void main(String[] args) {
        Product product1= new Product();
        
        // Name
        if (product1.setName("Papaya")){
            System.out.println("Se Ingreso correctamente el nombre de el producto");
        }
        else{
            System.out.println("ERROR: El nombre no puede estar vacio");
        }
        System.out.println("El nombre de el producto es: " + product1.getName());
    
        // Price
        if (product1.setPrice(-8)){
            System.out.println("Se Ingreso correctamente el precio de el producto");
        }
        else{
            System.out.println("ERROR: El precio de el producto debe ser mayor que 0");
        }
        System.out.println("El precio del producto es: " + product1.getPrice()+ " dolar.");
    
        // Stock
        if (product1.setStock(-5)){
            System.out.println("Se Ingreso correctamente el stock de el producto");
        }
        else{
            System.out.println("ERROR: El stock no puede ser menor a 0");
        }
        System.out.println("El stock del producto es de : " + product1.getStock()+ " unidades.");
    
    
    
    
    
    }
}
