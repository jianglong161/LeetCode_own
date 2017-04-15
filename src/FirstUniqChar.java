import java.util.ArrayList;
import java.util.List;

/**
 * Created by Still2Almost on 2017/4/15.
 */
public class FirstUniqChar {
    public int solution(String s){
        int[] a = new int[26];
        for(int i = 0; i < s.length(); i++)
            a[s.charAt(i) - 'a']++;
        for(int i = 0; i < s.length(); i++){
            if(a[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }

}
