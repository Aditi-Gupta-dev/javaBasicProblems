class Pattern{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int a[][]=new int[n][];
        for(int i=0;i<n;i++){
            a[i]=new int[i+1];
            for(int j=0;j<(i+1);j++){
                if(j%2==0){
                    a[i][j]=1;

                }else{
                    a[i][j]=0;
                }
            }
            

        }
        for(int i=0;i<n;i++){
                for(int j=0;j<(i+1);j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            } 
    }
}