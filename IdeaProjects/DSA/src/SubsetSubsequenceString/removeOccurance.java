package SubsetSubsequenceString;

public class removeOccurance {
    public static void main(String[] args) {
       String str="bacca";
       String result = "";
        result = remove(str,0,result);
        System.out.println(result);
    }
    public static String remove(String str,int start,String ans){
        if(start==str.length()){
            return ans;
        }
        if(str.charAt(start)!='a')
        {
            ans+=str.charAt(start);
        }
        return remove(str,start+1,ans);
    }

}
