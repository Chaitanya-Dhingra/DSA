package BitManipulation;
import java.math.*;
public class MagicNo {
    public static void main(String[] args) {
        int n=6;
        int index=1;
        int ans=0;
        while(n!=0)
        {
            int last=n&1;
            n=n>>1;
            ans+= (int) (Math.pow(5,index)*last);
            index++;
        }
        System.out.println(ans);
    }
}
