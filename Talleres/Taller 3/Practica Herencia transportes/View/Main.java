package View;

import java.util.Scanner;


import Domain.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        TransportServices[] transports = new TransportServices[100];
        
        int contador = 0; 
        int opcion = 0;   

        do {
            
            System.out.println("\n====== MENÚ DE TRANSPORTES ======");
            System.out.println("1. Crear un nuevo servicio de transporte");
            System.out.println("2. Mostrar todos los servicios almacenados");
            System.out.println("3. Consultar un servicio específico por ID");
            System.out.println("4. Calcular el valor total de todas las tarifas");
            System.out.println("5. Salir del programa");
            System.out.print("Digita una opción: ");
            
            
            opcion = sc.nextInt(); 

            
            switch (opcion) {
                case 1:
                    System.out.println("\n--- REGISTRAR VEHÍCULO ---");
                        int eleccion=0;
                        System.out.println("\n--- Ingrese el Id ---");
                        int id= sc.nextInt();
                        
                        System.out.println("\n====== Opciones ======");
                        System.out.println("1. Para crear un Taxi");
                        System.out.println("2. Para crear un Bote");
                        System.out.println("3. Para crear un Tren");
                        System.out.println("4. Para crear un Bus");
                        System.out.println("5. Para crear un Avion");
                        System.out.print("Digita una opción: ");

                        eleccion= sc.nextInt();
                        
                        switch (eleccion){
                            case 1:
                                System.out.println("\n--Registrando Taxi--");
                                
                                System.out.println("Ingrese el precio base");
                                float basePrice= sc.nextFloat();
                                System.out.println("Ingrese el valor por kilometro");
                                float kilometerValue= sc.nextFloat();
                                System.out.println("Ingrese los kilometros recorridos");
                                float kilometersTraveled= sc.nextFloat();
                                
                                try {
                                    Taxi newTaxi= new Taxi(id, basePrice, kilometerValue,kilometersTraveled);

                                    transports[contador]= newTaxi;
                                    contador++;
                                System.out.println("¡Taxi ingresado con exito!");
                                } catch (IllegalArgumentException e) {
                                    System.out.println("ERROR: "+ e.getMessage());
                                }
                                break ;
                                
                            case 2:
                                System.out.println("\n--Registrando Bote --");
                                
                                System.out.println("Ingrese el precio base");
                                float basePrice2= sc.nextFloat();
                                System.out.println("Ingrese el valor por kilometro");
                                float kilometerValue2= sc.nextFloat();
                                System.out.println("Ingrese los kilometros recorridos");
                                float kilometersTraveled2= sc.nextFloat();
                                System.out.println("Ingrese el coste de embarque");
                                float shippingCost= sc.nextFloat();

                                try{
                                    Boat newBoat= new Boat(id,basePrice2,kilometerValue2,kilometersTraveled2,shippingCost);
                                    transports[contador]= newBoat;
                                    contador++;

                                    System.out.println("¡Bote creado con exito!");
                                
                                } catch(IllegalArgumentException e){
                                    System.out.println("ERROR: "+ e.getMessage());
                                }
                                break;
                            case 3:
                                System.out.println("\n--Registrando Avion --");
                                
                                System.out.println("Ingrese el precio base");
                                float basePrice3= sc.nextFloat();
                                System.out.println("Ingrese los kilogramos transportados");
                                float kilogramsTransported2= sc.nextFloat();
                                System.out.println("Ingrese el valor por kilogramo");
                                float valuePerKilogram= sc.nextFloat();
                                
                                try{
                                    Airplane newAirplane= new Airplane(id, basePrice3, kilogramsTransported2, valuePerKilogram);

                                    transports[contador]= newAirplane;
                                    contador++;
                                    System.out.println("¡Avion registrado con exito!");
                                }catch(IllegalArgumentException e){
                                    System.out.println("ERROR: "+ e.getMessage());
                                }
                                break;
                            case 4: 
                                System.out.println("\n--Registrando Tren --");
                                
                                System.out.println("Ingrese el valor por kilometro");
                                float kilometerValue3= sc.nextFloat();
                                System.out.println("Ingrese los kilogramos transportador");
                                float kilogramsTransported3= sc.nextFloat();
                                System.out.println("Ingrese el valor por kilogramo");
                                float valuePerKilogram2= sc.nextFloat();

                                try{
                                    Train newTrain= new Train(id, kilometerValue3, kilogramsTransported3, valuePerKilogram2);

                                    transports[contador]= newTrain;
                                    contador++;
                                    System.out.println("¡Tren registrado con exito!");
                                }catch(IllegalArgumentException e){
                                    System.out.println("ERROR: "+ e.getMessage());
                                }
                                break;
                            case 5:
                                System.out.println("\n--Registrando Bus --");
                                
                                System.out.println("Ingrese el valor fijo del pasaje");
                                float fixedValue= sc.nextFloat();
                                System.out.println("Ingrese la cantidad de pasajeros transportados");
                                int passengersTransported= sc.nextInt();
                                
                                try{
                                    Bus newBus= new Bus(id, fixedValue, passengersTransported);

                                    transports[contador]= newBus;
                                    contador++;
                                    System.out.println("¡Bus registrado con exito!");
                                } catch(IllegalArgumentException e){
                                    System.out.println("ERROR: "+ e.getMessage());
                                }
                                break;
                            default:
                                System.out.println("Ingrese una opción valido");
                                break;    

                        }
                    break;
                case 2:
                    System.out.println("\n--- LISTA DE VEHÍCULOS ---");
                    for(int i=0; i<contador; i++){
                        System.out.println(" \n Vehiculo numero: "+ (i+1));
                        System.out.println("Id del vehiculo: "+ transports[i].getId());
                        System.out.println("Tipo: "+ transports[i].getClass().getSimpleName());
                        System.out.println("Tarifa Calculada: "+ transports[i].calculateTotalCost());
                    }
                    break;
                case 3:
            
                    System.out.println("\n--- BUSCAR POR ID ---");
                    System.out.println("Ingrese el Id que desea buscar");
                    int idBuscado= sc.nextInt();
                    boolean bandera=false;
                    int i=0;
                    for(i=0; i<contador;i++){
                        if(idBuscado==transports[i].getId()){
                            bandera=true;
                            System.out.println("\n informacion del vehiculo");
                            System.out.println("Id registrado: "+transports[i].getId());
                            System.out.println("Tipo: "+ transports[i].getClass().getSimpleName());
                            System.out.println("Costo total: " + transports[i].calculateTotalCost());
                            break;
                        }
                    }
                    if (bandera==false){
                        System.out.println("ID no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("\n--- TOTAL TARIFAS ---");
                    float totalFares=0;
                    for(int j=0; j<contador; j++){
                        totalFares+= transports[j].calculateTotalCost();

                    }
                    System.out.println("La suma de las tarifas de cada vehiculo es: "+ totalFares);
                    break;
                case 5:
                    System.out.println("\nCerrando el sistema... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("\nOpción inválida. Por favor, intenta de nuevo.");
            }

        } while (opcion != 5); // El ciclo da vueltas MIENTRAS la opción NO sea 5

        sc.close(); // Buena práctica: cerrar el scanner al final
    }
}