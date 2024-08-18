import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//no.of elements in arrays and also used foe no. of rows.
//to use desired method uncomment related parts to it.
        // int a=sc.nextInt();// find no. greater than this
        // int c=sc.nextInt();//no. of columns
       /*  int[][] arr2d=new int[n][c];// 2-d array
        for(int i=0;i<n;i++){
            for(int j=0;j<c;j++){
                arr2d[i][j]=sc.nextInt();
            }
        }
        diagonal(arr2d);*/
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           int x=sc.nextInt();
            arr[i]=x;
        }
       // max2(arr);
        maxmin(arr);
       // greater(arr, a, n);
       // reverse(arr);
    }
    public static void maxmin(int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]+" "+arr[0]);
     
    }
    public static void diagonal(int[][] arr2d){
        int sum=0;
        for(int i=0;i<arr2d.length;i++){
            for(int j=0;j<arr2d[i].length;j++){
             if(i==j || i+j==arr2d.length-1){
                sum+=arr2d[i][j];
             }
             if(arr2d.length%2==0){
                sum-=arr2d[arr2d.length/2][arr2d.length/2];
             }
        }}
        System.out.println(sum);
    }
    public static void max2(int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
    public static void greater(int[] arr,int x,int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>x){
                count++;
            }
              
        }
        System.out.println(count);
    }
    public static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
