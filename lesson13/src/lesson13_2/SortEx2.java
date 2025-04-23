package lesson13_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEx2 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 10, 30, 11, 2, 4, 10, 20, 23, 43)); 
		System.out.println(l);
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		};
//		Arrays.asList(new Integer[] {10,20,30});
//		List<Integer> list = new ArrayList<Integer>();
		l.sort(comparator);
		System.out.println(l);
		
		l.sort(new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1 - o2;
		}
	});
		
		l.sort((Integer o1, Integer o2) -> {
				return o1 - o2;
			}
		);
		
		l.sort((o1, o2) -> {
			return o1 - o2;
		});
		
		l.sort((o1, o2) -> o2 - o1);
		

	}
}









