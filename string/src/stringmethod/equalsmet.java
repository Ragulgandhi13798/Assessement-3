package stringmethod;

public class equalsmet {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		
		if(s1.equals(s2))
		{
			System.out.println("same");
		}
		
		else
		{
			System.out.println("not same");
		}
		

		
		//boolean method
		
		    String str1 = "Learn Java";
	        String str2 = "Learn Java";
	        String str3 = "Learn Kolin";
	        Boolean result;
	        
	        result = str1.equals(str2);
	        System.out.println(result); 
	        
	        result = str1.equals(str3);
	        System.out.println(result); 

	        
	        result = str3.equals(str1);
	        System.out.println(result); 
	    
		// TODO Auto-generated method stub
	        

	}

}
