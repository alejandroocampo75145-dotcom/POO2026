public class Thermometer {
    
    // Atributo encapsulado (estado)
    private int temperature = 0; 
    
    // Método para consultar (comportamiento)
    public int getTemperature() {
        return temperature;
        
    }
    // Método para registrar/modificar (comportamiento)
    public int setTemperature(int newTemperature) {
        
        if((newTemperature<-50)){
            return -1;
            
        }
        else if (newTemperature>100){
            
            return -2;
        }
        else{
            this.temperature=newTemperature;
            return 0;
        }

    }
}