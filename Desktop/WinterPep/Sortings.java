public class Sortings {
    static void selection(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        

    }
    static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int key=arr[i];
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=key;
        }
    }
    static void Quick(int arr[],int left,int right){
        if(left<right){
            int pi=Partition(arr,left,right);
            Quick(arr,left,pi-1);
            Quick(arr,pi+1,right);
        }

    }
    static int Partition(int arr[],int left,int right){
        int pi=arr[right];
        int i=left;
        for(int j=left;j<right;j++){
            if(arr[j]<pi){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        int temp=arr[i];
        arr[i]=arr[right];
        arr[right]=temp;
        return i;
    }
    
    public static void main(String args[]){
        int arr[]={34,54,2,3,43};
        Quick(arr,0,4);
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        
    }
    
}
