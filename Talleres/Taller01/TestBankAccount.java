public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();

        System.out.println("=== CONFIGURACIÓN DE CUENTA ===");
        
        
        if (account1.setAccountHolder("Carlos Perez")) {
            System.out.println("Titular asignado: " + account1.getAccountHolder());
        } else {
            System.out.println("Error al asignar titular.");
        }

        
        if (account1.setAccountNumber("CTA-98765")) {
            System.out.println("Numero de cuenta asignado: " + account1.getAccountNumber());
        } else {
            System.out.println("Error al asignar numero de cuenta.");
        }

        
        if (account1.setAccountNumber("CTA-00000")) {
            System.out.println("EXITO: El sistema permitio cambiar el numero de cuenta.");
        } else {
            System.out.println("ERROR: Se rechazo el cambio de numero de cuenta.");
        }

        System.out.println("\n=== PRUEBAS DE DEPÓSITO ===");

        
        if (account1.deposit(-50000.0)) {
            System.out.println("Error: Deposito invalido aceptado.");
        } else {
            System.out.println("Exito: Se rechazo el deposito con valor negativo.");
        }

        
        if (account1.deposit(100000.0)) {
            System.out.println("Exito: Deposito de $100000 aceptado.");
        } else {
            System.out.println("Error al procesar deposito valido.");
        }
        System.out.println("Saldo actual: $" + account1.getBalance());

        System.out.println("\n=== PRUEBAS DE RETIRO ===");

        
        if (account1.withdraw(0.0)) {
            System.out.println("Error: Retiro con monto cero aceptado.");
        } else {
            System.out.println("Exito: Se rechazo el retiro con monto cero.");
        }

        
        if (account1.withdraw(150000.0)) {
            System.out.println("Error: Retiro aceptado sin fondos suficientes.");
        } else {
            System.out.println("Exito: Retiro rechazado por fondos insuficientes.");
        }

        
        if (account1.withdraw(40000.0)) {
            System.out.println("Exito: Retiro de $40000 procesado correctamente.");
        } else {
            System.out.println("Error al procesar retiro valido.");
        }

        
        System.out.println("\nSaldo final disponible: $" + account1.getBalance());
    }
}