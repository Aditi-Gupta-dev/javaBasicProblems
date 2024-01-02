public class Prime {
    boolean isPrime(int n){
        if(n==1) {
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Prime obj=new Prime();
        System.out.println(obj.isPrime(Integer.parseInt(args[0])));
    }
    
}

public class Prime{
	boolean isPrime(int n){
	if(n==1){
	return true;
	}
	for(int i=2;i<n;i++){
	if(n%i==0){
	return false;
	}
	}
	return true;

	}
	public static void main(String[] args){
	Prime obj=new Prime();
	System.out.println(obj.isPrime(Interger.parseInt(args[0])));
	}
}
