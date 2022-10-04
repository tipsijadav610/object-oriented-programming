public class Main{ 
	public static void main(String[] args){
	    Box box1 = new Box(4.6, 7.9, 9.6);
	    BoxWeight box2 = new BoxWeight(2, 3, 4, 20);
	    
	    System.out.println(box2.l + " " + box2.h + " " + box2.w + " " + box2.weight);
	    
	    Box box3 = new BoxWeight(2, 3, 4, 20);
	   // System.out.println(box3.weight); parent class can't access child class variables/methods;
	   // Parent class reference variable can contain child class object. But vice versa is not true. 
	   // When child class reference variable is given object of parent class, 
	   // then parent should have access to child class variables, thus that variables should be initialised, 
	   // but parent class reference variable can't access child class variables/methods, 
	   // so how will you call the constructor of child class.
	}
}

class Box{
    double l;
    double h;
    double w;
    
    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    
    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
}

class BoxWeight extends Box{
    double weight;
    
    BoxWeight(){
        super();

        this.weight = -1;
    }
    
    BoxWeight(double side, double weight){
        super(side);
        
        this.weight = weight;
    }
    
    BoxWeight(double l, double h, double w, double weight){
        super(l, h, w);
        
        // super.l = l;
        // super.h = h;
        // super.w = w;
        
        this.weight = weight;
    }
    
    BoxWeight(BoxWeight old){
        super(old);
        
        this.weight = old.weight;
    }
}