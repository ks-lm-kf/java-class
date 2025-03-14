import java.util.Scanner;
public class class3_14_pta2{
    public static void main(String[] age){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=0;
        sc.close();
        for(i=1;i<=a;i++){
            System.out.printf("%d*%d=%d\n",i,a,i*a);
        }
    }
}