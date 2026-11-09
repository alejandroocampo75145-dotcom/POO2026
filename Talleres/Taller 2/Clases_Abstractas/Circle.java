package Clases_Abstractas;

public class Circle extends Shape {
    private float radius;

    public Circle(int newId, int newX, int newY, float newRadius){
        super(newId,newX,newY);
        setRadius(newRadius);
    }
    
    public void setRadius(float newRadius) {
        if( newRadius <=0){
            throw new IllegalArgumentException("Radius must be a possitive number");
        }
        this.radius=newRadius;
    }
    public float getRadius(){
        return radius;
    }

    @Override 
    public float calculatePerimeter(){
        
        return  2.0f * (float)(Math.PI) * (getRadius());
    }

    @Override 
    public float calculateArea(){

        return (float)(Math.PI * Math.pow(getRadius(), 2.0f));
    }


}
