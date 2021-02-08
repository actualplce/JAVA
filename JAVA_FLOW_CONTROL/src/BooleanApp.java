
public class BooleanApp {

	public static void main(String[] args) {
		System.out.println("One");//String문자열
		System.out.println(1); //integer정수
		System.out.println(true);//boolean-true데이터타입
		System.out.println(false);//boolean-false데이터타입
		
		String foo = "Hello World";
		//String true="Hello World"; reserved word(예약어)라서 변수명으로 지정하게되면 error뜸.
		
		System.out.println(foo.contains("world")); //false (첫글자 대문자아니어서)
		System.out.println(foo.contains("World")); //true
		System.out.println(foo.contains("H")); //true
		System.out.println(foo.contains("1"));//false
		
		

	}

}
