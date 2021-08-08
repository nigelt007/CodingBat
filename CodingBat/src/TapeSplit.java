
public class TapeSplit {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 3, 1, 2, 4, 3 }));
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		int diff = Integer.MAX_VALUE;
		int pfp = Integer.MIN_VALUE;
		int psp = Integer.MAX_VALUE;
		int pdp = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			int fp = 0;
			for (int j = 0; j <= i; j++) {
				fp += A[j];
			}
			int sp = 0;
			for (int k = i + 1; k < A.length; k++) {
				sp += A[k];
			}
			int pd = Math.abs(fp - sp);

			if (pd < diff) {
				diff = pd;
			}
			if (pfp > fp || psp < sp || pdp < pd) {
				break;
			}
			pfp = fp;
			psp = sp;
			pdp = pd;
		}
		return diff;
	}

}
