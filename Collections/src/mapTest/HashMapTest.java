package mapTest;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	/*
	 * Map :  데이터를 저장할 때 각각의 자료들을 구분 짓는 고유의 키값을 정하여
	 * 		    리터럴 값으로 접근하는 실제 객체를 구분지으려고 할 때 사용된다.
	 * 		    해당 객체를 저장할 때 Key와 Value로 나눠저장하며 Map자료구조에서
	 * 		    자주사용되는 클래스는
	 * 		  HashMap,
	 * 		  TreeMap,
	 * 		  Properties가 있다.
	 */
	
	public static void main (String[]args) {
		// HashMap test
		// HashMap은 import java.util.HashMap;에서 불러오는 class이다.
		HashMap hmap = new HashMap();
		
		// 1. Map에 리터럴 값을 넣을때 put 메서드를 사용한다.
		// 1-1. put 메서드를 사용할때는 key와 value 값을 같이 넣어준다.
		hmap.put("one", new Date());
		hmap.put("two","안녕하세요.");
		hmap.put("three",12345); // 자동으로 데이터 boxing 처리가 된다.
		
		// 저장된 객체를 한개씩 몰록화 하여 꺼내는 방법
		// 1. keyset()메소드를 활용하여 값을 꺼내는 방법
		Set keys = hmap.keySet();
		Iterator iter = keys.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.println("1.keyset() 메소드를 이용한 방법 " + obj);
		}
		
		// 2.values()메소드를 활용하는 방법
		Collection values = hmap.values();
		Iterator iter2 = values.iterator();
		while(iter.hasNext()) {
			System.out.println("2. values() 메소드를 이용한 방법 " + iter2.next());
		}
		
		//3. Map.Entry 객체를 활용하는 방법
		//key와 value 가 모두 출려된다.
		Set entrySet = hmap.entrySet();
		Iterator iter3 = entrySet.iterator();
		while(iter3.hasNext()) {
			// entry Key와 Value 를 모두 가지고 있는 객체
			Map.Entry entry = (Map.Entry)iter3.next();
			
			// Key값 value값 분리
			String key = (String)entry.getKey();
			Object value = entry.getValue();
			
			//출력
			System.out.println("3. MapEntry 객체를 이용한 방법 " + key + ":" + value);
		}
	}
}
