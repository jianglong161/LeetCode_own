/**
 * Created by Still2Almost on 2017/4/23.
 */
public class ValidAnagram {
    public static void main(String[] args){
        String s="anagram";
        String t="naglram";
        ValidAnagram ts
                =new ValidAnagram();
        ts.isAnagram(s,t);
    }
    public boolean isAnagram(String s,String t){
        if (s.equals(t))
            return true;
        if(s==null || t==null || s.length()!= t.length()  )
            return false;
        int[] num =new int[26];
        for(int i=0;i<s.length();i++){
            num[s.charAt(i)-'a']++;
            num[t.charAt(i)-'a']--;
        }
        for(int i:num ){
            if(i!=0)    //如果不等于0，证明有不相同的字母。
                return false;
        }
        return true;
    }

}
