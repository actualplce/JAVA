
public class AuthApp {

	public static void main(String[] args) {
		//�α��� ���α׷��� ����ž�.
		System.out.println(args[0]); //actualplce (�Ʊ� configuration�ذ�)
		System.out.println(args[1]);
		String ID="actualplce";
		String inputID = args[0];
		String PW = "1111";
		String inputPW = args[1];
		
		System.out.println("&&�� and, ||�� or�ΰž���?");
		
		if(inputID==ID&&PW==inputPW) {	//&&�� and , ||�� or
			System.out.println("�� �Դ�?");
		}else {
			System.out.println("��������");
		}
		//�������� ����. ��? why??!!!!
		//==�� ������ �ּҰ��� ��(Call By Reference, CBR), configuration���� �� �������� �ּҰ��� �ٸ��⶧��. �׷���,
		System.out.println("��, ==�� CBR�̶� CONFIGURATION�ذͰ� �ּҰ��� �ٸ��Լ����Ǿ� ���� STRING���ڿ��̾ FALSE�� ����.");
		
		inputID="actualplce";
		inputPW="1111";			
		System.out.println("�䷡ ���� �������ְ� �ٽ� ������,");
		if(inputID==ID&&PW==inputPW) {
			System.out.println("�� �Դ�?");
		}else {
			System.out.println("��������");
		}//��Ӵ�?
		
		//�޼ҵ�equals()�� �������� ��(Call By Value, CBV)
		System.out.println("�׸���, ����.EQUALS(����) �޼ҵ�� CBV�̶� �� ��ü�� �񱳵Ǿ� TRUE�� ����.");
		if(inputID.equals(ID)&&inputPW.equals(PW)) {
			System.out.println("�� �Դ�?");
		}else {
			System.out.println("��������");
		}	//��Դ�? ��.  ��, �� �� ��ü�� ���ϴ� CBV�� �ҷ����� boolean�� �� �۵�.
		
		
		
	}

}
