class Employee{
    String name;
    int age;
    String department;
    double salary;
    Employee(){
        this.name="Thanga";
        this.age=21;
        this.department="Tester";
        this.salary=20000;
        this.printInfo();
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(department);
        System.out.println(salary);
    }
}
public class Main
{
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.name="Perumal";
		e1.age=25;
		e1.department="Developer";
		e1.salary=35000;
		e1.printInfo();
	}
}
