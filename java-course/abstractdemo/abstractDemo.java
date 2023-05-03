package abstractdemo;

abstract class car{
    
    public abstract void drive();

    public abstract void transmission();

    public void showAC(){
        System.out.println("AC on");
    }
}

class Maruti extends car{

    @Override
    public void drive() {
        System.out.println("Maruti Drive");
    }

    @Override
    public void transmission(){
        System.out.println("Manual");
    }

    public void showAC(){
        System.out.println("working");
    }

}

class Hyndai extends car{

    @Override
    public void drive() {
        System.out.println("Hyndai Drive");
    }

    @Override
    public void transmission(){
        System.out.println("Automatic");
    }
    
}

public class abstractDemo {
    public static void main(String[] args) {
        car m=new Maruti();
        car h=new Hyndai();

        m.drive();
        m.showAC();
        m.transmission();

        h.drive();
        h.showAC();
        h.transmission();

    }
}
