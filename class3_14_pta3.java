import java.util.Scanner;
public class class3_14_pta3{
    public static void main(String[] age){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=0;
        int j=0;
        sc.close();
        for(i=1;i<=a;i++){
            for(j=1;j<=i;j++){
                System.out.printf("%d*%d=%d",j,i,i*j);
                if(j==i){

                }
                else{
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }

    }
}