class Fact{
    public int fact(int n){
        if(n==1){
            return 1;
        }
        return (n*fact(n-1));
    }
    public static void main(String[] args) {
        Fact obj=new Fact();
        System.out.println(obj.fact(Integer.parseInt(args[0])));
    }
}