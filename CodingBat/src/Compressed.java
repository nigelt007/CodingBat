
public class Compressed {

	public static void main(String[] args) {
		System.out.println(compressedString("alaasasass"));
	}

	static String compressedString(String message) {

		String[] st = message.split("");
		StringBuilder strB = new StringBuilder();

		for (int i = 0; i < st.length; i++) {
			int cons = 1;
			String str = st[i];
			while (i < st.length - 1 && str.equals(st[i + 1])) {
				cons++;
				i++;
			}
			if (cons > 1) {
				strB.append(str).append(cons);
			} else {
				strB.append(str);
			}

		}
		return strB.toString();
	}

}
