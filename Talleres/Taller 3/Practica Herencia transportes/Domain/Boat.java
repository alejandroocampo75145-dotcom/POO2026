package Domain;

public class Boat extends Taxi {
    private float shippingCost;

    public float getShippingCost(){
        return shippingCost;
    }
    public void setShippingCost(float newShippingCost){
        if (newShippingCost<0){
            throw new IllegalArgumentException("The shipping cost must be a possitive number");
        }
        this.shippingCost= newShippingCost;
    }

    public Boat(int id, float basePrice, float kilometerValue, float kilometersTraveled, float shippingCost){
        super(id,basePrice,kilometerValue,kilometersTraveled);
        setShippingCost(shippingCost);
    }

    @Override 
    public float calculateTotalCost(){
        return getBasePrice()+getShippingCost()+(getKilometerValue()*getKilometersTraveled());
    }
}
