package OtherConcepts;

import java.util.ArrayList;

public class subSeq {
//    not returning anything

//    public static void main(String[] args) {
//        String str="abc";
//        String sub="";
//        subseq(sub,str);
//    }
//    public static void subseq(String p,String up){
//        if(up.isEmpty())
//        {
//            System.out.println(p);
//            return;
//        }
//        char ch=up.charAt(0);
//        subseq(p+ch,up.substring(1));
//        subseq(p,up.substring(1));
//    }

//     returning an arrayList

    public static void main(String[] args) {
        String str="abc";
        String pro="";
        ArrayList<String> processed=new ArrayList<String>();
        subseq(str,pro,processed);
        System.out.println(processed.toString());
    }

    public static ArrayList<String> subseq(String up, String p, ArrayList<String> processed)
    {
        if(up.isEmpty())
        {
            processed.add(p);
            return processed;
        }
        char ch=up.charAt(0);
        subseq(up.substring(1),p+ch,processed);
        subseq(up.substring(1),p,processed);
        return processed;
    }
}
