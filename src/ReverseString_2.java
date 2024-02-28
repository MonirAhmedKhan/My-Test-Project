
public class ReverseString_2 {

	public static void main(String[] args) {

		// Using character array
		String str = "ABCD";
		String rev = "";// null;

		// Convert string to char
		char a[] = str.toCharArray();
		int len = a.length;
		for (int i = len - 1; i >= 0; i--) {// 3 2 1 0 -1
			rev = rev + a[i]; // D C B A
		}
		System.out.println("Revered String is:" + rev);
	}

}
