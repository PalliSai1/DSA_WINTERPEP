public class Twod {

    public static void Colsum(int[][] arr, int r, int c) {
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < c; i++) {      
            int sum = 0;
            for (int j = 0; j < r; j++) {  
                sum += arr[j][i];
            }
            maxsum = Math.max(maxsum, sum);
        }

        System.out.println(maxsum);
    }
    public static void Wavesum(int[][] arr,int r,int c){
        for(int j=0;j<c;j++){
            if(j%2==0){
                for(int i=0;i<r;i++){
                    System.out.print(arr[i][j]+" ");
                }

            }else{
                for(int i=r-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }

            }
            System.out.println();
        }
    }
    public static void Spiralsum(int arr[][],int r,int c){
        int leftcol=0;
        int topr=0;
        int botr=r-1;
        int rightcol=c-1;
        while(topr<=botr&&leftcol<=rightcol){
            for(int i=leftcol;i<=rightcol;i++){
                System.out.print(arr[topr][i]+" ");
            }
            topr++;
            System.out.println();
            for(int i=topr;i<=botr;i++){
                System.out.print(arr[i][rightcol]+" ");
            }
            rightcol--;
            System.out.println();
            for(int i=rightcol;i>=leftcol;i--){
                System.out.print(arr[botr][i]+" ");
            }
            botr--;
            System.out.println();
            for(int i=botr;i>=topr;i--){
                System.out.print(arr[i][leftcol]+" ");
            }
            leftcol++;
            System.out.println();

        }
    }

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Colsum(arr, 3, 3);
        Wavesum(arr,3,3);
        System.out.println("Spiral traversal: ");
        Spiralsum(arr,3,3);
    }
}

