import java.util.HashMap;
public class hashmap2 {
    public static void main(String[]args){
        HashMap <Integer,Integer> likki=new HashMap<> ();
        int arr[]={10,5,6,5,8,9,6,3};
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            if(likki.containsKey(n)){
                int prev=likki.get(n);
                likki.put(n,prev+1);
            }else{
                likki.put(n,1);
            }
        }
        for(int likith:likki.keySet()){
            System.out.println(likith+"->"+likki.get(likith));
        }


    }

}
