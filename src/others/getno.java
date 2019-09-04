package others;

import java.util.ArrayList;
import java.util.List;

public class getno {
	public static List<Integer> get_no (String no){
		List<Integer> list = new ArrayList<>();
		int sum = no.length();
		String temp ="";
		for(int i = 0 ;i < sum; i++){
			if(no.charAt(i)>=48&&no.charAt(i)<=57){
				temp += no.charAt(i);
			}
			else{
				Integer a = Integer.parseInt(temp);
				list.add(a);
				temp = "";
			}
		}
		Integer a = Integer.parseInt(temp);
		list.add(a);
		return list;
	}
}
