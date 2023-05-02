class car{
   static String type;
    String name;
   static{
    type="Sedan";
   }
   car(){
    type="hatchback";
   }
   public void display(){
      System.out.println(type);
   }
}
public class staticDemo {
    public static void main(String[] args) {
      car c=new car();
      c.display();
    }
}
