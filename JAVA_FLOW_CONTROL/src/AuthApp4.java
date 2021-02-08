import java.util.Arrays;

public class AuthApp4 {

	public static void main(String[] args) {
		//���̵�� ����� ���ļ� �迭�ȿ� �Ǵٸ��迭�� ���� �ϰ�;�. 
		String[][] users = {
				{"actualplce", "1111"},
				{"JH", "1112"},
				{"YB", "1113"}
				
		};														
		
		System.out.println("1�����̻��� �迭����� Arrays.deepToString(): ");
		System.out.println("users: "+Arrays.deepToString(users)); //1�����̻��� �迭����� Arrays.deepToString()�̿�!
		System.out.println("users[0]: "+Arrays.deepToString(users[0]));
		System.out.println("users[1]: "+Arrays.deepToString(users[1]));
		System.out.println("users.length:"+users.length);	//users.length: 3
		System.out.println("users[0].length:"+users[0].length);	//users[0].length: 2
		System.out.println("");
		
		String inputID = args[0];
		String inputPW = args[1];
		System.out.println("inputID:"+inputID);
		System.out.println("inputPW:"+inputPW);
		System.out.println("");
		
		
		boolean isLogined = false; 								//�ʱ����:�α��ξȵ�(false).   (�÷��׺���)
		for(int i=0; i<users.length; i++) {						//0���ε������� users�迭������ �ݺ�
																//String currentID = users[i]; 
																//��������(��� ���� ����ٿ��ذ���. ��ó���ص� �۵��� ��.)
			//System.out.println("(ó��)isLogined:"+isLogined);
																//searching(�迭�� ��Ҹ� �� ����)
			
			String[][] current = users;
			String[] currentShort = users[i];
			
			System.out.println("i: "+i);
			System.out.println("current(users)-length:3");
			System.out.println("currentShort(users[i])-length:2");
			System.out.println("");
			System.out.println("current�迭(users)��?:"+Arrays.deepToString(current));
			System.out.println("current[0]:"+current[0]);								//[Ljava.lang.String;@28a418fc
			System.out.println("current[0]-deepToString:"+Arrays.deepToString(current[0]));	//[actualplce, 1111]
			System.out.println("");
			
			System.out.println("currentShort�迭(users[i])��?: "+Arrays.deepToString(currentShort));	//i��0: [JH, 1112], i��1:[JH, 1112], i��2: [YB, 1113]
			System.out.println("currentShort[0]-users[i][0]:"+currentShort[0]);
			System.out.println("currentShort[1]-users[i][1]:"+currentShort[1]);
			//System.out.println("currentShort[1]:"+currentShort[2]);  //error currentShort�� index�� 0,1�ۿ�����.
			System.out.println("");
			System.out.println("");
			
			//����, args[0]�� ���� ��(inputID)�� users��Ͽ� ������,�̷����Ұž�.
			if(		 			
					                                //�ֿ��⼭�ڲ� ����������..
					currentShort[0].equals(inputID) &&
					currentShort[1].equals(inputPW)
			  ) {			
				isLogined = true;	//�Ҹ��� isLogined=true�� �ٲ�.
				System.out.println("(����)isLogined:"+isLogined);
			break; 											   //�׸��� �α����� ���̶��, ��������.
			}
		}
		
		System.out.println("");	
		System.out.println("HI");
		System.out.println("isLogined:"+isLogined);
		if(isLogined) {											 //configuration���� �� �������� users��Ͽ� ���°��̸� 
																//�Ҹ��� isLogined�� false�γ��Ƽ� '�ʴ�����?'����
			System.out.println("�� �Դ�?");
		}else {
			System.out.println("�ʴ�����");
		}

	}

}
