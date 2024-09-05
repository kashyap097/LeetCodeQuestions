import java.util.*;

public class MaximumDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ls = new ArrayList<Integer>();
		List ls1 = new ArrayList<Integer>();
		ls1.add(1);
//		ls1.add(2);
//		ls1.add(3);
//		ls1.add(4);
		ls1.add(5);
		
		List ls2 = new ArrayList<Integer>();
//		ls2.add(1);
//		ls2.add(2);
		ls2.add(3);
		ls2.add(4);

		
		List ls3 = new ArrayList<Integer>();
		ls3.add(1);
		ls3.add(2);
		ls3.add(3);
		
		ls.add(ls1);
		ls.add(ls2);
//		ls.add(ls3);
		
		
		int value = maxDistance(ls);
		
		System.out.println(value);

	}
	
	public static int maxDistance(List<List<Integer>> arrays) {
		
		int maxDistance = 0, min = 0, max = 0;
        List<Integer> list = new ArrayList<Integer>();
       for (int i = 0; i < arrays.size(); i++) {
       	
       	Collections.sort(arrays.get(i));
       	for(int j = 0 ; j<arrays.get(i).size(); j++ ) {
               if(arrays.get(i).get(j) != 0)
       		    list.add(arrays.get(i).get(j));
       		
       	}

       }
       Collections.sort(list);
       max = list.get(list.size()-1);
       min = list.get(0);
       maxDistance = max-min;

       return maxDistance;
		
	}

}
