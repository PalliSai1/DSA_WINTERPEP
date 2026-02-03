import java.util.Arrays;

public class Print {
    public static void print(int n){
        if(n>=0){
            if(n%2==0){
                System.out.println(n);
            }
            print(n-1);
        }
    }
    public static int fibo(int n){
        if(n==0||n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static int power(int x,int n){
        if(n==1){
            return x;
        }
        return x*power(x,n-1);
    }
    public static boolean isSorted(int arr[],int n){
        if(n==0||n==1){
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        return isSorted(Arrays.copyOfRange(arr,1,n),n-1);
    }
    public static boolean BS(int arr[],int i, int j,int key){
        if(i>j){
            return false;
        }
        int mid=(i+j)/2;
        if(arr[mid]==key){
            return true;
        }else if(arr[mid]>key){
            return BS(arr, i,mid-1,key);
        }else{
            return BS(arr,mid+1,j,key);
        }
        

    }
    public static int Sum(int arr[]){
        if(arr.length==1){
            return arr[0];
        }
        return arr[0]+Sum(Arrays.copyOfRange(arr,1,arr.length));
    }
    public static void main(String[] args){
        print(10);
        System.out.println(power(2,4));
        System.out.println(fibo(10));
        int arr[]={2,3,4,5,6};
        System.out.println(isSorted(arr,4));
        System.out.println(Sum(arr));
        System.out.println(BS(arr,0,5,6));

    }
}
