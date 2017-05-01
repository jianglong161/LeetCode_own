/**
 * Created by Still2Almost on 2017/4/23.
 */
public class Base7 {
    public String converToBase7(int num){
        StringBuffer sb=new StringBuffer();
        if(num==0)
            return "0";
        boolean flag=num>0 ? true:false;
        num=Math.abs(num);
        while(num!=0){
            sb.insert(0,num%7);
            num/=7;
        }
        if (flag)
            sb.insert(0,"-");
         return sb.toString();
    }

}
