
public class EqualsApp {

	public static void main(String[] args) {
		int p1 = 1;
		int p2 = 1; 
		System.out.println(p1==p2);	//true
		//System.out.println(p1.equals(p2)); error, 원시타입에는 equals()메서드 사용불가.
		String o1 = new String ("j");
		String o2 = new String ("j");
		System.out.println(o1==o2);			//false(주소값은 다름, new니까.)
		System.out.println(o1.equals(o2)); 	//true(값은 같음.)
		
		String o3 = "java";
		String o4 = "java";
		System.out.println(o1==o2);	
		//(예상)true, new가 아니니까 같은 주소값에서 끌어다옴.
		//근데 false가 나옴. 이런 경우는, java문자열이 다른 저장소에 저장되었기때문에 그럼.
		//따라서, 비원시데이터타입은 equals()메소드를 통해 비교하는 것이 적절.
		//(다른 저장소에 저장될경우, 예상과 다른 결과가 도출될 수 있기때문.)
		System.out.println(o1.equals(o2));	

	}

}
