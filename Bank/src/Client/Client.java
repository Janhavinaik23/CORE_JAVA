package Client;
    
    import Application.MMBankFactory;
	import Application.MMCurrentAcc;
	import Application.MMSavingAcc;

	public class Client 
	{
		public static void main(String[] args)
		{
			//step a
			MMBankFactory mmbfactory=new MMBankFactory();
		    mmbfactory).getNewSavingAccount(708326, "JANHAVI", 25000, true);
			mmbfactory.getNewCurrentAccount(897585, "JUHI", 50000, 100000);
			
			//step b
			MMSavingAcc mmsaving=new MMSavingAcc(708326, "JANHAVI", 25000, true);
			mmsaving.getAccNo();
			mmsaving.getAccNm();
			mmsaving.getAccBal();
			mmsaving.withdraw(25000);
			mmsaving.toString();
			
			MMCurrentAcc mmcurrent=new MMCurrentAcc(897585, "JUHI", 50000, 100000);
			mmcurrent.getAccNo();
			mmcurrent.getAccNm();
			mmcurrent.getAccBal();
			mmcurrent.withdraw(50000);
			mmcurrent.toString();


		}

	}

