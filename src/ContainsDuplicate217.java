import java.util.HashSet;
import java.util.Set;

/**
 * Created by Still2Almost on 2017/5/1.
 */
public class ContainsDuplicate217 {
    public boolean Duplicete(int[] nums){
        if(nums==null)
            return false;
        Set<Integer> set=new HashSet<Integer>();
        for(int i:nums){
            if (set.contains(i)){
                return  true;
            }else {
                set.add(i);
            }
        }

        return  false;
    }
}
