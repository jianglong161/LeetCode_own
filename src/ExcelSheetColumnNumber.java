/**
 * Created by Still2Almost on 2017/4/17.
 */
public class ExcelSheetColumnNumber {

    public int solution(String s){
        int result = 0;
        for(int i=0;i<s.length();i++){
            result = result *26+(s.charAt(i)-'A'+1);
        }
        return  result;
    }

}
