
public class AuthApp2 {


	public static void main(String[] args) {
		//로그인 프로그램을 만들거야.
		System.out.println(args[0]); //actualplce (아까 configuration준거)
		System.out.println(args[1]);
		String ID="actualplce";
		String inputID = args[0];
		
		String PW = "1111";
		String PW2 = "2222";
		String inputPW = args[1];
		
		System.out.println("안뇽 ??");
		
		boolean isRightPass = inputID.equals(ID)&&(PW.equals(inputPW)||PW2.equals(inputPW));
		//if()이 길어지니까 불리언 변수를 만들어서 다음과 같이 간단하게 표현해주는거지.
		if(isRightPass) {	//&&는 and , ||는 or
			System.out.println("어 왔니?");
		}else {
			System.out.println("누구세요");
		} 								//어 왔니			
		
		
		
		
		
		
	}
}
