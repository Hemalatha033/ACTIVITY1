package management;

import company.Employee;  // Import Employee class

public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void showManagerInfo() {
        showInfo();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager("Varun", 80000, "IT");
        m.showManagerInfo();
    }
}
