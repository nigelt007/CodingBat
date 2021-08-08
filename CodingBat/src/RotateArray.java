import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray {

	public static void main(String[] args) {
		int[] res = solution(new int[] { 1, 2, 3, 4 }, 3);
		List<Integer> list = Arrays.stream(res).boxed().collect(Collectors.toList());
		list.forEach(System.out::println);
	}

	public static int[] solution(int[] A, int K) {

		for (int i = 0; i < K; i++) {
			int temp = A[0];
			for (int j = 0; j <= A.length-1; j++) {
				if (j == A.length - 1) {
					A[0] = temp;
				} else {
					int val = temp;
					temp = A[j+1];
					A[j+1] = val;
				}
			}
		}
		return A;
	}

}
