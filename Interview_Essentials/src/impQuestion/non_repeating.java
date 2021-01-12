package impQuestion;

import java.util.HashMap;
import java.util.Map.Entry;

public class non_repeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [] alphabet= {'a','b','c','d','a'};
		
		char uniquechar1= non_repeat_char(alphabet);
		
		System.out.println("The unqiue character" +uniquechar1);

	}

	public static char non_repeat_char (char[] alpha1){
		
		HashMap<Character,Integer> uniquechar= new HashMap <Character,Integer>();
		
		for (char c : alpha1) {
            if (uniquechar.containsKey(c)) {
                Integer newVal = uniquechar.get(c) + 1;
                uniquechar.put(c, newVal);
            } else {
            	uniquechar.put(c, 1);
            }
        }
        for (char c : alpha1) {
            if (uniquechar.get(c) == 1) return c;
        }
        return (Character) null;
    }
	}

