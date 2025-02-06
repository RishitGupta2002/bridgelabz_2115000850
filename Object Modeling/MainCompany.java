import java.util.ArrayList;
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }
}

class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public String getName() {
        return name;
    }

    public void closeCompany() {
        departments.clear();
        System.out.println(name + " has been closed.");
    }
}

public class MainCompany {
    public static void main(String[] args) {
        Company company = new Company("XYZ Corporation");
        Department department1 = new Department("HR");
        Department department2 = new Department("IT");

        Employee employee1 = new Employee("Alice");
        Employee employee2 = new Employee("Bob");

        department1.addEmployee(employee1);
        department2.addEmployee(employee2);

        company.addDepartment(department1);
        company.addDepartment(department2);

        System.out.println("Company has departments: " + company.getDepartments().size());

        company.closeCompany();
        System.out.println("Company after closing has departments: " + company.getDepartments().size());
    }
}
