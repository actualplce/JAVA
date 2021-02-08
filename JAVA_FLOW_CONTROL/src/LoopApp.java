
public class LoopApp {

	public static void main(String[] args) {
	//	System.out.println(1);
		
//		
//		while(true) {
//			System.out.println(2);
//			System.out.println(3);
//			i++;    				//i=i+1;
//		}							//while의 조건이 true이면 괄호안을 반복해.
//		
//		System.out.println(4);		//위의 while조건을 true로 박아버렸으니, 무한반복되어 이코드는 쓰이지않는다는 경고가 뜸.
//	
//	
		int i = 0;
	
		while(i<3) {
			System.out.println("i:"+i);
			System.out.println(2);
			System.out.println(3);
			i++;    				//i=i+1;
			System.out.println("i:"+i);
			System.out.println("");
		}						//while의 조건이 true이면 괄호안을 반복해.
		
		System.out.println("while반복 끝");	
		
		for(int j=0; j<3; j++) {			//for(초기값; boolean조건; 만족할때 할 행동)
			//for반복문: 몇번반복해! 라고 컴터한테 얘기하고싶을때.
			System.out.println("i:"+i);
			System.out.println("j:"+j);
			System.out.println(2);
			System.out.println(3);
			System.out.println("j:"+j);
			System.out.println("");
		}
		System.out.println("for반복 끝");	
	
	}

}
