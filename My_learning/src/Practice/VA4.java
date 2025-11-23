class A1 {
    void show(){ System.out.println("A1"); }
}

class B1 extends A1 {
    void show(){ System.out.println("B1"); }
}

class C1 extends A1 {
    void show(){ System.out.println("C1"); }
}

public class D {
    public static void main(String[] args){
        A1 obj;
        obj=new B1(); obj.show();
        obj=new C1(); obj.show();
    }
}
