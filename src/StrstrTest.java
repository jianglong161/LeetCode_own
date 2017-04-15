import java.util.HashSet;
import java.util.Set;

/**
 * Created by Still2Almost on 2017/4/9.
 */
public class StrstrTest {
    public int[] intersection(int[] num1,int[] numb2){
        Set<Integer> set=new HashSet<Integer>();
        Set<Integer> inserSet=new HashSet<Integer>();
        for(int i=0;i<num1.length;i++){
            set.add(num1[i]);
        }
        for(int i=0;i<numb2.length;i++){
            if(set.contains(numb2[i]))
                inserSet.add(numb2[i]);
        }
        int [] rew=new int[inserSet.size()];
        int cout = 0;
        for(int num:inserSet){
            rew[cout++]=num;
        }
        return rew;
    }

}