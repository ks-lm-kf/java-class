import java.util.Scanner;
public class class3_14_pta {
    public static void main(String[] age){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int i=0;
        int c=0;
        for(i=a;i<=b;i++){
            if(i%11==0){
                c=c+i;
            }
            else{}
        }
        System.out.println(""+c);

    }
}
