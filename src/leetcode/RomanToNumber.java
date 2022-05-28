package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {

	public static void main(String[] args) {
		String s = "III";
		Map<String, Integer> valMap = new HashMap();
        valMap.put("I", 1);
        valMap.put("V", 5);
        valMap.put("X", 10);
        valMap.put("L", 50);
        valMap.put("C", 100);
        valMap.put("D", 500);
        valMap.put("M", 1000);
        
        String[] sArr = s.split("");
        
        Integer sum = 0;
        Integer preVal = 0;
        for(int i=sArr.length-1; i>-1; i--) {
            Integer currVal = valMap.get(sArr[i]);
            System.out.println("sum: " + sum);
            System.out.println("preVal: " + preVal);
            System.out.println("currVal: " + currVal);
            if(preVal > currVal){
            	System.out.print("preVal > currVal: " + (preVal > currVal));
                sum = subtract(sum, currVal);
            }
            else{
                sum = add(sum, currVal);
            }
            
            
            preVal = valMap.get(sArr[i]);
		}
        System.out.println(sum);
//        return sum.intValue();
        
    }
	public static int add(Integer sum, Integer currVal){
		return (sum - currVal);
	}
	
	public static int subtract(Integer sum, Integer currVal){
		return (sum + currVal);
	}
    


}
