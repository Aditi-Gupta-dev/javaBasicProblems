 class Bubble{
    public static void main(String[] args) {
         int n=args.length;
         int a[]=new int[n];
         int temp;
	 for(int i=0;i<n;i++){
		a[i]=Integer.parseInt(args[i]);
	 }
         for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;i++){
                if(a[j]>a[j+1]){
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