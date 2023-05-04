package exceptiondemo;

import java.sql.SQLException;

class DemoException {

    public void show() {
        System.out.println("dfasdhjbasdhjbashjd");
    }
}

public class ExceptionDemo {
    public static void main(String[] args)  {
        int a = 10;
        int b = 0;

        DemoException de = new DemoException();
        de = null;

        int arr[] = new int[3];


        // throws 
        
 
        try
        {
           //  b = a/0;
             if(b == 0) {
                throw new NkdebugException("Invalid input");
             } 
            // arr[4] = 9;
          de.show();
        }
        catch(ArithmeticException e) {
            System.out.println("Bad code"+e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Bad code due array index"+ e);
        }
        catch(NullPointerException e) {
            System.out.println("Bad code due array index"+ e);
            
        }
        catch(Exception e) {
            System.out.println("Bad code due to exception"+e);
        }
        finally {
            // clean up code
            // always exectued
            
        }
        System.out.println(b);

        
    }
}

// compile time error // IDE
// Runtime Exception -> Exception Handling
// logical error