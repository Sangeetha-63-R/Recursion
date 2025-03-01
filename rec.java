import java.util.ArrayList;

class rec{
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        int arr[]={3,1,2};
        seq(0,a,arr);
    }
    static void seq(int i,ArrayList a,int arr[]){
        if(i>=3){
            System.out.println(a);
            return;
        }
        a.add(arr[i]);
        seq(i+1,a,arr);
        a.remove(a.size() - 1);
        seq(i+1,a,arr);
    }
}