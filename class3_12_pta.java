import java.util.Scanner;
public class class3_12_pta{
    public static void main(String[] age){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c= a/(b*b);
        if(a>727||a<=0||b>2.72||b<=0){
            System.out.println("input out of range");
        }
        else if(c<18.5){
            System.out.println("thin");
        }
        else if(c>=18.5&&c<24){
            System.out.println("fit");
        }
        else if(c>=24&&c<28){
            System.out.println("overweight");
        }
        else if(c>=28){
            System.out.println("fat");
        }
        sc.close();

    }
}