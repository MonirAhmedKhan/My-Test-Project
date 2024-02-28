
public class ReverseString_3 {

	public static void main(String[] args) {

		// Using String Buffer Class

		String str = "ABCDE";
		//String rev = "";// null;
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());

	}

}
