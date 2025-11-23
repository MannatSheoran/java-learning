import java.util.*;

public class E {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        char ch=s.next().charAt(0);
        int d1=n/1000;
        int d2=(n/100)%10;
        int d3=(n/10)%10;
        int d4=n%10;
        char last=(char)(ch-1);
        System.out.println("" + d1 + ch + d3 + last);
    }
}
