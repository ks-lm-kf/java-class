import java.util.Scanner;
public class ketang{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        double score=sc.nextDouble();
        System.out.println("name="+name);
        System.out.println("age="+age+",score="+score);
    }
}