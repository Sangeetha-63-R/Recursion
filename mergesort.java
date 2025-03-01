import java.util.ArrayList;

public class mergesort {
    public static void main(String[] args) {
        int[] arr={9,7,6,3,5,1};
        int l=0,r=arr.length-1;
        merge(arr,l,r);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static public void merge(int arr[],int l,int r){
        if(l==r){
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");
                System.out.println();
            return;
        }
        int mid=(l+r)/2;
        System.out.println(mid);
        merge(arr, l, mid);
        merge(arr, mid+1, r);
        mergesot(arr,l,mid,r);
    }
    public static void mergesot(int[] arr,int l,int mid,int r){
       ArrayList<Integer> a=new ArrayList<>();
       int i=0;//j=mid+1;
       int left=l,right=mid+1;
       while(left<=mid && right<=r){
            if(arr[left]<arr[right]){
                a.add(arr[left]);
                left++;
            }
            else{
                a.add(arr[right]);
                right++;
            }
        }
        while(left<=mid ){
            a.add(arr[left]);
            left++;
        }
        while(right<=r ){
            a.add(arr[right]);
            right++;
        }
        //int j=0;
        for(int k=l;k<=r;k++){
           arr[k]=a.get(k-l);
        }  
       }
    }

