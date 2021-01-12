package impQuestion;

//program to find two string differ by one character. Length of both string is same 

public class oneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String first = "efghi";
		String second = "efnhi";
		
		compare_2_string(first,second);

	}
	
	public static void compare_2_string(String f , String s){
		
		int i=f.length();
		int j= s.length();
		
		int k=0;
		int l=0;
		
		int count =0;
		
		char f1[]=f.toCharArray();
		char s1[]=s.toCharArray();
		
		if (i==j){
			
			while (k<i && l<j){
				if (f1[k]==s1[l]){
					
					k++;
					l++;
				}
				else {
					
					count ++;
					k++;
					l++;
					
				}
				
			}
		}
		
		if (count==1){
			
		 System.out.print("String differ by 1 character");
		}
		
		else
			System.out.print("String differ by more than 1 character");
		
		
	}

}
