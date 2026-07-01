package Projects;
/*Employee Management System ⭐⭐⭐⭐☆

Very common in interviews.

Features
Add Employee
Remove Employee
Search Employee
Update Employee
Highest Salary
Department-wise Employees
Sort by Salary
Sort by Name


Concepts:-
ArrayList
HashMap
Comparator
Inheritance
 */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {

    }
}

class Management {
    private List<employee> empList = new ArrayList<>();
    private HashMap<String , ArrayList<employee>> deptWise = new HashMap<String ,ArrayList<employee>>();

    protected void addEmp(employee e) {
        empList.add(e);
        System.out.println("Added the Employee details");
    }

    protected void removeEmp(int id) {
        for (employee emp : empList) {
            if (emp.id == id) {
                empList.remove(emp);
                System.out.println("Removed the Employee Successfull 🎉");
                break;
            }
        }
        System.out.println("Employee not found with the employee id ❌");
    }

    protected employee Search(int id) {
        for (employee emp : empList) {
            if (emp.id == id) {
                System.out.println("the Employee id Matched with name" + emp.name + " salary => " + emp.salary + " having dept " + emp.dept);
                return emp;
            }
        }
        System.out.println("Employee not found with the employee id ❌");
        return null;
    }

    protected employee updateEmp(int id, String name, String dept, int salary) {

        for (employee emp : empList) {
            if (emp.id == id) {
                System.out.println("the Employee id Matched and modified with name" + name + " salary => " + salary + " having dept " + dept);
                emp.name = name;
                emp.salary = salary;
                emp.dept =dept;
                return emp;

            }
        }
        System.out.println("Employee not found with the employee id ❌");
        return null;
    }

    protected int Highest(){
        empList.sort(new mySalaryComposarator());
        return empList.getFirst().salary;
    }

    protected HashMap<String, ArrayList<employee>> departmentWise() {

        for (employee emp : empList) {

            if (deptWise.containsKey(emp.dept)) {
                deptWise.get(emp.dept).add(emp);
            } else {

                ArrayList<employee> list = new ArrayList<>();
                list.add(emp);

                deptWise.put(emp.dept, list);
            }
        }
        return deptWise;
    }

    protected List<employee> sortBySal(){
        empList.sort(new mySalaryComposarator());
        return  empList;
    }

    protected List<employee> sortByName(){
        empList.sort(new myNameComposarator());
        return  empList;
    }
}

class mySalaryComposarator implements Comparator<employee>{
    @Override
    public int compare(employee o1, employee o2) {
        return o2.salary - o1.salary;
    }
}

class myNameComposarator implements Comparator<employee>{
    @Override
    public int compare(employee o1, employee o2) {
        return o2.name.length() - o1.name.length();
    }
}

class employee{
    int id;
    String name;
    int salary;
    String dept;

    public employee(int id , String name , int salary , String dept){
        this.name = name ;
        this.id = id;
        this.salary = salary;
        this.dept = dept;
    }

}





