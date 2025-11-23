import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int[] f=new int[256];
        for(char c:str.toCharArray()) f[c]++;
        int max=0; char ans=0;
        for(int i=0;i<256;i++) if(f[i]>max){max=f[i]; ans=(char)i;}
        System.out.println(ans);
    }
}
