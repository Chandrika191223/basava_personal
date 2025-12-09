
class Employee{
    String name;
    int salary;
    public void work(){
        System.out.println("Employee works");
    }
}

class Manager extends Employee{
    String teamSize;
    public void work(){
        System.out.println("Manager works");
    }
}

class Devolper extends Employee{
    String programmingLanguage;
    public void work(){
        System.out.println("Devolper works");
    }
}
public class inheritance3 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
        Devolper d = new Devolper();
        d.work();
    }
}
