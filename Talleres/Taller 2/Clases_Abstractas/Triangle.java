package Clases_Abstractas;

public class Triangle extends Rectangle {
    
    private float side3;

    
    public Triangle(int newId, int newX, int newY, float newSide1, float newSide2, float newSide3) {
        
        super(newId, newX, newY, newSide1, newSide2); 
        
        
        setSide3(newSide3);
    }

    
    public void setSide3(float newSide3) {
        if (newSide3 <= 0) {
            throw new IllegalArgumentException("Side must be a positive number.");
        }
        this.side3 = newSide3;
    }

    public float getSide3() {
        return side3;
    }

    @Override
    public float calculatePerimeter() {
        
        return getSide1() + getSide2() + getSide3();
    }

    @Override
    public float calculateArea() {

        float s = calculatePerimeter() / 2.0f; 
        return (float) Math.sqrt(s * (s - getSide1()) * (s - getSide2()) * (s - getSide3()));
    }
}

    

