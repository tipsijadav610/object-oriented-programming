public class Main{
	public static void main(String[] args){
	   Human tipsi = new Human(22, "Tipsi", 1000, false);
	   Human random = new Human(75, "Random", 1000000, true);
	   
	   System.out.println(Human.population);
	   
	   fun1();
	   
	   Main obj = new Main();
	   obj.fun2();
	}
	
	static void fun1(){
	    Main obj = new Main();
	    obj.greeting();
	}
	
	void fun2(){
	    greeting();
	}
	
	void greeting(){
	   System.out.println("Hello World!!");
	}
}

class Human{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static {
        population = 100;
    }

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        
        Human.population += 1;
    }
    
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }
}