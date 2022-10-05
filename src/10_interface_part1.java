public class Main
{
	public static void main(String[] args){
	    NiceCar car = new NiceCar();
	    
	    car.start();
	    car.startMusic();
	    car.upgradeEngine(new ElectricEngine());
	    car.start();
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

class PowerEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Power engine start");
    }
    
    @Override
    public void stop(){
        System.out.println("Power engine stop");
    }
    
    @Override
    public void accelerate(){
        System.out.println("Power engine accelerate");
    }    
}

class ElectricEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Electric engine start");
    }
    
    @Override
    public void stop(){
        System.out.println("Electric engine stop");
    }
    
    @Override
    public void accelerate(){
        System.out.println("Electric engine accelerate");
    }    
}

class CarBrake implements Brake{
    @Override
    public void brake(){
        System.out.println("Car brake");
    }
}

class CDPlayer implements Media{
    @Override
    public void start(){
        System.out.println("Music start");
    }
    
    @Override
    public void stop(){
        System.out.println("Music stop");
    }
}

class NiceCar{
    private Engine engine;
    private Media player = new CDPlayer();
    private Brake brakes = new CarBrake();
    
    NiceCar(){
        engine = new PowerEngine();
    }
    
    NiceCar(Engine engine){
        this.engine = engine;
    }
    
    public void start(){
        engine.start();
    }
    
    public void stop(){
        engine.stop();
    }
    
    public void accelerate(){
        engine.accelerate();
    }
    
    public void carBrake(){
        brakes.brake();
    }
    
    public void startMusic(){
        player.start();
    }
    
    public void stopMusic(){
        player.stop();
    }
    
    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }
}