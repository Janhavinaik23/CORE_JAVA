package Client;


	import  Application.GSNormalAcc;
	import  Application.GSPrimeAcc;
	import  Application.GSShopFactory;

	public class Client
	{
		public static void main(String[] args)
		{
			//step a
			GSShopFactory gssfactory=new GSShopFactory();
			gssfactory.getNewPrimeAccount(810,"JANHAVI",2000,true);
			gssfactory.getNewNormalAccount(111, "Tns",138,20);
			
			//step b
			GSPrimeAcc gsprime=new GSPrimeAcc(810, "JANHAVI", 2000, true);
			gsprime.getAccNo();
			gsprime.getAccNm();
			gsprime.getCharges();
			gsprime.bookProduct(1999);
			gsprime.toString();
			
			GSNormalAcc gsnormal=new GSNormalAcc(111, "Tns",138, 20);
			gsnormal.getAccNo();
			gsnormal.getAccNm();
			gsnormal.getCharges();
			gsnormal.getDeliverycharges();
			gsnormal.bookProduct(138);
			gsnormal.toString();
			
		}


		

	}

