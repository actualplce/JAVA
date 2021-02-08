import java.util.Arrays;

public class AuthApp4 {

	public static void main(String[] args) {
		//아이디와 비번을 합쳐서 배열안에 또다른배열이 들어가게 하고싶어. 
		String[][] users = {
				{"actualplce", "1111"},
				{"JH", "1112"},
				{"YB", "1113"}
				
		};														
		
		System.out.println("1차원이상의 배열출력은 Arrays.deepToString(): ");
		System.out.println("users: "+Arrays.deepToString(users)); //1차원이상의 배열출력은 Arrays.deepToString()이용!
		System.out.println("users[0]: "+Arrays.deepToString(users[0]));
		System.out.println("users[1]: "+Arrays.deepToString(users[1]));
		System.out.println("users.length:"+users.length);	//users.length: 3
		System.out.println("users[0].length:"+users[0].length);	//users[0].length: 2
		System.out.println("");
		
		String inputID = args[0];
		String inputPW = args[1];
		System.out.println("inputID:"+inputID);
		System.out.println("inputPW:"+inputPW);
		System.out.println("");
		
		
		boolean isLogined = false; 								//초기상태:로그인안됨(false).   (플래그변수)
		for(int i=0; i<users.length; i++) {						//0번인덱스부터 users배열수까지 반복
																//String currentID = users[i]; 
																//현재유저(라고 따로 별명붙여준것임. 밑처럼해도 작동은 해.)
			//System.out.println("(처음)isLogined:"+isLogined);
																//searching(배열의 요소를 다 돌려)
			
			String[][] current = users;
			String[] currentShort = users[i];
			
			System.out.println("i: "+i);
			System.out.println("current(users)-length:3");
			System.out.println("currentShort(users[i])-length:2");
			System.out.println("");
			System.out.println("current배열(users)은?:"+Arrays.deepToString(current));
			System.out.println("current[0]:"+current[0]);								//[Ljava.lang.String;@28a418fc
			System.out.println("current[0]-deepToString:"+Arrays.deepToString(current[0]));	//[actualplce, 1111]
			System.out.println("");
			
			System.out.println("currentShort배열(users[i])은?: "+Arrays.deepToString(currentShort));	//i가0: [JH, 1112], i가1:[JH, 1112], i가2: [YB, 1113]
			System.out.println("currentShort[0]-users[i][0]:"+currentShort[0]);
			System.out.println("currentShort[1]-users[i][1]:"+currentShort[1]);
			//System.out.println("currentShort[1]:"+currentShort[2]);  //error currentShort의 index가 0,1밖에없어.
			System.out.println("");
			System.out.println("");
			
			//만약, args[0]에 넣은 값(inputID)이 users목록에 있으면,이렇게할거야.
			if(		 			
					                                //왜여기서자꾸 오류가나누..
					currentShort[0].equals(inputID) &&
					currentShort[1].equals(inputPW)
			  ) {			
				isLogined = true;	//불리언 isLogined=true로 바꿈.
				System.out.println("(부합)isLogined:"+isLogined);
			break; 											   //그리고 로그인이 참이라면, 빠져나와.
			}
		}
		
		System.out.println("");	
		System.out.println("HI");
		System.out.println("isLogined:"+isLogined);
		if(isLogined) {											 //configuration에서 준 변수값이 users목록에 없는값이면 
																//불리언 isLogined가 false로남아서 '너누구니?'나옴
			System.out.println("어 왔니?");
		}else {
			System.out.println("너누구니");
		}

	}

}
