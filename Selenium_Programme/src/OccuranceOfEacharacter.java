import java.util.HashMap;

public class OccuranceOfEacharacter {
	static void OccuranceEachCaracter(String inputString) {
		char[] str=inputString.toCharArray();
		HashMap<Character,Integer> charCountMap=new HashMap<Character,Integer>();
		for(char c:str) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			}else {
				charCountMap.put(c, 1);
			}
			
		}
		System.out.println(charCountMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OccuranceEachCaracter("jaisriram");
	}

}
