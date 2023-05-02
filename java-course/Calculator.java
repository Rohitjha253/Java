public class Calculator {
    
    // data members(properties) and member functions(behaviour)

    String calculatorName;
    String color;



    // method overloading
    public int add(int n1, int n2) {
        return n1+n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1+n2+n3;
    }

    public int add(int n1, int n2, int n3, int n4) {
        return n1+n2+n3+n4;
    }
}
