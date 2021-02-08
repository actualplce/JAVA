
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
		while(i < divideRates.length) {	//우리는 3번반복
			System.out.println("Divider: "+ (i+1));	//Divider: 0,1,2	
			System.out.println("DivideRate: "+divideRates[i]);
			System.out.println("Earinigs: "+ getIncome()*divideRates[i]);//만들어진메소드를 사용하는 코드
			//DivideRate: 0.5,0.3,0.2
			i++;
		
		}
	}

	private static void print() {
		System.out.println("Value of supply : " + valueOfSupply);// 공급가
		System.out.println("VAT : " + getVAT()); // 내가 국가에 낸 돈, 세금
		System.out.println("Total : " + getTotal()); // 소비자가 11000won
		
		System.out.println("Expense : " + getExpense()); // 30%가 비용이라하면,
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
	}//getVAT메서드를 만드는 코드

}
