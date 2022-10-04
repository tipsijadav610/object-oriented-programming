public class Main{ 
	public static void main(String[] args){
	    Shapes shape = new Shapes();
	    Circle circle = new Circle();
	    Triangle triangle = new Triangle();
	    Square square = new Square();
	    
	    shape.area();
	    circle.area();
	    triangle.area();
	    square.area();
	    
	    // circle.area()/triangle.area()/square.area() will override parent class area() method
	    // reference variables determines what methods to access
	    // object determines which methods to access
	    // Shapes circle = new Circle();
	    // Shapes triangle = new Triangle();
	    // Shapes square = new Square();
	    
	    
	    // Overriding and Overloading doesn't apply to instance variables
	}
}

// To prevent inheritance
// Along with that, all the methods/variables inside the class will be final too
// final class Shapes

class Shapes{
    void area(){
        System.out.println("I am in shapes");
    }
    
    // Early binding
    // final void area(){
    //     System.out.println("I am in shapes");
    // }
    
    // Static methods can't be overridden, but it can be inherited
    // As static methods are independent of objects, and will run anyway
    // In simple terms ovveriding depends on objects and static doesn't
    // static void color(){
    //     System.out.println("Hey, I am colour X");
    // }
}

class Circle extends Shapes{
    void area(){
        System.out.println("Area is 0.5*r*r");
    } 
}

class Triangle extends Shapes{
    void area(){
        System.out.println("Area is 0.5*h*B");
    }    
}

class Square extends Shapes{
    void area(){
        System.out.println("Area is square of sides");
    }    
}