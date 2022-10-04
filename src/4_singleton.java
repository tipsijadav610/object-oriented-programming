public class Main{ 
	public static void main(String[] args){
	    Singleton obj1 = Singleton.getInstance(7);
	    Singleton obj2 = Singleton.getInstance(8);
	    Singleton obj3 = Singleton.getInstance(9);
	    
	    System.out.println(obj1.a);
	    System.out.println(obj2.a);
	    System.out.println(obj3.a);
	}
}

class Singleton{
    int a;
    
    private Singleton(int a){
        this.a = a;
    }
    
    private static Singleton instance; 

    public static Singleton getInstance(int a){
        if(instance == null){
            instance = new Singleton(a);
        }
        
        return instance;
    }
}