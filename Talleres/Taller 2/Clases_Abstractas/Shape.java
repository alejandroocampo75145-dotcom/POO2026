package Clases_Abstractas;

public abstract class Shape {
    private int x;
    private int y;
    private int id;
    

    public void  setX(int newX){
        this.x= newX;
        
    }
    public void setY(int newY){
        this.y = newY;
        
    }
    public int getY(){
        return y;
    }
    public int getX(){
        return x;
    }
    public String getCoordinates(){
        return "( "+ x + " , "+ y +")";
    }
    public void setId(int newId){
        if (newId<=0){
            throw new IllegalArgumentException("Id must be a possitive integer");
        }
        this.id= newId;
        
    }
    
    public Shape(int newX, int newY, int newId ){
        setX(newX);
        setY(newY);
        setId(newId);
    }

    
    public abstract float calculateArea();

    public abstract float calculatePerimeter();

    


}
