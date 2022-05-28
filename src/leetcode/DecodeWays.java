package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DecodeWays {

	public static void main(String[] args) {
		String s = "12220520130";
		char aa = 64;
		Map map = new HashMap();
		int count = 0;
		int i = 1;
		while(i <= 26) {
			map.put(i, (char)(aa+i));
			i++;
		}
		if(s.indexOf("0")<0) {
			count++;
		}
		if(s.indexOf("00")>0) {
			System.out.println("error");
		}
		ArrayList<Integer> zeroIndexList = new ArrayList();
		int zeroIndex = 0;
		boolean hasZero = true;
		while(hasZero) {
			if(zeroIndex==0) {
				zeroIndexList.add(s.indexOf("0"));
				zeroIndex = s.indexOf("0");
			}
			zeroIndexList.add(s.indexOf("0", zeroIndex+1));
			zeroIndex = s.indexOf("0", zeroIndex+1);
			if(s.indexOf("0", zeroIndex+1)<0) {
				hasZero = false;
			};
		}
		
		System.out.println(zeroIndexList);
		System.out.println("=============");
		
		ArrayList<String> sliceList = new ArrayList();
		
		for(int j = 0; j<zeroIndexList.size(); j++) {
			if(j==0) {
				sliceList.add(s.substring(0, zeroIndexList.get(0)-1));
			}
			if(j>0) {
				sliceList.add(s.substring(zeroIndexList.get(0)+1, zeroIndexList.get(1)-1));
			}
		}
		
		System.out.println(sliceList);
		
		System.out.println("count:" + count);
	}
	
}
