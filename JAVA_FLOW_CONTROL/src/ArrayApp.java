
public class ArrayApp {

	public static void main(String[] args) {
		//actualplce, JH, YB
		//�迭�� ����Ͽ� ������ ǥ��.
		String[] users =new String[3]; //users��� �̸��� �迭, �� 3�� ��.
		users[0] = "actualplce";		//ù��°�� 0���� ī������. ù ������ actualplce
		users[1] = "JH";		//�ι�°������ JH..
		users[2] = "YB";
		
		System.out.println("users[0]�� ù��° ��Ҹ� ��Ÿ�� "+users[0]);
		System.out.println("��ĭ¥�� �迭�̴�?(length) "+users.length);
		System.out.println("");
		//int[] scores = new int[3]; �̷����Ҽ��ִµ� ó�������Ҷ� ��Ҿƿ��ְ������
		int[] scores = {10, 20, 35}; //�̷��� scores�迭�ȿ� ��ҳ������־�.
		System.out.println("���ھ� ù��°[0]:  "+scores[0]);
		System.out.println("���ھ�迭�� ��ĭ?  :  "+scores.length);
		
		
	}

}
