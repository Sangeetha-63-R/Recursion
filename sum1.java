import java.util.*;
public class sum1 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        ArrayList<Integer> s = new ArrayList<>();
        int n=3,sum=0;
        sum(0,a,s,n,sum);
        System.out.println(s);
    }
    static public void sum(int i,int a[],ArrayList s,int n,int sum){
        if(i==n){
            s.add(sum);
            return;
        }
        sum(i+1,a,s,n,sum+a[i]);
        sum(i+1,a,s,n,sum);
    }
}
