package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{
    String name;
    int age;

    Employee(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
        return (this.age+"--->"+this.name);
    }
     @Override
    public int compareTo(Employee o) {
        if(this.age>o.age)
        return 1;
        else
        return -1;
    } 
   
    
   
}

public class ComparatorDemo {
    public static void main(String[] args) {

        Comparator<Employee> comp=(Employee o1, Employee o2)-> {
               if(o2.age<o1.age)
               return 1;
               else
               return -1;
            };

        List<Employee> list=new ArrayList<>();
        list.add(new Employee("Rohit", 23));
        list.add(new Employee("nkdebug", 10));
        list.add(new Employee("pkdebug", 5));
        list.add(new Employee("skdebug", 18));
        list.add(new Employee("ckdebug", 50));

        Collections.sort(list);
        System.out.println(list);
    }
}
