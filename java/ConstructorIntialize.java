public class ConstructorIntialize {
    
    String name;
    int no;
    ConstructorIntialize(String n,int a){
        this.name=n;
        this.no=a;

    }
    public void display(){
        System.out.println(name+" "+no); 

    }
    public static void main(String[] args){
       ConstructorIntialize n1=new ConstructorIntialize("aditi",2);
       n1.display();
    }

}
