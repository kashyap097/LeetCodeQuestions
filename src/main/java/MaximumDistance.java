import java.util.*;

public class MaximumDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ls = new ArrayList<Integer>();
		List ls1 = new ArrayList<Integer>();
//		ls1.add(1);
//		ls1.add(2);
//		ls1.add(3);
		ls1.add(4);
		ls1.add(5);
		
		List ls2 = new ArrayList<Integer>();
		ls2.add(1);
		ls2.add(2);
		ls2.add(3);

		
		List ls3 = new ArrayList<Integer>();
		ls3.add(1);
		ls3.add(2);
		ls3.add(3);
		
		ls.add(ls1);
		ls.add(ls2);
		ls.add(ls3);
		
		
		int value = maxDistance(ls);
		
		System.out.println(value);

	}
	
	public static int maxDistance(List<List<Integer>> arrays) {
		
		int smallest = arrays.get(0).get(0);
        int biggest = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;
        

        for (int i = 1; i < arrays.size(); i++) {
        	
            maxDistance = Math.max(maxDistance, Math.abs(arrays.get(i).get(arrays.get(i).size() - 1) - smallest));
            
            maxDistance = Math.max(maxDistance, Math.abs(biggest - arrays.get(i).get(0)));
            
            smallest = Math.min(smallest, arrays.get(i).get(0));
            
            biggest = Math.max(biggest, arrays.get(i).get(arrays.get(i).size() - 1));
            
            
        }

        return maxDistance;
		
	}

}
