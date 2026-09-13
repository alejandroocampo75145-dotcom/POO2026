public class TestRoomReservation {
    public static void main(String[] args) {
        RoomReservation reserva = new RoomReservation();

        System.out.println("=== PRUEBAS DE HUÉSPED ===");
        
        // Prueba 1: Huésped vacío 
        if (reserva.setGuest("")) {
            System.out.println("Error: El sistema permitio registrar un huesped vacio.");
        } else {
            System.out.println("Exito: Se rechazo correctamente el huesped vacio.");
        }

        // Prueba 2: Huésped válido
        if (reserva.setGuest("Juan Perez")) {
            System.out.println("Exito: Se registro el huesped " + reserva.getGuest() + ".");
        } else {
            System.out.println("Error al registrar un huesped valido.");
        }


        System.out.println("\n=== PRUEBAS DE NOCHES ===");
        
        // Prueba 3: Cero noches 
        if (reserva.setNumberOfNights(0)) {
            System.out.println("Error: El sistema acepto una reserva de 0 noches.");
        } else {
            System.out.println("Exito: Se rechazo la reserva de 0 noches.");
        }

        // Prueba 4: Noches válidas
        if (reserva.setNumberOfNights(3)) {
            System.out.println("Exito: Se registraron " + reserva.getNumberOfNights() + " noches.");
        } else {
            System.out.println("Error al registrar cantidad de noches validas.");
        }


        System.out.println("\n=== PRUEBAS DE PRECIO ===");
        
        // Prueba 5: Precio negativo 
        if (reserva.setPricePerNight(-50000.0)) {
            System.out.println("Error: El sistema acepto un precio negativo.");
        } else {
            System.out.println("Exito: Se rechazo el precio por noche negativo.");
        }

        // Prueba 6: Precio válido
        if (reserva.setPricePerNight(150000.0)) {
            System.out.println("Exito: Precio por noche registrado en $" + reserva.getPricePerNight() + ".");
        } else {
            System.out.println("Error al registrar un precio valido.");
        }


        System.out.println("\n=== CÁLCULO DE RESERVA TOTAL ===");
        
        // Asignación de habitación y cálculo final
        reserva.setRoomNumber("A-101");
        System.out.println("Habitacion asignada: " + reserva.getRoomNumber());
        System.out.println("Costo total por " + reserva.getNumberOfNights() + " noches: $" + reserva.getTotalCost());
    }
}
