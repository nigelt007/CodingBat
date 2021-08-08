import java.util.HashSet;
import java.util.Set;

public class UnPairedElement {

	public static void main(String[] args) {

		System.out.println(solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));
	}

	public static int solution(int[] A) {

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			int ele = A[i];
			if (!set.contains(ele)) {
				set.add(ele);
			} else {
				set.remove(ele);
			}
		}
		return set.iterator().next();

	}

}
