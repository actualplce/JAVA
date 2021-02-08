import java.util.Arrays;
import java.util.List;

public class PrintArray {

	public static void main(String[] args) {
		//배열의 개체요소 값 출력방법
		//1. for or for-each 반복문 활용
		//2. Arrays.toString()
		//3. Arrays.deepToString()
		//4. Arrays.asList()
		//5. Java Iterator(반복자) interface
		//6. Java Stream API
		
		int[] intArray = {11, 22, 33, 44};
		
		//1. for or for-each 반복문 활용
		System.out.println("FOR/FOR-EACH");
		System.out.println("for(int i=0;i<Array.length;i++): ");
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);	//11/n22/n33/n44
		}
		
		System.out.println("for(int j: intArray): ");
		for(int j: intArray) {
			System.out.println(j);				//11/n22/n33/n44
		}

		//2. Arrays.toString():1차원배열 출력
		System.out.println("Arrays.toString(intArray): ");
		System.out.println(Arrays.toString(intArray));		//[11,22,33,44]
		
		//3. Arrays.deepToString():1차원이상배열 출력
		
		int[][] overArray = {
				{11,22},
				{22,33}
		};						
		System.out.println("Arrays.deepToString(overArray): ");
		System.out.println(Arrays.deepToString(overArray)); //[[11,22],[22,33]]
		
		
		//4. Arrays.asList():지정된 배열이 지원하는 고정 크기의 목록을 리턴
		System.out.println("Arrays.asList(overArray): 이 배열이 지원하는 고정 크기 목록 ");
		System.out.println(Arrays.asList(intArray).toString());
		
		//Teacher[] teacher = { new Teacher("John"), new Teacher("Mary")};
//		System.out.println(Arrays.asList(teacher)); //[Teacher{name='John'}, Teacher{name='Mary}]
//		
		
//		System.out.println("Java Iterator(반복자) interface: ");
//		
//		Integer[] intArray2= {2,3,4,12,35};
//		//정수목록 생성
//		List<Integer>list = Arrays.asList(intArray2);
//	
//		//정수목록의 반복자iterator생성
//		Iterator<Integer>it = list.iterator();
//		
//		//List에 반복할 요소가 있는 경우
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		//2341235
//		}
//		
//		
//		System.out.println(Arrays.asList(intArray).toString());
//		
		//5. Java Iterator(반복자) interface
		//6. Java Stream API
	}

}
