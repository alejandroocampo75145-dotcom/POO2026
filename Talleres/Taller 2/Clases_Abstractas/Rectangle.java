package Clases_Abstractas;

public class Rectangle extends Square {
    private float side2;

    public Rectangle(int newId, int newX, int newY, float newSide1, float newSide2) {
        super(newId, newX, newY, newSide1); 
        setSide2(newSide2); 
    }

    
    public void setSide2(float newSide2) {
        if (newSide2 <= 0) {
            throw new IllegalArgumentException("Side must be a positive number.");
        }
        this.side2 = newSide2;
    }

    public float getSide2() {
        return side2;
    }

    @Override
    public float calculateArea() {
        
        return getSide1() * getSide2();
    }
    
    @Override 
    public float calculatePerimeter() {
        
        return 2 * (getSide1() + getSide2());
    }
}