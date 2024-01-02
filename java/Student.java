
public class Student{
    public static class Studentinfo{
        String name;
        int rno;
        double percent;
    }
     public static void fun(){
            System.out.println("hwlooo");
        }
    public static void fun2(String n){
        System.out.println(n);
        return;
    }

    public static void Details(Studentinfo stuobj){
        System.out.println(stuobj.name+" "+stuobj.rno+"   "+stuobj.percent);
    }
    public static void main(String[] args){
        Studentinfo x=new Studentinfo();
        x.name="aditi";
        x.rno=3;
        x.percent=88;

       
        Studentinfo s2=new Studentinfo();
        s2.name="vikas";
        s2.rno=3;
        s2.percent=100;

        // System.out.println(x.name);       
        // System.out.println(x.rno);
        // System.out.print(x.percent+" ");
        // System.out.print(s2.name);

        // fun();
        // // fun2("ado")
        // String name="aditi";
        // fun2(name);
        System.out.println("NAME"+" "+"RNO"+"  "+"PERCENT");
        Details(x);   //printing using a parameterised function
        Details(s2);


        //accessing class on different file of same folder Mypackages  using enclapsulation
        MypackageClass red=new MypackageClass();
        red.setName("pink");
        System.out.print(red.getName());

    }
    

}


