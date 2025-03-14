import java.util.Scanner;
public class class3_14_pta1{
    public static void main(String[] age){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>0&&b>0){
                System.out.println("1");
            }
            else if(a>0&&b<0){
                System.out.println("4");
            }
            else if(a<0&&b>0){
                System.out.println("2");
            }
            else if(a<0&&b<0){
                System.out.println("3");
            }
        }
        sc.close();
    }
}
        
                    
