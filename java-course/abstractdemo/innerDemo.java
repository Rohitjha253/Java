package abstractdemo;

class P1{
    public void display() {
        System.out.println("Display called");
    }
    
}


public class innerDemo {
    public static void main(String[] args) {

        P1 p=new P1(){
            public void display() {
                System.out.println("display function Override");
            }
        };

        p.display();
      
        
    }
}
