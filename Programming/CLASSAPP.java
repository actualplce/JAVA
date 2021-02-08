
public class CLASSAPP {

	public static String printPW(String text) {
			String out1;
			out1 = text;
			out1 = out1 + "^-^";
			return out1;	
	}
			public static void main(String[] args) {
				System.out.println(Math.PI);//3.141592...
				System.out.println(Math.floor(Math.PI));//3.0
				System.out.println(Math.ceil(Math.PI));//4.0
				System.out.println(Math.round(Math.PI));//3
				
				System.out.println(printPW("¾È´¨ ÇöÁö?")); //¾È´¨ ÇöÁö? ^-^
	}

}
