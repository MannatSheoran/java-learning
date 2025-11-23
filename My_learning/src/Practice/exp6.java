import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=s.nextInt();
        int min=a[0], max=a[0];
        for(int i:a){
            if(i<min) min=i;
            if(i>max) max=i;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
