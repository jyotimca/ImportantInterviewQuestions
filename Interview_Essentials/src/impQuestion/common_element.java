package impQuestion;
//Programme to find common element in array

import java.util.ArrayList;

public class common_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = {1, 3, 4, 6, 7, 9};
		int a2[] = {3, 2, 4, 5, 9, 10};
		
		common_elements(a1,a2);
		
		

	}
	
	public static void common_elements(int arr1[], int arr2[]){
		
		//ArrayList <Integer> al = new ArrayList<Integer>();
		int j=0;
		int i =0;
		
		while(i<arr1.length && j <arr2.length){
				
				if (arr1[i]==arr2[j]){
					
					System.out.println(arr1[i]);
					//al.add(i);	
					i++;
					j++;
				}
				else if (arr1[i]>arr2[j]){
					
					j++;
				}
				else 
					i++;
			}
		
		
		
	}


}
