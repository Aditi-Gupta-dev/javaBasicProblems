class Fibo{
    public void fib(int n){
        int a=-1;
    int b=1;
    int c=(a+b);
    for(int i=0;i<=n;i++){
        System.out.print(c+" ");
        a=b;
        b=c;
        c=(a+b);
    }
   }
   public static void main(String[] args) {
    Fibo obj=new Fibo();
    
    obj.fib(Integer.parseInt(args[0]));
    
   }
    

}