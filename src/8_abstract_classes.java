public class Main{
	public static void main(String[] args){
		Son son = new Son(59, 29);
		Daughter daughter = new Daughter(58, 28);
                        
                        // Polymorphism
                        // Parent daughter = new Daughter(58, 28);
		
		Parent.hello();
		
                        // son.career("doctor");
                        // son.partner("xyx", 27);
	            
	            daughter.normal();
	            
	            daughter.career("coder");
	            daughter.partner("abc", 26);
                        
                        // Parent is abstract, cannot be instantiated
                        // Because abstract methods can't be called, as it doesn't have a body
                        // Parent parent = new Parent(59);
        }
}

// As final class can't be inherited. Hence, final abstract class is not possible
// Because abstract needs to be inherited

// Abstract classes still doesn't support multiple inheritance
// Multiple Inheritance: one child inheriting multiple classes

abstract class Parent{
    int age;
    
    // Abstract constructors are not allowed
    // Parent(int age){
    //     this.age = age;
    // }
    
    // Abstract static method is not possible
    // Because abstract method need to be overridden
    // Static method cannot be overridden
    
    // As static method doesn't need objects access them
    static void hello(){
        System.out.println("Hey!!");
    }
    
    // Abstract class can have non abstract methods
    // It can be accessed through child class object
    void normal(){
        System.out.println("I am normal");
    }
    
    abstract void career(String name);
    
    abstract void partner(String name, int age);
}

class Son extends Parent{
    int age;
    
    Son(int parent, int age){
        this.age = age;
    }

    @Override
    void normal(){
        super.normal();
    }
    
    @Override
    void career(String name){
        System.out.println("I am going to be a " + name);
    }
    
    @Override
    void partner(String name, int age){
        System.out.println("I love " + name + "she is " + age);
    }
}

class Daughter extends Parent{
    int age;
    
    Daughter(int parent, int age){
        this.age = age;
    }
    
    @Override
    void normal(){
        super.normal();
    }
    
    @Override
    void career(String name){
        System.out.println("I am going to be a " + name);
    }
    
    @Override
    void partner(String name, int age){
        System.out.println("I love " + name + "he is " + age);
    }
}