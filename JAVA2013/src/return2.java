
public class return2 {

	 public static String[] getMembers() {
	        String[] members = { "������", "������", "���̶�" };   //members�迭�ȿ� �� ��Ƽ� 
			        return members;                                    //return�� �Ǿ��.
	    }
	 
	    public static void main(String[] args) {
	        String[] members = getMembers();             //getmember()�� �����κҷ���. �̶�, String[]���� �����;� �� �ҷ��ü��ִ�.
	        for(int i=0;i<members.length;i++) {
	        	System.out.println(members[i]+"\n");
	        }
//	        ������
//
//	        ������
//
//	        ���̶�


	    
	    }
}
