class Palin{
    boolean isPalin(String s){
        int l=s.length()-1;
        for(int i=0;i<(int)l/2;i++){
            if(s.charAt(i)!=s.charAt(l-i))
            {
                return false;
            }
            return true;
        }
        return true;
    }
    public static void main(String[] args) {
        Palin obj=new Palin();
        if(obj.isPalin(args[0])){
		System.out.println("palindrome");
	
	}
	else{
		System.out.println("not palindrome");
	}
    }
}