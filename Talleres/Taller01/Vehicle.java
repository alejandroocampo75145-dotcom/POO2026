public class Vehicle {
    public enum Result {
        OK,
        WARNING,
        ERROR
    }


    private String licensePlate = "";
    private String brand = "";
    private int currentSpeed = 0;
    private int maximumSpeed = 0;

    // ---Placa---
    public Result setLicensePlate(String newLicensePlate) {
    
        if (newLicensePlate == null || newLicensePlate.isBlank()) {
            return Result.ERROR;
        }
    
    
        if (!newLicensePlate.matches("^[a-zA-Z]{3}[0-9]{3}$")) {
            return Result.ERROR;
        }
    
    
    String normalizedLicensePlate = newLicensePlate.toUpperCase();
    
    
        if (newLicensePlate.equals(normalizedLicensePlate)) {
            this.licensePlate = newLicensePlate;
            return Result.OK;      
        } 
        else 
        {
            this.licensePlate = normalizedLicensePlate;
            return Result.WARNING;  // Lo tuvimos que arreglar
        }
    }
    
    public String getLicensePlate(){
        return licensePlate;
    }
    // -----Marca-----
    public Result setBrand(String newBrand){
        if (newBrand==null || newBrand.isBlank()){
            return Result.ERROR;
        }
        else{
            this.brand=newBrand;
            return Result.OK;
        }
    }
    
    public String getBrand(){
        return brand;
    }

    // -----Velocidades-----
    
    public boolean setMaximumSpeed(int newMaximumSpeed){
        if(newMaximumSpeed>0){
            this.maximumSpeed=newMaximumSpeed;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getMaximumSpeed(){
        return maximumSpeed;
    }
    
    public boolean accelerate(){
        if (currentSpeed + 10<=maximumSpeed){
            currentSpeed+=10;
            return true;
        }
        else{
            return false;
        }
        
    }
    public boolean brake(){
        if(currentSpeed>=10){
            currentSpeed-=10;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getCurrentSpeed(){
        return currentSpeed;
    }


}
