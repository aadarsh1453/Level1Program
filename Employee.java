
public class Employee {
    
    String name;
    double salary;
    int id;

    public Employee(String name,double salary, int id){

        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public double yearlySalary(){
        return salary*12;
    }

    public void printEmployee(){
        System.out.println("Employee Name : " +name+ " Salary : " +salary );
    }

    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Tushar", 30000, 101);
        Employee emp2 = new Employee("Anjali", 32500, 102);
        emp1.printEmployee();
        System.out.println("Yearly Salary is : "+emp1.yearlySalary());
        emp2.printEmployee();
        System.out.println("Yearly Salary is : "+emp2.yearlySalary());

    }
}
