package impQuestion;
//programme to find frequently occuring no in array

import java.util.HashMap;

public class most_frequently {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={1,1,1,3,3};

		int result= most_frequently
				(arr);

		System.out.println("Frequently occuring element" +result );

	}

	public static int most_frequently(int givenarr[]){

		int count =0; int element=0;

		HashMap<Integer,Integer> count1 = new HashMap<Integer,Integer>();

		for ( int i: givenarr){

			if (count1.containsKey(i)){
				Integer newVal= count1.get(i)+1;
				count1.put(i, newVal);
			}

			else{
				count1.put(i, 1);
			}
			if (count1.get(i) > count) {
				count = count1.get(i);
				element = i;
			}
		}

		return element;
	}

}


