public class Student{
    /*属性，成员变量
     * 访问控制符，数据类型，变量名
     */
    private String name;
    private int age;
    /*成员方法 
     * 修饰符 返回值类型 方法名 参数列表
    */
    public void study(){
        System.out.println("好好学习，天天向上");
    }
    public void eat(){
        System.out.println("eat");
    }
    /*定义setName 设置name值 */
    public void setName(String name){
        this.name=name;
        /*=左侧name成员=右边是局部 */
    }
    /*定义getName */
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}
