
public class return2 {

	 public static String[] getMembers() {
	        String[] members = { "최진혁", "최유빈", "한이람" };   //members배열안에 다 담아서 
			        return members;                                    //return에 실어보냄.
	    }
	 
	    public static void main(String[] args) {
	        String[] members = getMembers();             //getmember()로 멤버모두불러옴. 이때, String[]으로 가져와야 다 불러올수있다.
	        for(int i=0;i<members.length;i++) {
	        	System.out.println(members[i]+"\n");
	        }
//	        최진혁
//
//	        최유빈
//
//	        한이람


	    
	    }
}
