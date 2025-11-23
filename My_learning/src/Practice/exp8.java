class A { void showA(){System.out.println("A");} }
class B extends A { void showB(){System.out.println("B");} }
class C extends B { void showC(){System.out.println("C");} }
public class Q8 {
    public static void main(String[] args){
        C o=new C();
        o.showA();
        o.showB();
        o.showC();
    }
}
