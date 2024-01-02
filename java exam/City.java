 class City{
    public static void main(String[] args) {
         int n=args.length;
         String a[]=new String[n];
         String temp;
	 for(int i=0;i<n;i++)
		{
			a[i]=args[i];
		}
	 
         for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;i++){
                if((a[j].compareTo(a[j+1]))>0){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
         }
         for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
         }

    }
 }