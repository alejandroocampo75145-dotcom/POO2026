package Clases_Abstractas;

public class Main {
    
    public static void main(String[] args){
        Shape[] shapes= new Shape[ ]{
            new Triangle(1, 3, 1, 13.2f, 9.8f, 10.0f),
            new Square(2,25,200,1.5f),
            new Ellipse(3,8,4,23.0f,6.7f),
            new Rectangle(4, 2, 7, 4.5f, 36.8f),
            new Circle(5,7,8,78.9f),
            new Circle(21,56,43,67.0f),
            new Triangle(6, 10, 15, 3.0f, 4.0f, 5.0f),
            new Triangle(7, 2, 2, 7.5f, 7.5f, 10.0f),
            new Triangle(8, 1, 1, 6.0f, 6.0f, 6.0f),
            new Triangle(9, 3, 9, 12.0f, 16.0f, 20.0f),

            
            new Square(10, 5, 12, 4.2f),
            new Square(11, 14, 9, 10.0f),
            new Square(12, 7, 7, 8.8f),
            new Square(13, 0, 0, 100.5f),

            
            new Rectangle(14, 30, 40, 12.0f, 5.5f),
            new Rectangle(15, 8, 8, 20.0f, 10.0f),
            new Rectangle(16, 11, 22, 6.4f, 9.1f),

            
            new Circle(17, 100, 100, 25.4f),
            new Circle(18, 12, 14, 5.5f),
            new Circle(19, 3, 45, 0.8f),

            
            new Ellipse(20, 7, 98, 15.5f, 8.2f),
            new Ellipse(22, 50, 50, 100.0f, 50.0f),
            new Ellipse(23, 10, 15, 12.3f, 4.5f)
        };

        for (int i=0; i<shapes.length; i++)  { 
            System.out.println("Datos de la figura "+(i+1));
            
            System.out.println("Tipo de figura: "+ shapes[i].getClass().getSimpleName());
            
            System.out.println("El area es: "+ shapes[i].calculateArea());
            System.out.println("El perimetro es: "+ shapes[i].calculatePerimeter());
            System.out.println("-------------------------------------------");
    
        
        }
        

    }
}    
