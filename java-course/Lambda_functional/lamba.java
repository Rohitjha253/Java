package Lambda_functional;
@FunctionalInterface
interface P1{
    String display(String i,String j);
    
    
}


public class lamba {
    public static void main(String[] args) {
        P1 p=(String i,String j)->{System.out.println("Hello1"+" "+i+j);System.out.println("Hello2");return "hello";};
        String res=p.display("10","20000");
        System.out.println(res);
    }
}
