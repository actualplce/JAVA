
public class BooleanApp {

	public static void main(String[] args) {
		System.out.println("One");//String���ڿ�
		System.out.println(1); //integer����
		System.out.println(true);//boolean-true������Ÿ��
		System.out.println(false);//boolean-false������Ÿ��
		
		String foo = "Hello World";
		//String true="Hello World"; reserved word(�����)�� ���������� �����ϰԵǸ� error��.
		
		System.out.println(foo.contains("world")); //false (ù���� �빮�ھƴϾ)
		System.out.println(foo.contains("World")); //true
		System.out.println(foo.contains("H")); //true
		System.out.println(foo.contains("1"));//false
		
		

	}

}
