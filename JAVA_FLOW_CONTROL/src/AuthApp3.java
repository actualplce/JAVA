
public class AuthApp3 {

	public static void main(String[] args) {
	//configuration(args[0])이 actualplce면 첫번만에 isLogined=true됨.
	//configuration(args[0])이 riche면 3번다 비교해보고 isLogined=false되어 너누구니?나옴.
		
		String[] users = {"actualplce", "JH", "YB"};
		String inputID = args[0];
		//users에 있는 목록에 'inputID'에 들어온 값이 있는지 체크하고싶다.
		System.out.println("inputID:"+inputID);
		
		
		boolean isLogined = false; //초기상태:로그인안됨(false).   (플래그변수)
		
		for(int i=0; i<users.length; i++) {//0번인덱스부터 users배열수까지 반복
			//String currentID = users[i]; //현재 유저(라고 따로 별명붙여준것임. 밑처럼해도 작동은 해.)
			System.out.println("(처음)isLogined:"+isLogined);
			System.out.println("");
			//searching(배열의 요소를 다 돌려)
			
			//만약, args[0]에 넣은 값(inputID)이 users목록에 있으면,이렇게할거야.
			if(users[i].equals(inputID)) {	//입력한 ID가 i인덱스의 users목록에있으면
			//if(currentID.equals(inputID)) {
				
				isLogined = true;	//불리언 isLogined=true로 바꿈.
				System.out.println("(부합)isLogined:"+isLogined);
				break;    //그리고 로그인이 참이라면, 빠져나와.
			}
		}
		
		System.out.println("HI");
		System.out.println("isLogined:"+isLogined);
		if(isLogined) { //configuration에서 준 변수값이 users목록에 없는값이면 
						//불리언 isLogined가 false로남아서 '너누구니?'나옴
			System.out.println("어 왔니?");
		}else {
			System.out.println("너누구니");
		}

	}

}
