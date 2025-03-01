import java.util.ArrayList;

public class binary {
    public static void main(String[] args) {
        ArrayList<String> a =new ArrayList<>();
        int n=4;
        StringBuilder str=new StringBuilder();
        String res="";
        longbin(a,n,str,res);
        System.out.println(a);

    }
    static void longbin(ArrayList<String> a,int n,StringBuilder str,String res){
        if(str.length()==n){
            res=str.toString();
            a.add(res);
            return;
        }
        str.append('0');
        longbin(a,n,str,res);
        str.deleteCharAt(str.length()-1);
        str.append('1');
        longbin(a,n,str,res);
        str.deleteCharAt(str.length()-1);
    }
}
