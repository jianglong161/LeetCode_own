import java.util.HashMap;

/**
 * Created by Still2Almost on 2017/5/1.
 */
public class RomanToInteger {
    public String  romatToInt(String s){
        HashMap<String,Integer> map=
                new HashMap<String,Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int value= hashMap.get(s.charAt(0));
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))>map.get(s.charAt(i-1))){
                value=value+map.get(s.charAt(i))-2*map.get(s.charAt(i-1));
            }else {
                value =value+map.get(s.charAt(i));
            }

            }
            return  value;
        }

    }

}
