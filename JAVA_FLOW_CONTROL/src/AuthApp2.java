
public class AuthApp2 {


	public static void main(String[] args) {
		//�α��� ���α׷��� ����ž�.
		System.out.println(args[0]); //actualplce (�Ʊ� configuration�ذ�)
		System.out.println(args[1]);
		String ID="actualplce";
		String inputID = args[0];
		
		String PW = "1111";
		String PW2 = "2222";
		String inputPW = args[1];
		
		System.out.println("�ȴ� ??");
		
		boolean isRightPass = inputID.equals(ID)&&(PW.equals(inputPW)||PW2.equals(inputPW));
		//if()�� ������ϱ� �Ҹ��� ������ ���� ������ ���� �����ϰ� ǥ�����ִ°���.
		if(isRightPass) {	//&&�� and , ||�� or
			System.out.println("�� �Դ�?");
		}else {
			System.out.println("��������");
		} 								//�� �Դ�			
		
		
		
		
		
		
	}
}
