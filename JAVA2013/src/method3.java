
public class method3 {


	
public static void main(String[] args) {
		
				
		String result= sample(1,9);  //메서드호출및실행(높은 활용도).
		System.out.println(result);   //12
		
	}

public static String sample(int init, int limit) {  //method 'sample'의 매개변수limit
	String output="";
	for(int i=init;i<limit;i++) {
		
		
		
		output+=i;    //String 1+ int 2 = "1"+2="12"
		
		
		
		}
	return  output;
}	
}
