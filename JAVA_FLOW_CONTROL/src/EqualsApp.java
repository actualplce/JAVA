
public class EqualsApp {

	public static void main(String[] args) {
		int p1 = 1;
		int p2 = 1; 
		System.out.println(p1==p2);	//true
		//System.out.println(p1.equals(p2)); error, ����Ÿ�Կ��� equals()�޼��� ���Ұ�.
		String o1 = new String ("j");
		String o2 = new String ("j");
		System.out.println(o1==o2);			//false(�ּҰ��� �ٸ�, new�ϱ�.)
		System.out.println(o1.equals(o2)); 	//true(���� ����.)
		
		String o3 = "java";
		String o4 = "java";
		System.out.println(o1==o2);	
		//(����)true, new�� �ƴϴϱ� ���� �ּҰ����� ����ٿ�.
		//�ٵ� false�� ����. �̷� ����, java���ڿ��� �ٸ� ����ҿ� ����Ǿ��⶧���� �׷�.
		//����, ����õ�����Ÿ���� equals()�޼ҵ带 ���� ���ϴ� ���� ����.
		//(�ٸ� ����ҿ� ����ɰ��, ����� �ٸ� ����� ����� �� �ֱ⶧��.)
		System.out.println(o1.equals(o2));	

	}

}
