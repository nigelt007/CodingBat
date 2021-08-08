
public class FrogJump {

	public static void main(String[] args) {
		System.out.println(solution(1, 999999999, 2));
	}

	public static int solution(int X, int Y, int D) {

		int sum = X;
		int jump = 0;
		while (sum < Y) {
			if (D < 0) {
				break;
			}
			sum = sum + D;
			jump++;
		}
		return jump;
	}

}
