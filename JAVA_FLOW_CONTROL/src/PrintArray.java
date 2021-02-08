import java.util.Arrays;
import java.util.List;

public class PrintArray {

	public static void main(String[] args) {
		//�迭�� ��ü��� �� ��¹��
		//1. for or for-each �ݺ��� Ȱ��
		//2. Arrays.toString()
		//3. Arrays.deepToString()
		//4. Arrays.asList()
		//5. Java Iterator(�ݺ���) interface
		//6. Java Stream API
		
		int[] intArray = {11, 22, 33, 44};
		
		//1. for or for-each �ݺ��� Ȱ��
		System.out.println("FOR/FOR-EACH");
		System.out.println("for(int i=0;i<Array.length;i++): ");
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);	//11/n22/n33/n44
		}
		
		System.out.println("for(int j: intArray): ");
		for(int j: intArray) {
			System.out.println(j);				//11/n22/n33/n44
		}

		//2. Arrays.toString():1�����迭 ���
		System.out.println("Arrays.toString(intArray): ");
		System.out.println(Arrays.toString(intArray));		//[11,22,33,44]
		
		//3. Arrays.deepToString():1�����̻�迭 ���
		
		int[][] overArray = {
				{11,22},
				{22,33}
		};						
		System.out.println("Arrays.deepToString(overArray): ");
		System.out.println(Arrays.deepToString(overArray)); //[[11,22],[22,33]]
		
		
		//4. Arrays.asList():������ �迭�� �����ϴ� ���� ũ���� ����� ����
		System.out.println("Arrays.asList(overArray): �� �迭�� �����ϴ� ���� ũ�� ��� ");
		System.out.println(Arrays.asList(intArray).toString());
		
		//Teacher[] teacher = { new Teacher("John"), new Teacher("Mary")};
//		System.out.println(Arrays.asList(teacher)); //[Teacher{name='John'}, Teacher{name='Mary}]
//		
		
//		System.out.println("Java Iterator(�ݺ���) interface: ");
//		
//		Integer[] intArray2= {2,3,4,12,35};
//		//������� ����
//		List<Integer>list = Arrays.asList(intArray2);
//	
//		//��������� �ݺ���iterator����
//		Iterator<Integer>it = list.iterator();
//		
//		//List�� �ݺ��� ��Ұ� �ִ� ���
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		//2341235
//		}
//		
//		
//		System.out.println(Arrays.asList(intArray).toString());
//		
		//5. Java Iterator(�ݺ���) interface
		//6. Java Stream API
	}

}
