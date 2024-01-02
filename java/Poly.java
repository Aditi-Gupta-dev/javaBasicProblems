public class Test {
    void show(){
        System.out.println("1");
    }
    void show(){
        System.out.println("2");
    }
    public static void main(String[] args){
        Test obj=new Test();
        obj.show();
    }
}
