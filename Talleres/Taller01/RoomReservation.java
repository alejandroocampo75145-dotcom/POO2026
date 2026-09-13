public class RoomReservation {
    private String guest = "";
    private String roomNumber = "";
    private int numberOfNights = 0;
    private double pricePerNight = 0.0;

    
    public boolean setGuest(String newGuest) {
        if (newGuest==null || newGuest.isEmpty()){
            return false;
        }
        else{
            this.guest=newGuest;
            return true;
        }
    }

    public String getGuest() {
        return guest;
    }

    
    public void setRoomNumber(String newRoomNumber) {
        this.roomNumber = newRoomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    
    public boolean setNumberOfNights(int newNumberOfNights) {
        if(newNumberOfNights>0){
            this.numberOfNights=newNumberOfNights;
            return true;
        }
        else{
            return false;
        }
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    
    public boolean setPricePerNight(double newPricePerNight) {
        if(newPricePerNight>0){
            this.pricePerNight= newPricePerNight;
            return true;
        }
        else{
            return false;
        }
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    
    public double getTotalCost() {
        return this.numberOfNights * this.pricePerNight;
    }
}
