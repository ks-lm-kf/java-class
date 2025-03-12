import java.util.Scanner;
public class Operator{
    public static void main(String[] age){
        Scanner sc=new Scanner(System.in);
        int score =sc.nextInt();
        if(score%2==0){
            System.out.println("左边");
        }
        else{
            System.out.println("右边");
        }
        sc.close();
    }
}