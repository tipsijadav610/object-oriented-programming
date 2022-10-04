public class Main{
	public static void main(String[] args){
		Student tipsi = new Student(15, "Tipsi", 95.6f);
		
		System.out.println(tipsi.roll_no);
		System.out.println(tipsi.name);
		System.out.println(tipsi.marks);
		
		Student A;
		
		for(int i=0 ; i < 1000000 ; i++){
		    A = new Student();
		}
	}
}

class Student{
    int roll_no;
    String name;
    float marks;
    
    public Student(){
        this.roll_no = 0;
        this.name = null;
        this.marks = 0f;
    }
    
    public Student(int roll_no, String name, float marks){
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }
    
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }
}