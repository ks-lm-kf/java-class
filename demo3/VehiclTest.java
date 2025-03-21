package demo3;
import java.util.Scanner;
public class VehiclTest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Vehicle obJVehicle=new Vehicle(sc.next(),sc.nextInt());
        System.out.println("车辆信息如下：");
        obJVehicle.show();
        Bus objBus=new Bus(sc.next(),sc.nextInt(),sc.nextInt());
        System.out.println("客车信息如下：");
        objBus.show();
        sc.close();
    }
}
class Vehicle{
    private String plateNo;
    private int wheelbase;
    public Vehicle(){

    }
    public Vehicle(String plateNo,int wheelbase){
        this.plateNo=plateNo;
        this.wheelbase=wheelbase;
    }
    public void show(){
        System.out.println("车牌号："+plateNo);
        System.out.println("轴距："+wheelbase);
    }
    
}
class Bus extends Vehicle{
    private int passengers;
    public Bus(){
        super();
    }
    public Bus(String plateNo,int wheelbase,int passengers){
        super(plateNo,wheelbase);
        this.passengers=passengers;
    }
    public void show(){
        super.show();
        System.out.printf("限载人数："+passengers);
    }

}
