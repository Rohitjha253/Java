class Employee {
    int eId;
    String name;
    int salary;


}



public class ArrayDemo {
    public static void main(String[] args) {
        
        int nums[] = {1, 9, 10, 16, 21};

        int nums1[] =new int[10];

        for(int i=0;i< nums.length;i++) {
           // System.out.println(nums[i]);
        }



        Employee e1 = new Employee();
        e1.eId= 1;
        e1.name = "nkdebug";
        e1.salary = 100000;

        
        Employee e2 = new Employee();
        e2.eId= 2;
        e2.name = "rkdebug";
        e2.salary = 1000000;

        
        Employee e3 = new Employee();
        e3.eId= 3;
        e3.name = "pkdebug";
        e3.salary = 10000000;

        Employee empArr[] = new Employee[3];
        empArr[0] = e1;
        empArr[1] = e2;
        empArr[2] = e3;

        for (Employee employee : empArr) {
            System.out.println(employee);
            System.out.println(employee.eId + " " + employee.name + " "+ employee.salary);
        }

    }
}
