import java.util.Scanner;
public class class3_12{
    public static void main(String[] age){
        Scanner sc=new Scanner(System.in);
        int a1 =sc.nextInt();
        int b1 =sc.nextInt();
        int a2 =sc.nextInt();
        int b2 =sc.nextInt();
        int c =sc.nextInt();
        if(c>=a1&&c<=b1&&c>=a2&&c<=b2){
            System.out.println("in");
        }
        else{
            System.out.println("out");
        }
        sc.close();

    }
}