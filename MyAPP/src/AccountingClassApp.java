class Accounting {
	public static double valueOfSupply;
	public static double vatRate;					//main���� class�� �����ٰŸ� public static -���� �ٲ���ߵ�.
	public static double expenseRate;					//private static - ���� �������� error.
	public static void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal()); 
		
		System.out.println("Expense : " + getExpense()); 
		System.out.println("Income : " + getIncome());
		
		
	}

	public static double getIncome() {
		return valueOfSupply  - getExpense();
	}

	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply +getVAT();
	}

	public static double getVAT() {
		return valueOfSupply * vatRate;
	}//getVAT�޼��带 ����� �ڵ�
	
}
public class AccountingClassApp {

	

	public static void main(String[] args) { 
		
		
		Accounting.valueOfSupply = Double.parseDouble(args[0]);
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
		Accounting.print();
		
		double[] divideRates = new double[3]; 
		divideRates[0]=0.5;
		divideRates[1]=0.3;
		divideRates[2]=0.2;
		
			
		int i=0;
		while(i < divideRates.length) {	//�츮�� 3���ݺ�
			System.out.println("Divider: "+ (i+1));	//Divider: 0,1,2	
			System.out.println("DivideRate: "+divideRates[i]);
			System.out.println("Earinigs: "+ Accounting.getIncome()*divideRates[i]);
			//DivideRate: 0.5,0.3,0.2
			i++;
		
		}
	}

	

}
