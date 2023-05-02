import java.util.ArrayList;
import java.util.List;


import com.nkdebug.core.AdvCalc;
import com.nkdebug.core.Calc;
import com.nkdebug.core.SampleData;

class CalcDemo1 extends SampleData {

    CalcDemo1 d = new CalcDemo1();
    

}

public class CalcDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();


        Calc obj = new Calc();
        System.out.println(obj.add(4,5));

        AdvCalc obj1 = new AdvCalc();
        System.out.println(obj1.sub(10, 5));
        
       obj1.display();




       CalcDemo1 sd = new CalcDemo1();
       System.out.println(sd.salary);

       

       TestData td = new TestData();
       System.out.println(td.salary);
        
    }
}
