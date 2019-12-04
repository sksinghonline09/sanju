
public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="Sanjay kumar Singh";
int charcount=0;
for(int i=0;i<input.length();i++) {
	if(input.charAt(i)=='S') {
		charcount++;
	}
}
System.out.println(charcount);
	}

}
