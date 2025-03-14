import java.util.Scanner;
public class class3_14_1{
    public static void main(String[] age){
        Scanner sc=new Scanner(System.in);
        int i=0;
        int j=1;
        int h=0;
        int a=sc.nextInt();
        int t=1;
        sc.close();
        for(i=1;i<=a;i++){
            t=1;
            for(j=1;j<=i;j++){
                t=t*j;
            }
            h=h+t;
        }
        System.out.println(""+h);
    }
}