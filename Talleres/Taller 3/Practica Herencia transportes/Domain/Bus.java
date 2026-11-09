package Domain;

public class Bus extends TransportServices {
    private float fixedValue;
    private int passengersTransported;
    
    public float getFixedValue(){
        return fixedValue;
    }
    public void setFixedValue(float newFixedValue){
        if (newFixedValue<0){
            throw new IllegalArgumentException("The fixed value must be a possitive number");
        }
        this.fixedValue= newFixedValue;
    }

    public int getPassengersTransported(){
        return passengersTransported;
    }
    public void setPassengerTransported(int newPassengerTransported){
        if (newPassengerTransported<0){
            throw new IllegalArgumentException("The passengers transported must be a possitive number");
        }
        this.passengersTransported= newPassengerTransported;
    }
    
    
    
    public Bus(int id, float fixedValue, int passengersTransported){
        super(id);
        setFixedValue(fixedValue);
        setPassengerTransported(passengersTransported);
        
    }

    @Override
    public float calculateTotalCost(){
        return getFixedValue()*getPassengersTransported();
    }
}
