public class Main {
	public static void main(String[] args) {
	    String str = "         ,r'\"7\n" + 	// \", \n 이 제어문자다.
		      	     "r`-_   ,'  ,/\n" + 		// \n 이 제어문자다.
				     " \\. \". L_r'\n" + 		// \\, \", \n 이 제어문자다.
				     "   `~\\/\n" + 			// \\, \n 이 제어문자다.
				     "      |\n" + 			// \n 이 제어문자다.
				     "      |";
 
		System.out.print(str);
	}
}