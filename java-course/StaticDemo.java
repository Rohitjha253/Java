class Car {
    String brandName;
    long price;
    static String type;

  

    public Car() {
        type = "Sedan";
        System.out.println("in constructor block");
    } 

    static {
        type = "Sedan";
        System.out.println("in static block");
    }

    {
        System.out.println("in init block");
    }
    

    public void display() {
        System.out.println(brandName + "->" + price + "->"+ type);
    }

    public static void displayType() {
        System.out.println(type + " " + "in static method");
    }
}



public class StaticDemo {
    public static void main(String[] args) throws ClassNotFoundException {


        Class.forName("Car");
    


        /*
         * 
         *         // 1000
        Car obj1 = new Car();
        obj1.brandName = "Maruti";
        obj1.price = 1000000;
    

        // 2000
        Car obj2 = new Car();
        obj2.brandName = "Hyundai";
        obj2.price = 1500000;


        obj1.display();
        obj2.display();
         * 
         * 
         * 
         */


         Car.displayType();
        
    }
    
}
