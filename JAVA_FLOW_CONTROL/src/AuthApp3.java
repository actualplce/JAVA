
public class AuthApp3 {

	public static void main(String[] args) {
	//configuration(args[0])�� actualplce�� ù������ isLogined=true��.
	//configuration(args[0])�� riche�� 3���� ���غ��� isLogined=false�Ǿ� �ʴ�����?����.
		
		String[] users = {"actualplce", "JH", "YB"};
		String inputID = args[0];
		//users�� �ִ� ��Ͽ� 'inputID'�� ���� ���� �ִ��� üũ�ϰ�ʹ�.
		System.out.println("inputID:"+inputID);
		
		
		boolean isLogined = false; //�ʱ����:�α��ξȵ�(false).   (�÷��׺���)
		
		for(int i=0; i<users.length; i++) {//0���ε������� users�迭������ �ݺ�
			//String currentID = users[i]; //���� ����(��� ���� ����ٿ��ذ���. ��ó���ص� �۵��� ��.)
			System.out.println("(ó��)isLogined:"+isLogined);
			System.out.println("");
			//searching(�迭�� ��Ҹ� �� ����)
			
			//����, args[0]�� ���� ��(inputID)�� users��Ͽ� ������,�̷����Ұž�.
			if(users[i].equals(inputID)) {	//�Է��� ID�� i�ε����� users��Ͽ�������
			//if(currentID.equals(inputID)) {
				
				isLogined = true;	//�Ҹ��� isLogined=true�� �ٲ�.
				System.out.println("(����)isLogined:"+isLogined);
				break;    //�׸��� �α����� ���̶��, ��������.
			}
		}
		
		System.out.println("HI");
		System.out.println("isLogined:"+isLogined);
		if(isLogined) { //configuration���� �� �������� users��Ͽ� ���°��̸� 
						//�Ҹ��� isLogined�� false�γ��Ƽ� '�ʴ�����?'����
			System.out.println("�� �Դ�?");
		}else {
			System.out.println("�ʴ�����");
		}

	}

}
