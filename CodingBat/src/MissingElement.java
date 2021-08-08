
public class MissingElement {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 2,3,100 }));
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8

		int[] found = new int[A.length + 1];
		int num = 1;
		for (int i = 0; i < A.length; i++) {
			int val = A[i];
			if (val < A.length) {
				found[val] = 1;
			}
		}
		for (int j = 1; j <= found.length; j++) {
			if (found[j] != 1) {
				num = j;
				break;
			}
		}
		return num;
	}

}
