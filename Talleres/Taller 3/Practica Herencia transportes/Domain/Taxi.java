package Domain;

public class Taxi extends TransportServices {
    private float basePrice;
    private float kilometerValue;
    private float kilometersTraveled;

    public float getBasePrice(){
        return basePrice;
    }
    public void setBasePrice(float newBasePrice){
        if (newBasePrice<0){
            throw new IllegalArgumentException("The base price must be a possitive number");
        }
        this.basePrice= newBasePrice;
    }
    public float getKilometerValue(){
        return kilometerValue;
    }
    public void setKilometerValue(float newKilometerValue){
        if(newKilometerValue<0){
            throw new IllegalArgumentException("Kilometer value must be a possitive number");
        }
        this.kilometerValue= newKilometerValue;
    }
    public float getKilometersTraveled(){
        return kilometersTraveled;
    }
    public void setKilometersTraveled(float newKilometersTraveled){
        if (newKilometersTraveled<0){
            throw new IllegalArgumentException("KilometersTraveled must be a possitive number");
        }
        this.kilometersTraveled= newKilometersTraveled;
    }

    public Taxi(int id, float basePrice, float kilometerValue, float kilometersTraveled){
        super(id);
        setBasePrice(basePrice);
        setKilometerValue(kilometerValue);
        setKilometersTraveled(kilometersTraveled);
    }

    @Override
    public float calculateTotalCost(){
        return getBasePrice()+(getKilometerValue() * getKilometersTraveled());
    }





}
