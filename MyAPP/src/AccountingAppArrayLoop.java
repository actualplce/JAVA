
public class AccountingAppArrayLoop {

	public static void main(String[] args) { 
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double VAT = valueOfSupply * vatRate;
		double Total = valueOfSupply +VAT;
		double expenseRate=0.3;
		
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply  - expense;

		System.out.println("Value of supply : " + valueOfSupply);// 공급가
		System.out.println("VAT : " + VAT); // 내가 국가에 낸 돈, 세금
		System.out.println("Total : " + Total); // 소비자가 11000won
		
		System.out.println("Expense : " + expense); // 30%가 비용이라하면,
		System.out.println("Income : " + income); // 내가 번 돈은 전체-비용

		double[] divideRates = new double[3]; 
		divideRates[0]=0.5;
		divideRates[1]=0.3;
		divideRates[2]=0.2;
		
			
		int i=0;
		while(i < divideRates.length) {	//우리는 3번반복
			System.out.println("Divider: "+ (i+1));	//Divider: 0,1,2	
			System.out.println("DivideRate: "+divideRates[i]);
			System.out.println("Earinigs: "+ income*divideRates[i]);
			//DivideRate: 0.5,0.3,0.2
			i++;
		}
	}

}
