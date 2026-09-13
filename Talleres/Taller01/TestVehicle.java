public class TestVehicle {
    
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.setMaximumSpeed(20);

        System.out.println("--- PRUEBAS DE PLACA ---");
        probarPlaca(car, "hola99"); 
        probarPlaca(car, "abc123"); 
        probarPlaca(car, "XYZ987"); 

        System.out.println("\n--- PRUEBAS DE VELOCIDAD ---");
        System.out.println("Acelera a 10 km/h: " + car.accelerate());
        System.out.println("Acelera a 20 km/h: " + car.accelerate());
        System.out.println("Intenta exceder el limite : " + car.accelerate()); 
        
        car.brake();
        System.out.println("Velocidad actual tras frenar: " + car.getCurrentSpeed() + " km/h");
    }

    
    private static void probarPlaca(Vehicle car, String placa) {
        Vehicle.Result res = car.setLicensePlate(placa);
        if (res == Vehicle.Result.OK) {
            System.out.println("OK: Placa '" + placa + "' aceptada intacta.");
        } else if (res == Vehicle.Result.WARNING) {
            System.out.println("WARNING: Placa normalizada. Quedo como: " + car.getLicensePlate());
        } else {
            System.out.println("ERROR: Placa '" + placa + "' rechazada.");
        }
    }
}
