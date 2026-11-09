package Domain;

public class Train extends TransportServices {
    private float kilometerValue;
    private float kilometersTraveled;
    private float ferroviareCost;

    public float getKilometerValue(){
        return kilometerValue;
    }
    public void setKilometerValue(float newKilometerValue){
        if(newKilometerValue<0){
            throw new IllegalArgumentException("The kilometer value must be a possitive number");
        }
        this.kilometerValue= newKilometerValue;
    }

    public float getKilometersTraveled(){
        return kilometersTraveled;
    }
    public void setKilometersTraveled(float newKilometersTraveled){
        if(newKilometersTraveled<0){
            throw new IllegalArgumentException("The kilometers traveled must be a possitive number");
        }
        this.kilometersTraveled= newKilometersTraveled;
    }

    public float getFerroviareCost(){
        return ferroviareCost;
    }
    public void setFerroviareCost(float newFerroviareCost){
        if (newFerroviareCost<0){
            throw new IllegalArgumentException("The ferroviare cost must be a possitive number");
        }
        this.ferroviareCost= newFerroviareCost;
    }

    public Train(int id, float kilometerValue, float kilometersTraveled, float ferroviareCost){
        super(id);
        setKilometerValue(kilometerValue);
        setKilometersTraveled(kilometersTraveled);
        setFerroviareCost(ferroviareCost);
    }
    @Override
    public float calculateTotalCost(){
        return getFerroviareCost()+(getKilometerValue() * getKilometersTraveled());
    }
}
