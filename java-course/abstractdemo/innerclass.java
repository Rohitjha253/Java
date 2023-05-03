package abstractdemo;



class A{
    public void display(){
        System.out.println("display function");
    }

    class B{
        String Name;
        String type;
        public void show(){
            System.out.println(Name+" "+type);
        }
    }
}

public class innerclass {
    public static void main(String[] args) {
        A obj=new A();
        A.B ob=obj.new B();
        obj.display();
        ob.show();
        ob.Name="ABCD";
        ob.type="Unknown";
        ob.show();
    }
}
