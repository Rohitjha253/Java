package abstractdemo;

interface Processor{
    void processordetail();
}

interface VendorDetails{
    void vendordetails();
}

interface machine extends Processor,VendorDetails{
    public void code();
}


class Programmer{
    public void buildApp(machine machine)
    {
        machine.code();
        machine.processordetail();
        machine.vendordetails();
    }
}

class Desktop implements machine{

    @Override
    public void code() {
        System.out.println("code---->compile---->execute--->Desktop");
    }

    @Override
    public void processordetail() {
        System.out.println("Intel");
    }

    @Override
    public void vendordetails() {
        System.out.println("Dell");
    }

}

class Laptop implements machine{
    @Override
    public void code(){
        System.out.println("code--->compile--->execute--->Laptop");
    }

    @Override
    public void processordetail() {
        System.out.println("AMD");
    }

    @Override
    public void vendordetails() {
        System.out.println("HP");
    }
}


public class interfaceDemo {
    public static void main(String[] args) {
        machine d=new Desktop();
        machine l=new Laptop();
        Programmer p=new Programmer();
        p.buildApp(l);
        p.buildApp(d);
    }
}
