package Clases_Abstractas;

public class Ellipse extends Circle {
    private float radius2;

    public Ellipse(int newId,int newX, int newY, float newRadius, float newRadius2){
        super(newId,newX,newY,newRadius);
        setRadius2(newRadius2);
    }

    public void setRadius2(float newRadius2){
        if(newRadius2<=0){
            throw new IllegalArgumentException("The radius must be a possitive");
        }
        this.radius2=newRadius2;
    }

    public float getRadius2(){
        return radius2;
    }

    public float calculatePerimeter(){
        return (float)(Math.PI * (3.0f*(super.getRadius()+getRadius2())) - (float)Math.sqrt((3.0f*getRadius2()+getRadius())*(getRadius2()+3.0f*(getRadius()))));
    } 
    
    public float calculateArea(){
        return (float) (Math.PI * (getRadius()) * getRadius2());
    }
} 
