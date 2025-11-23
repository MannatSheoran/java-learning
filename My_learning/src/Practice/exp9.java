abstract class Shape {
    abstract void Area();
}

class Rectangle extends Shape {
    int w,h;
    Rectangle(int w,int h){this.w=w;this.h=h;}
    void Area(){System.out.println(w*h);}
}

class Triangle extends Shape {
    int b,h;
    Triangle(int b,int h){this.b=b;this.h=h;}
    void Area(){System.out.println(0.5*b*h);}
}

class Circle extends Shape {
    int r;
    Circle(int r){this.r=r;}
    void Area(){System.out.println(3.14*r*r);}
}

public class Q9 {
    public static void main(String[] args){
        new Rectangle(4,5).Area();
        new Triangle(4,6).Area();
        new Circle(5).Area();
    }
}
