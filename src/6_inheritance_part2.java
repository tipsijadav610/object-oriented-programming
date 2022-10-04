public class Main{ 
	public static void main(String[] args){
	    Box box1 = new Box(2, 3, 4);
	    BoxWeight box2 = new BoxWeight(2, 3, 4, 20);
	    BoxPrice box3 = new BoxPrice(4, 20, 100);
	    BoxColor box4 = new BoxColor(2, 3, 4, 20, "Red");

	    System.out.println(box4.l);
	    System.out.println(box4.h);
	    System.out.println(box4.w);
	    System.out.println(box4.weight);
	    System.out.println(box4.color);
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
        
        this.weight = weight;
    }
    
    BoxWeight(BoxWeight old){
        super(old);
        
        this.weight = old.weight;
    }
}

class BoxPrice extends BoxWeight{
    double price;
    
    BoxPrice(){
        super();
        
        price = -1;
    }

    BoxPrice(double side, double weight, double price){
        super(side, weight);
        
        this.price = price;
    }
    
    BoxPrice(double l, double h, double w, double weight, double price){
        super(l, h, w, weight);
        
        this.price = price;
    }
    
    BoxPrice(BoxPrice old){
        super(old);
        
        this.price = old.price;
    }
}

class BoxColor extends BoxWeight{
    String color;
    
    BoxColor(){
        super();
        
        color = null;
    }

    BoxColor(double side, double weight, String color){
        super(side, weight);
        
        this.color = color;
    }
    
    BoxColor(double l, double h, double w, double weight, String color){
        super(l, h, w, weight);
        
        this.color = color;
    }
    
    BoxColor(BoxColor old){
        super(old);
        
        this.color = old.color;
    }
}