
public class LoopApp {

	public static void main(String[] args) {
	//	System.out.println(1);
		
//		
//		while(true) {
//			System.out.println(2);
//			System.out.println(3);
//			i++;    				//i=i+1;
//		}							//while�� ������ true�̸� ��ȣ���� �ݺ���.
//		
//		System.out.println(4);		//���� while������ true�� �ھƹ�������, ���ѹݺ��Ǿ� ���ڵ�� �������ʴ´ٴ� ��� ��.
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
		}						//while�� ������ true�̸� ��ȣ���� �ݺ���.
		
		System.out.println("while�ݺ� ��");	
		
		for(int j=0; j<3; j++) {			//for(�ʱⰪ; boolean����; �����Ҷ� �� �ൿ)
			//for�ݺ���: ����ݺ���! ��� �������� ����ϰ������.
			System.out.println("i:"+i);
			System.out.println("j:"+j);
			System.out.println(2);
			System.out.println(3);
			System.out.println("j:"+j);
			System.out.println("");
		}
		System.out.println("for�ݺ� ��");	
	
	}

}
