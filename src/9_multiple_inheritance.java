public class Main
{
	public static void main(String[] args) {
		Car car = new Car();
		
		car.start();
		car.accelerate();
		car.brake();
		car.accelerate();
		car.stop();
		
		// Same rules are applied here
        // Engine car = new Car();
        // car.start();
        // car.accelerate();
        // car.stop();
	}
}

interface Engine{
    public void start();
    public void stop();
    public void accelerate();
}

interface Brake{
    public void brake();
}

interface Media{
    public void start();
    public void stop();
}

class Car implements Engine, Brake{
    @Override
    public void start(){
        System.out.println("I start engine like a normal car");
    }
    
    @Override
    public void stop(){
        System.out.println("I stop engine like a normal car");
    }
    
    @Override
    public void accelerate(){
        System.out.println("I accelerate like a normal car");
    }
    
    @Override
    public void brake(){
        System.out.println("I brake like a normal car");
    }
}