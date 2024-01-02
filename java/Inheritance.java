//parent class
class Man {
    void fun(){
        System.out.println("helloooooo!!");
    }
}

//child class / sub class
class Inheritance extends Man{
    public static void main(String[] args){
        Man a=new Man();
        a.fun();
    }
}
 