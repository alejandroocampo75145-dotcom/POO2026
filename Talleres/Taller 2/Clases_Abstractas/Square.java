package Clases_Abstractas;

public class Square extends Shape {
    private float side1;

    public Square(int newId, int newX, int newY, float newSide1) {
        super(newX, newY, newId);
        setSide1(newSide1); 
    }

    public void setSide1(float newSide1) {
        if (newSide1 <= 0) {
            throw new IllegalArgumentException("Side must be a positive number.");
        }
        this.side1 = newSide1;
    }

    public float getSide1() {
        return side1;
    }

    @Override
    public float calculateArea() {
        
        return getSide1() * getSide1(); 
    }

    @Override  
    public float calculatePerimeter() {
        
        return 4 * getSide1(); 
    }
}