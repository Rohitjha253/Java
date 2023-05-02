
class Employee{
    private String id;
    private String Name;
    private String Designation;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getDesignation() {
        return Designation;
    }
    public void setDesignation(String designation) {
        Designation = designation;
    }
    public void display(){
        System.out.println(id+" "+Name+" "+Designation);
    }
}

public class objArray {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.setId("1");
        emp1.setName("Rohit");
        emp1.setDesignation("Software Engineer");
        emp1.display();
        

    }
}
