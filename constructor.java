class Employee {
    int id;
    String name;
    String role;
    double salary;
    String company;

    // Constructor to initialize the Employee object
    Employee(int id, String name, String role, double salary, String company) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.company = company;
    }

    // Method to display employee details
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + company);
        System.out.println();
    }
}
class EmpData {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee e1 = new Employee(266, "Mounika", "Developer", 60000.9, "Wipro");
        Employee e2 = new Employee(278, "Niharika", "Manager", 50000.9, "Wipro");

        // Displaying employee details
        e1.display();
        e2.display();
    }
}
