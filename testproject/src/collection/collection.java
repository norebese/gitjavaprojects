package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class collection {
	public static void main(String[]args) {
		List<String> list=new ArrayList<>();
		
		list.add("toy");
		list.add("box");
		list.add("robot");
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+'\t');
		}
		System.out.println();
		list.remove(0);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+'\t');
		}
		System.out.println();
		
//		Set<String> set=new HashSet<>();
//		set.add("toy"); set.add("Box");
//		set.add("robot"); set.add("Box");
//		System.out.println("인스턴스 수:"+set.size());
//		
//		for(Iterator<String> itr=set.iterator();itr.hasNext();)
//			System.out.print(itr.next()+"\t");
//		System.out.println();
//		
//		for(String s: set)
//			System.out.print(s+"\t");
//		System.out.println();
			
//		HashMap<Integer, String> map=new HashMap<>();
//		
//		map.put(45, "brown");
//		map.put(37, "james");
//		map.put(23, "martin");
//		
//		System.out.println("23번: "+map.get(23));
//		System.out.println("37번: "+map.get(37));
//		System.out.println("45번: "+map.get(45));
//		System.out.println();
//		map.remove(37);
//		
//		System.out.println("37번: "+map.get(37));
//		
//		Set<Integer>ks =map.keySet();
//		//HashMap 전체 출력하는 방법: set에 다시 넣어준다
//		for(Integer n:ks)
//			System.out.print(map.get(n)+'\t');
		
		
		
		
	}
	
	
	
	
	

}
