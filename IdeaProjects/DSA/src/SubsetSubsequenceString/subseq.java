package SubsetSubsequenceString;

import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        ArrayList<String> seq = new ArrayList<String>();
        subSeq("abc","",seq);
        System.out.println(seq.toString());
    }

    public static ArrayList<String> subSeq(String up,String p, ArrayList<String> seq)
    {
        if(up.isEmpty())
        {
            seq.add(p);
            return seq;
        }
        char ch = up.charAt(0);
        subSeq(up.substring(1),p+ch,seq);
        subSeq(up.substring(1),p,seq);
        return seq;
    }
}
