public class Thermometer {
    
    // Atributo encapsulado (estado)
    private int temperature = 0; 
    
    // Método para consultar (comportamiento)
    public int getTemperature() {
        return temperature;
        
    }
    // Método para registrar/modificar (comportamiento)
    public boolean setTemperature(int newTemperature) {
        
        if((newTemperature<-50) || (newTemperature>100)){
            return false;
            
        }
        else{
            this.temperature= newTemperature;
            return true;
        }

    }
}