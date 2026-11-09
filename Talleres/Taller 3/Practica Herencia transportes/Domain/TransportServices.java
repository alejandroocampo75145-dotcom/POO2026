package Domain;

public abstract class TransportServices  {
    private int id;

    public void setId(int newId){
        if (newId<0){
            throw new IllegalArgumentException("THe Id must be a possitive Number");
        }
        this.id= newId;
    }

    public int getId(){
        return id;
    }

    public abstract float calculateTotalCost();

    public TransportServices(int newId){
        setId(newId);
    }
}
