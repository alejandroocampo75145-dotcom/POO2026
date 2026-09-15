public class TestThermometer {
    public static void main(String[] args){
        Thermometer thermometer_1= new Thermometer();
        
        testTemperature(thermometer_1, -51);
        testTemperature(thermometer_1, 101);
        testTemperature(thermometer_1, 47);


        System.out.println("La temperatura es de: "+thermometer_1.getTemperature()+ " Grados Celsius");
        
    }



    private static void testTemperature(Thermometer thermometer_1, int temperature){
        int state= thermometer_1.setTemperature(temperature);
        if( state == -1){
            System.out.println("ERROR: La temperatura debe estar por encima de -50 grados Celsius");
            
        }
        else if(state == -2){
            System.out.println("ERROR: La temperatura debe estar por debajo de 100 grados Celsius");
        }
        else{
            System.out.println("EXITO: La temperatura se registro");
        }
    }
}
