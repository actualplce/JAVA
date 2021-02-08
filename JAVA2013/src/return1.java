
public class return1 {

//	  public static int one() {
//	        return 1;
//	        return 2;   //error:unreachable code 
//	        return 3;
//	    }
//	 
//	    public static void main(String[] args) {
//	        System.out.println(one());
//	    }

	
	  public static String num(int i) {
	        if(i==0){
	            return "zero";
	        } else if(i==1){
	            return "one";
	        } else if(i==2){
	            return "two";
	        }
	        return "none";  //만약 암것도해당안되면 none 리턴.
	    }
	 
	    public static void main(String[] args) {
	        System.out.println(num(10));  //none
	    }
	
}
