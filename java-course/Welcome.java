
public class Welcome {

	public static void main(String[] args) {


        // datatype variableName = initialization
        int a = 10;
        int b = 20;

        int sum = a + b;

        int sum1 = a % b;

        sum1 +=1; 

        sum++; // post increment (fetch the value and then increment)
        ++sum; // pre increment -> vice versa
        
        sum--; // decrement

        byte by = 127;

        long l =111111l;


        double marks = 9.40;
        float num = 4.3f;

        char ch = 'p'; // literals

        boolean flag = true;

		System.out.println(sum);


        // Primitive Data Types
        // int(int -> 4 bytes,long-8 bytes,byte-1 byte, short 2 bytes), float 4 bytes, double- 8 bytes, long, char- 2 bytes, boolean

        // -2^8 to +2^8-1 [-128 to 127]
        // String, BigDecimal


        // type conversion and casting
        byte b1 = 127;
        int a1 = 256;
       // b1 = a1; // int(4 byte) to byte(1 byte)
        b1 = (byte)a1; // int(4 byte) to byte(1 byte) -> casting
        a1 = b1; //(coversion)


        float f = 7.5f;
        int x = (int)f;


        // relational operators
        // < > = ==, !=, <=, >=

        // 10<50 -> True
        int x1 = 10;
        int x2= 8;

        boolean res = x1<x2;

        System.out.println(res);


        //Logical operators
        // x< y AND(&) OR ! -> NOT
        // && || !
        // res = x>y && h1 < h4

        // conditional statement

        int p1 = 10;
        if(p1 == 10) {
            // print 
        } else if(p1 < 10)
        {

            // print 

        }
        else {
            // print
        }

        // ternary statement
        int num5 = 10;
        String numType = num5%2 == 0 ? "Even": "Odd"; 


        // switch

        int day= 7;
        
        switch(day) {
            case 1: 
                System.out.println("Monday");
            case 2: 
                    System.out.println("Tues");
            case 3: 
                System.out.println("Wed");
            case 4: 
                System.out.println("Thur");
            case 5: 
                System.out.println("Fri");
            case 6: 
                System.out.println("Sat");

        }


        // For loop
        for(int i=0;i<5;i++) {
            System.out.println(i);
        }

        int j = 10;
        while(j > 5) {
            System.out.println(j);
            j++;
        }

        // Class 


	}

}
