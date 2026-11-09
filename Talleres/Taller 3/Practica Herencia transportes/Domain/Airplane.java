package Domain;

public class Airplane extends TransportServices {
    private float basePrice;
    private float kilogramsTransported;
    private float valuePerKilogram;

    public float getBasePrice(){
        return basePrice;
    }
    public void setBasePrice(float newBasePrice){
        if(newBasePrice<0){
            throw new IllegalArgumentException("The base price must be a possitive number");
        }
        this.basePrice= newBasePrice;
    }

    public float getKilogramsTransported(){
        return kilogramsTransported;
    }
    public void setKilogramsTransported(float newKilogramsTransported){
        if (newKilogramsTransported<0){
            throw new IllegalArgumentException("The kilograms transported must be a possitive number");
        }
        this.kilogramsTransported=newKilogramsTransported;
    }

    public float getValuePerKilogram(){
        return valuePerKilogram;
    }
    public void setValuePerKilogram(float newValuePerKilogram){
        if (newValuePerKilogram<0){
            throw new IllegalArgumentException("The value per kilogram must be a possitive number");
        }
        this.valuePerKilogram= newValuePerKilogram;
    }

    public Airplane(int id, float basePrice, float kilogramsTransported, float valuePerKilogram){
        super(id);
        setBasePrice(basePrice);
        setKilogramsTransported(kilogramsTransported);
        setValuePerKilogram(valuePerKilogram);
    }

    @Override
    public float calculateTotalCost(){
        return getBasePrice()+(getKilogramsTransported()* getValuePerKilogram());
    }
}
