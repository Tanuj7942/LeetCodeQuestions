import java.util.HashMap;

public class RomanToInteger {
    public static void main (String args[]) {
        Solution13I sol = new Solution13I();
        System.out.print(sol.romanToInt("III"));
    }
}

//13. Roman to Integer
class Solution13I {
    public int romanToInt(String s) {
        int ans=0,num=0;
        for (int i=s.length()-1;i>=0;i--) {
            switch(s.charAt(i)) {
                case 'I': num=1; break;
                case 'V': num=5; break;
                case 'X': num=10; break;
                case 'L': num=50; break;
                case 'C': num=100; break;
                case 'D': num=500; break;
                case 'M': num=1000; break;
            }
            if (4*num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
}

class Solution13II {
    public int romanToInt (String s) {
        int ans=0, num=0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i=s.length()-1;i>=0;i--) {
            num = map.get(s.charAt(i));
            if (4*num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
}