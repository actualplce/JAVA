
public class AccountingAppArray {

	public static void main(String[] args) { //문자열로 이루어져있는 배열 String[]
		//args: String[]수납함에 있는 내용물을 끄집어내겠단 얘기
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double VAT = valueOfSupply * vatRate;
		double Total = valueOfSupply +VAT;
		double expenseRate=0.3;
		
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply  - expense;
		
		//double divideRate1=0.5;
		//double divideRate2=0.3;
		//double divideRate3=0.2;
		double[] divideRates = new double[3]; //더블형데이터를 3개담을수있는 수납상자
		divideRates[0]=0.5;
		divideRates[1]=0.3;
		divideRates[2]=0.2;
		
		double divide1 = income*divideRates[0];
		double divide2 = income*divideRates[1];
		double divide3 = income*divideRates[2];
		
		
		System.out.println("Value of supply : " + valueOfSupply);// 공급가
		System.out.println("VAT : " + VAT); // 내가 국가에 낸 돈, 세금
		System.out.println("Total : " + Total); // 소비자가 11000won
		
		System.out.println("Expense : " + expense); // 30%가 비용이라하면,
		System.out.println("Income : " + income); // 내가 번 돈은 전체-비용
		System.out.println("Divide1: "+ divide1);
		System.out.println("Divide2: "+ divide2);
		System.out.println("Divide3: "+ divide3);
		
		
	}

}
