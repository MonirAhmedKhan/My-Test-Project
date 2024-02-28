
public class ReverseString_1 {
	public static void main(String[] args) {
		// Using + (String concatenation) Operator
		String str = "MADAM";
		String rev = "";// null;
		int len = str.length();// 4
		for (int i = len - 1; i >= 0; i--) {// 3 2 0 -1
			rev = rev + str.charAt(i);// DCBA
		}
		System.out.println("Revered String is:" + rev);

		if (str.equals(rev)) {
			System.out.println(str + " is Palindrome String");
		} else {
			System.out.println(str + " in Not Palindrome String");
		}
	}

}
