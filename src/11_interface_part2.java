public class Main{
	public static void main(String[] args){
	    Person person = new Person();
	    
	    person.fun();
	    person.greet();
	    A.handshake();
	}
}

interface A{
    // static interface should always have a body
    // as static method cannot be overridden
    // call it via interface name
    static void handshake(){
        System.out.println("Hey! I am doing handshake");
    }
    
    public void fun();
}

interface B extends A{
    public void greet();
}

class Person implements B{
    @Override
    public void fun(){
        System.out.println("I am having fun");
    }
    
    @Override
    public void greet(){
        System.out.println("How you doing?");
    }
}