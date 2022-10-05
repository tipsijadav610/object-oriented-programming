public class Main{
	public static void main(String[] args){
	    B obj = new B();
	    
	    System.out.println(obj.isOdd(3));
	}
}

class A{
    // nested interface can be public, private or protected
    // top level interface can only be public
    interface nestedInterface{
        public boolean isOdd(int num);
    }
}

class B implements A.nestedInterface{
    @Override
    public boolean isOdd(int num){
        if(num%2 == 1){
            return true;
        }
        
        return false;
    }
}