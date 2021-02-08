
public class AuthApp {

	public static void main(String[] args) {
		//로그인 프로그램을 만들거야.
		System.out.println(args[0]); //actualplce (아까 configuration준거)
		System.out.println(args[1]);
		String ID="actualplce";
		String inputID = args[0];
		String PW = "1111";
		String inputPW = args[1];
		
		System.out.println("&&는 and, ||는 or인거알지?");
		
		if(inputID==ID&&PW==inputPW) {	//&&는 and , ||는 or
			System.out.println("어 왔니?");
		}else {
			System.out.println("누구세요");
		}
		//누구세요 나옴. 왜? why??!!!!
		//==는 변수의 주소값을 비교(Call By Reference, CBR), configuration에서 준 변수값과 주소값이 다르기때문. 그래서,
		System.out.println("즉, ==는 CBR이라서 CONFIGURATION준것과 주소값이 다르게설정되어 같은 STRING문자열이어도 FALSE가 나옴.");
		
		inputID="actualplce";
		inputPW="1111";			
		System.out.println("요래 따로 설정해주고 다시 돌리면,");
		if(inputID==ID&&PW==inputPW) {
			System.out.println("어 왔니?");
		}else {
			System.out.println("누구세요");
		}//어왓니?
		
		//메소드equals()는 고유값을 비교(Call By Value, CBV)
		System.out.println("그리고, 변수.EQUALS(변수) 메소드는 CBV이라서 값 자체가 비교되어 TRUE가 나옴.");
		if(inputID.equals(ID)&&inputPW.equals(PW)) {
			System.out.println("어 왔니?");
		}else {
			System.out.println("누구세요");
		}	//어왔니? 뜸.  즉, 그 값 자체를 비교하는 CBV로 불러오니 boolean이 잘 작동.
		
		
		
	}

}
