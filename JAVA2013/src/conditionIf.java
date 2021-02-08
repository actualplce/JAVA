
public class conditionIf {

	public static void main(String[] args) {
		//조건문if활용 예(with if중첩) 일반적으로 if많이씀.
		String id = args[0];
		String pw = args[1];
		if(id.equals("actualplce")) {
				if(pw.equals("11112")) {
					System.out.println("right,sign in");
				}else{
					System.out.println("get out, can't enter nerd");
				}
		}else {
			System.out.println("get out, can't enter nerd");
			}
		System.out.println("\n");

		System.out.println("if-else if-else");
		//if-elseif-else
		if(false) {
			System.out.println("if조건false면 elseif");
		}else if(false){
			System.out.println("else if가 false면 else");
		}else {
			System.out.println("else통과");
		
		}
		System.out.println("\n");
		
		
		
		//switch 조건문 활용 (조건이 많을때 활용가능)
		//switch 문을 사용할 때 한가지 주의 할 것은 switch의 조건으로는 몇가지 제한된 데이터 타입만을 사용할 수 있다. byte, short, char, int, enum, 
		//String, Character, Byte, Short, Integer(wrapper 타입)
		System.out.println("switch조건문시작 \n switch(1)");
		System.out.println("no breaks");
		System.out.println("\n");

		switch (1) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		case 4:
			System.out.println("four");
		}   //one two three four 전부출력
		System.out.println("\n");

		System.out.println("switch조건문시작 \n switch(1)");
		System.out.println("have breaks");
		System.out.println("\n");

		switch (1) {
		case 1:
			System.out.println("one");
			
		case 2:
			System.out.println("two");   //one two출력후 끝
			break;
		case 3:
			System.out.println("three");
		case 4:
			System.out.println("four");  //switch는 조건 다돌리기때문
		default: 
			System.out.println("아무데도 포함안됩니다.");
			
		
		} //그래서 특정 조건일때만 출력하고플때 break;사용해라.
		System.out.println("\n");
		
		switch (4) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");   
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		default: 
			System.out.println("아무데도 포함안됩니다.");
		
		}  //default출력
		
		
		
		
		
		
	}

}
