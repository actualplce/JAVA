
public class LoopArray {

	public static void main(String[] args) {
		//�ݺ��� �Ǵٸ�����
		
		/*��� html�±׸� ����.
		 *
		 */
		
		String[] users = new String[3];
		users[0] = "actualplce";
		users[1] = "JinHyuk";
		users[2] = "Kangname";
		
		System.out.println("");	//�迭�� ��� ����ϳ�
		
		for(int i=0; i<3; i++) {
//			System.out.println("<li>actualplce</li>"); //���ο� Ȱ���.
//			System.out.println("<li>JinHyuk</li>");
//			System.out.println("<li>Kangname</li>");
		
			System.out.println("�̰� �̷��� users[i]�� ��������Ÿ��������.");
			System.out.println("<li>"+users[i]+"</li>,");
			
			
		}
		System.out.println("�ٵ� ���ǹ��� �ܼ��� i<3�̸� ��ȿ����, 3�̾ƴҶ�����?");
		System.out.println("i<users.length�� �ϸ����! �̷���!");
		
		String[] users1 = new String[6];
		users1[0] = "actualplce";
		users1[1] = "JinHyuk";
		users1[2] = "Kangname";
		users1[3] = "jk";
		users1[4] = "as";
		users1[5] = "a";
		
		for(int i=0; i<users1.length; i++) {
	
			System.out.println("<li>"+users1[i]+"</li>,");
			
			}
		
		
	}

}
