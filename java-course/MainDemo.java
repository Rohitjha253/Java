


public class MainDemo {
    public static void main(String[] args) {
        
        int num1 = 3;
        int num2 = 5;

        Calculator calc = new Calculator();
        calc.calculatorName = "nkdebug";
        calc.color= "black";
       
        int result = calc.add(num1, num2);

        int result1 = calc.add(num1, num2, 5, 7);

        int result2 = calc.add(num1, num2, 4);
        System.out.println(result + " " + calc.calculatorName);
        System.out.println(result1 + " " + calc.calculatorName);
        System.out.println(result2 + " " + calc.calculatorName);


        int num[] = {6,9,10};

        int numArr[] = new int[10];

    }
}
