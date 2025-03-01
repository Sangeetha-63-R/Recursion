import java.util.ArrayList;

public class sequence {
    public static void main(String[] args) {
        int[] a={3,4,1};
        int sum=4;
        int s=0;
        ArrayList<Integer> a1=new ArrayList<>();
        System.out.println(fun(0,a1,a,s,sum));
    }
    public static boolean fun(int i,ArrayList a1,int a[],int s,int sum){
        if(i>=3){
            if(s==sum){
                System.out.println(a1);
            return true;
            }
            return false;
        }
        a1.add(a[i]);
        s+=a[i];
        if(fun(i+1,a1,a,s,sum) ==true)
            return true;
        a1.remove(a1.size()-1);
        s-=a[i];
        if(fun(i+1,a1,a,s,sum)==true)
            return true;
        return false;
    }
}
