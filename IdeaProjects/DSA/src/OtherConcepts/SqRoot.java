package OtherConcepts;

public class SqRoot {
    public static void main(String[] args) {
        int n=40;
        System.out.printf("%.3f",Sqroot(n,3));
    }
    public static double Sqroot(int n,int p){
        int s=0,e=n;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(m*m==n)
            {
                return m;
            }
            if(m*m<n)
            {
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        double root=e;
        double incr=0.1;
        for(int i=0;i<p;i++)
        {
            while(root*root<=n)
            {
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }
}
