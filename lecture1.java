import java.util.*;



public class lecture1 {
    public static void main(String[] args) {
        int[] arr = {1,3,8,9,0,4,5};

        int start=0;
        int end= arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            System.out.println(mid);
            if(mid==0 || mid==arr.length-1 ){
                System.out.println("Peak element is "+arr[mid]);
                return;
            }

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                System.out.println("Peak element is "+arr[mid]);
                return;
            }
            
            
            if(arr[mid]>arr[mid-1]){
                start = mid+1;
            }
            else{
                end= mid-1;
            }
        }
        System.out.println(start);
    }    
}
