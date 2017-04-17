import java.util.HashMap;

/**
 * Created by Still2Almost on 2017/4/17.
 */
public class MajorityElement_169 {
    public int majorityElement(int[] nums){

        HashMap<Integer,Integer> hashMap=
                new HashMap<Integer, Integer>();
        for(int ele:nums){
            if(hashMap.containsKey(ele)) {
                hashMap.put(ele, hashMap.get(ele) + 1);
            }else {
                hashMap.put(ele,1);
            }
        }
        for(int item:hashMap.keySet()){
            if (hashMap.get(item)>nums.length/2){
                return item;
            }
        }
        return -1;
    }
}
