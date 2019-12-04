
public class ReverseEachWord {
static void reverseEachWord(String inputString) {
	String []words=inputString.split(" ");
	String reverseWords=" ";
	for (int i = 0; i < words.length; i++) {
		String word=words[i];
		String reverdeWord=" ";
		for (int  j = word.length()-1;j >=0; j--) {
			reverdeWord=reverdeWord+word.charAt(j);
			
		}
		reverseWords=reverseWords+reverdeWord+" ";
		
		
	}
	System.out.println(reverseWords);
}
public static void main(String[] args) {
	reverseEachWord("sanjay kumar singh");
}
}
