class Employee {
    private String name;
    private int salary;



    Employee() {

    }

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        
        Employee e = new Employee("nkdebug", 1000);
      //  e.name = "nkdebug";
      //  e.salary = 100000;
     // e.setName("nkdebug");
    //  e.setSalary(100000);
    System.out.println(e);
      System.out.println(e.getName());

    }
}
