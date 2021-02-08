
public class AccountingMethodApp {

	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;

	public static void main(String[] args) { 
		
		valueOfSupply = Double.parseDouble(args[0]);
		vatRate = 0.1;
		expenseRate = 0.3;	
		print(); 
		
		double[] divideRates = new double[3]; 
		divideRates[0]=0.5;
		divideRates[1]=0.3;
		divideRates[2]=0.2;
		
			
		int i=0;
		while(i < divideRates.length) {	//�츮�� 3���ݺ�
			System.out.println("Divider: "+ (i+1));	//Divider: 0,1,2	
			System.out.println("DivideRate: "+divideRates[i]);
			System.out.println("Earinigs: "+ getIncome()*divideRates[i]);//��������޼ҵ带 ����ϴ� �ڵ�
			//DivideRate: 0.5,0.3,0.2
			i++;
		
		}
	}

	private static void print() {
		System.out.println("Value of supply : " + valueOfSupply);// ���ް�
		System.out.println("VAT : " + getVAT()); // ���� ������ �� ��, ����
		System.out.println("Total : " + getTotal()); // �Һ��ڰ� 11000won
		
		System.out.println("Expense : " + getExpense()); // 30%�� ����̶��ϸ�,
		System.out.println("Income : " + getIncome());
		
		
	}

	private static double getIncome() {
		return valueOfSupply  - getExpense();
	}

	private static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private static double getTotal() {
		return valueOfSupply +getVAT();
	}

	private static double getVAT() {
		return valueOfSupply * vatRate;
	}//getVAT�޼��带 ����� �ڵ�

}
