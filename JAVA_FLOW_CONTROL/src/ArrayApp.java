
public class ArrayApp {

	public static void main(String[] args) {
		//actualplce, JH, YB
		//배열을 사용하여 간단히 표현.
		String[] users =new String[3]; //users라는 이름의 배열, 값 3개 들어가.
		users[0] = "actualplce";		//첫번째를 0부터 카운팅해. 첫 유저는 actualplce
		users[1] = "JH";		//두번째유저는 JH..
		users[2] = "YB";
		
		System.out.println("users[0]는 첫번째 요소를 나타내 "+users[0]);
		System.out.println("몇칸짜리 배열이니?(length) "+users.length);
		System.out.println("");
		//int[] scores = new int[3]; 이렇게할수있는데 처음선언할때 요소아예넣고싶으면
		int[] scores = {10, 20, 35}; //이렇게 scores배열안에 요소넣을수있어.
		System.out.println("스코어 첫번째[0]:  "+scores[0]);
		System.out.println("스코어배열은 몇칸?  :  "+scores.length);
		
		
	}

}
