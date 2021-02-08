
public class LogicalOperatorApp {

	public static void main(String[] args) {
		
		//AND연산자 &&
		System.out.println(1==1);	//true
		System.out.println(true&&true); //논리연산자는 둘 다 true여야 true반환
		System.out.println(false&&true);//false
		
		//OR연산자 ||
		System.out.println(true||true); //true
		System.out.println(true||false); //true
		
		//NOT연산자 !
		System.out.println(!true); //false
		System.out.println(!false); //true
		
		
		
	}

}
