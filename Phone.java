public class Phone{
    private String brand;
    private double Price;
    public void call(){
        System.out.println("call");
    }
    public void playGame(){
        System.out.println("playGame");
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setPrice(double Price){
        this.Price=Price;
    }
    public double getPrice(){
        return Price;
    }
}