import java.util.Stack;

public class BinaryGap {

	public void solution(int N) {
		// write your code in Java SE 8

	}

	public static void main(String[] args) {
		String binaryNum = binaryFormat(32);
		String[] nums = binaryNum.split("");
		int largestGap = 0;
		int gapCount = 0;
		boolean gapStart = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i].equals("1") && !gapStart) {
				gapStart = true;
				continue;
			}
			if (gapStart && nums[i].equals("0") && i < nums.length - 1) {
				gapCount++;
				if (gapCount > largestGap) {
					largestGap = gapCount;
				}
			} else if (gapStart && nums[i].equals("0") && i == nums.length - 1) {
				largestGap = 0;
			} else if (gapStart && nums[i].equals("1")) {
				gapCount = 0;
			}
		}
		System.out.println(largestGap);
	}

	private static String binaryFormat(int n) {
		Stack<Integer> stack = new Stack<Integer>();
		String num = "";
		if (n == 0) {
			return num + 0;
		}
		while (n / 2 != 0) {
			int rem = n % 2;
			stack.push(rem);
			n = n / 2;
		}
		int lastN = 1;
		num = num + lastN;
		while (!stack.isEmpty()) {
			int stackN = stack.pop();
			num += stackN;
		}
		return num;
	}

}
