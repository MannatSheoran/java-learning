import java.util.*;

class Employee {
    String name, address, job;
    double salary;
    Employee(String n, String a, double s, String j) {
        name=n; address=a; salary=s; job=j;
    }
    double bonus() { return salary*0.10; }
    String report() { return name+" "+job+" "+salary; }
    String project() { return job+" project assigned"; }
}

class Manager extends Employee {
    Manager(String n, String a, double s) { super(n,a,s,"Manager"); }
    double bonus() { return salary*0.20; }
}

class Developer extends Employee {
    Developer(String n, String a, double s) { super(n,a,s,"Developer"); }
    double bonus() { return salary*0.15; }
}

class Programmer extends Employee {
    Programmer(String n, String a, double s) { super(n,a,s,"Programmer"); }
    double bonus() { return salary*0.12; }
}

public class A {
    public static void main(String[] args) {
        Manager m=new Manager("A","X",50000);
        Developer d=new Developer("B","Y",40000);
        Programmer p=new Programmer("C","Z",30000);
        System.out.println(m.report());
        System.out.println(d.report());
        System.out.println(p.report());
    }
}
