public class TestThermometer {
    public static void main(String[] args){
        Thermometer thermometer_1= new Thermometer();
        if(thermometer_1.setTemperature(-51)){
            System.out.println("ERROR: La temperatura debe estar entre -50 y 100 grados Celcius");
            
        }
        else{
            System.out.println("EXITO: La temperatura se registro");
        }

        System.out.println("La temperatura es de: "+thermometer_1.getTemperature()+ " Grados Celsius");
        
    }
}
