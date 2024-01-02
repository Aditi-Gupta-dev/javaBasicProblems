public class Basic {
    String name;
    int age;
    int no;

    public void initialObj(String a,int b,int c){
        this.name=a;
        this.age=b;
        this.no=c;
    }
    
    public void printing(){
        System.out.println(name+ " "+age+" "+no);
    }

    public void method(){
                System.out.println("hello");


    }
    public static void main(String[] args){
        System.out.println("1");
        Basic var=new Basic();
        var.method();
        var.initialObj("adi",3,2);
        var.printing();
        
    }
}
