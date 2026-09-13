public class BankAccount {
    // Atributos privados
    private String accountNumber = "";
    private String accountHolder = "";
    private double balance = 0.0;

    
    public boolean setAccountNumber(String newAccountNumber) {
    
    if (newAccountNumber == null || newAccountNumber.trim().isEmpty()) {
        return false;
    }
    
    if (!this.accountNumber.isEmpty()) {
        return false; 
    }
    
    this.accountNumber = newAccountNumber;
    return true;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Account Holder 
    public boolean setAccountHolder(String newAccountHolder) {
        if((newAccountHolder==null) || (newAccountHolder.trim().isEmpty())){
            
            return false;

        }
        else{
            this.accountHolder= newAccountHolder;
            return true;
        }
    }
    

    public String getAccountHolder() {
        return accountHolder;
    }

    // Saldo y Transacciones 
    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if(amount>0){
            this.balance+= amount;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if((amount>0) && (amount<=this.balance)){
            this.balance-=amount;
            return true;
        }
        else{
            return false;
        }
    }
}
