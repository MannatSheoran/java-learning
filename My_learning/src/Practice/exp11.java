import java.util.Random;

class Generator extends Thread {
    static int num;
    public void run() {
        Random r = new Random();
        while (true) {
            num = r.nextInt(100);
            System.out.println("Generated: " + num);
            try { Thread.sleep(1000); } 
            catch (Exception e) {}
        }
    }
}

class Square extends Thread {
    public void run() {
        while (true) {
            if (Generator.num % 2 == 0) {
                System.out.println("Square: " + (Generator.num * Generator.num));
            }
            try { Thread.sleep(1000); }
            catch (Exception e) {}
        }
    }
}

class Cube extends Thread {
    public void run() {
        while (true) {
            if (Generator.num % 2 != 0) {
                System.out.println("Cube: " + (Generator.num * Generator.num * Generator.num));
            }
            try { Thread.sleep(1000); }
            catch (Exception e) {}
        }
    }
}

public class Q11 {
    public static void main(String[] args) {
        new Generator().start();
        new Square().start();
        new Cube().start();
    }
}
    