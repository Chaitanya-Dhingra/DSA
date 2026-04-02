package String;

public class longestPallindrome {
    public static void main(String[] args) {
        String s="racecar12321";
        int n= s.length();
            String ans = "" + s.charAt(0);

            int i = 0;
            while (i < n) {

                // odd length
                int l = i - 1;
                int r = i + 1;
                while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                }
                l++; r--;
                if (r >= l && ans.length() < r - l + 1) ans = s.substring(l, r + 1);

                // even length
                l = i - 1;
                r = i;
                while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                }
                l++; r--;
                if (r >= l && ans.length() < r - l + 1) ans = s.substring(l, r + 1);

                i++;
            }
            System.out.println(ans);
        }
    }

