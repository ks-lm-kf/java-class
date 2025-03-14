import java.util.Scanner;
public class class3_14{
    public static void main(String[] age){
        Scanner sc=new Scanner(System.in);
        int i=0;
        int c=0;
        int a=sc.nextInt();
        sc.close();
        for(i=0;i<=a;i++){
            c=c+i;
        }
        System.out.println(""+c);
    }
}