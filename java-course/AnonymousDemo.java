class A {
    public A() {
        System.out.println("constructor");
    }

    public void show() {
        System.out.println("in show method");
    }
}




public class AnonymousDemo {

    public static void main(String[] args) {


        new A().show(); // anonymous object
        new A().show(); 
        //object.show();
    
    }



}
