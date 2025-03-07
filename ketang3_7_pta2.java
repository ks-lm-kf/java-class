import java.util.Scanner;
public class ketang3_7_pta2{
    public static void main(String[] age){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=(3*a)+(2*b)+c;
            System.out.printf("%d",d);
        }
        sc.close();
    }
}