
public class conditionIf {

	public static void main(String[] args) {
		//���ǹ�ifȰ�� ��(with if��ø) �Ϲ������� if���̾�.
		String id = args[0];
		String pw = args[1];
		if(id.equals("actualplce")) {
				if(pw.equals("11112")) {
					System.out.println("right,sign in");
				}else{
					System.out.println("get out, can't enter nerd");
				}
		}else {
			System.out.println("get out, can't enter nerd");
			}
		System.out.println("\n");

		System.out.println("if-else if-else");
		//if-elseif-else
		if(false) {
			System.out.println("if����false�� elseif");
		}else if(false){
			System.out.println("else if�� false�� else");
		}else {
			System.out.println("else���");
		
		}
		System.out.println("\n");
		
		
		
		//switch ���ǹ� Ȱ�� (������ ������ Ȱ�밡��)
		//switch ���� ����� �� �Ѱ��� ���� �� ���� switch�� �������δ� ��� ���ѵ� ������ Ÿ�Ը��� ����� �� �ִ�. byte, short, char, int, enum, 
		//String, Character, Byte, Short, Integer(wrapper Ÿ��)
		System.out.println("switch���ǹ����� \n switch(1)");
		System.out.println("no breaks");
		System.out.println("\n");

		switch (1) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		case 4:
			System.out.println("four");
		}   //one two three four �������
		System.out.println("\n");

		System.out.println("switch���ǹ����� \n switch(1)");
		System.out.println("have breaks");
		System.out.println("\n");

		switch (1) {
		case 1:
			System.out.println("one");
			
		case 2:
			System.out.println("two");   //one two����� ��
			break;
		case 3:
			System.out.println("three");
		case 4:
			System.out.println("four");  //switch�� ���� �ٵ����⶧��
		default: 
			System.out.println("�ƹ����� ���Ծȵ˴ϴ�.");
			
		
		} //�׷��� Ư�� �����϶��� ����ϰ��ö� break;����ض�.
		System.out.println("\n");
		
		switch (4) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");   
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		default: 
			System.out.println("�ƹ����� ���Ծȵ˴ϴ�.");
		
		}  //default���
		
		
		
		
		
		
	}

}
