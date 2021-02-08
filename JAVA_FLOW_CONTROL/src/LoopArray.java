
public class LoopArray {

	public static void main(String[] args) {
		//반복문 또다른예제
		
		/*잠시 html태그를 붙임.
		 *
		 */
		
		String[] users = new String[3];
		users[0] = "actualplce";
		users[1] = "JinHyuk";
		users[2] = "Kangname";
		
		System.out.println("");	//배열은 어떻게 출력하나
		
		for(int i=0; i<3; i++) {
//			System.out.println("<li>actualplce</li>"); //색인에 활용되.
//			System.out.println("<li>JinHyuk</li>");
//			System.out.println("<li>Kangname</li>");
		
			System.out.println("이걸 이렇게 users[i]로 간단히나타낼수있지.");
			System.out.println("<li>"+users[i]+"</li>,");
			
			
		}
		System.out.println("근데 조건문이 단순히 i<3이면 비효율적, 3이아닐땐어케?");
		System.out.println("i<users.length로 하면되지! 이렇게!");
		
		String[] users1 = new String[6];
		users1[0] = "actualplce";
		users1[1] = "JinHyuk";
		users1[2] = "Kangname";
		users1[3] = "jk";
		users1[4] = "as";
		users1[5] = "a";
		
		for(int i=0; i<users1.length; i++) {
	
			System.out.println("<li>"+users1[i]+"</li>,");
			
			}
		
		
	}

}
