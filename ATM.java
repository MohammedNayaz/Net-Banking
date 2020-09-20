package bank;
import java.util.*;

interface Accounts
{
	void wlcm();
	void login();
	void signin();
	void accounts();
	void loans();
	void investments();
	void deposits();
	void fundTransfer();
	void debit();
	void credit();
	void billPay();
	
}

class Accounting  implements Accounts
{

	int age, ch, ltime ;
	double lpay, inter;
	long accnum, code, dep, pswrd, ncode, pan ,adhr, lamt ;
	String name,nomin, atype, cho, adr, actype;
	
	Scanner S = new Scanner(System.in);
//-------------------------------------------------------------------------------------------------------------	
	
	public void wlcm()
	{		
		System.out.println("------------WELCOME TO OUR BANK----------");
		System.out.println(" -----------     ---------   ----------");
		System.out.println("  1.Sign In      2.Log In    3.Log Out");
		System.out.println(" -----------     ---------   ----------");	
	}
	
//-------------------------------------------------------------------------------------------------------------		
		public void signin()
		{
			System.out.println("Sign-In By Creating New Account");
			System.out.println("Fill the following details...");
			System.out.println("Name:");
			name = S.next();
			System.out.println("Age:");
			age = S.nextInt();
			System.out.println("Adhaar:");
			adhr = S.nextLong();
			System.out.println("Pan Card:");
			pan = S.nextLong();
			System.out.println("Address:");
			adr = S.next();
			System.out.println("Nominee Name:");
			nomin = S.next();
			
			System.out.println("Account Type:.\n1.Saving Account\n2.Current Account");
			int ch = S.nextInt();
			
			if(ch == 1)
			{ 
				atype = "Savings Account"; 
			}
			
			else if(ch ==2)
			{ 
				atype = "Current Account"; 
			}
			
			System.out.println("Minimum Deposit Amount(500):");
			dep = S.nextLong();
			System.out.println("Create Your Password");
			code = S.nextLong();
			System.out.println("-------------------------------");
			System.out.println("--Account Created Successfully--");
			System.out.println("Your Account Number: 10020301");
			accnum=10020301;
			System.out.println("_______________________________");
			System.out.println("Log In to Get your Account Benifits and our Services");
			System.out.println("--------------------------------\n\n");
		}
//-------------------------------------------------------------------------------------------------------------	
			
		public void login()
		{
			
			System.out.println("\nLog-In To Your Bank Account");
				System.out.println("_______________________________________\n");
				System.out.print("Enter your Account Number :\t");
				long a_num = S.nextLong();
				if(a_num == accnum)
				{
					System.out.print("Enter your Password   :\t");
				    pswrd = S.nextLong();
				    
					if(pswrd == code)
					{
						System.out.println("--Login Successfull--");
					}
					else
					{
						System.out.println("--Incorrect password--");
					}
				}
				else
				{
					System.out.println("--Incorrect Account Number--");
				}
				
				if(a_num == accnum && pswrd == code)
				{
					System.out.println("___________________________________________");
					System.out.println("          ----Welcome Back----");
					System.out.println("\n Your Account Number: 10020301");
					System.out.println("Your Current Balance:   Rs."+dep);
					System.out.println("____________________________________________");
					System.out.println("____________Our Services____________\n");
					System.out.println("1.Accounts	2.Loans		3.Investments\n");
					System.out.println("4.Deposits	5.Funds		6.BillPayments\n");
					System.out.println("7.Debit		8.Credit	9.Statements\n");
					System.out.println("10. Log out\n");
					System.out.println("_____________________________________________");
				}
				else
				{
					System.out.println("\n WARNING \n Incorrect Password or Incorrect Account Number...");
					System.out.println("Forgot Password...!(click '1') ");
					int o = S.nextInt();
					if(o == 1)
					{
						System.out.println("Enter your Account Number: ");
						long accno = S.nextLong();
						System.out.println("Enter your Pan Card Number: ");
						long panno = S.nextLong();
						if(accnum == accno && pan == panno )
						{
							System.out.println("Enter new pin");
							ncode = S.nextLong();
							code= ncode;
							System.out.println("Login Once Agin...");
							login();
							
						}
						else
						{
							System.out.println("\n WARNING \n No Account Exist...");
							signin();
						}
						
					}
				}
			
		}
	//-------------------------------------------------------------------------------------------------------------	
	public void accounts()
	{
		System.out.println("_____________________________________________");
		do{
			System.out.println("\n1.Savings\n2.Current \n3.View All \n4.Exit");
			System.out.println("_____________________________________________");
			int ch = S.nextInt();
			
			if(ch == 1)
			{
				actype = "Savings Account"; 
				System.out.println("_____________________________________________");
				System.out.println("_______________Account Details_______________");
				System.out.println("_____________________________________________");
				System.out.println(actype);
				System.out.println("\nName			:"+name);
				System.out.println("Account Number	:"+accnum);	
				System.out.println("Account Balance :"+dep);		
			}
			
			else if(ch ==2)
			{ 
				actype = "Current Account"; 
				System.out.println("_____________________________________________");
				System.out.println("_______________Account Details_______________");
				System.out.println("_____________________________________________");
				System.out.println(actype);
				System.out.println("\nName			:"+name);
				System.out.println("Account Number	:"+accnum);	
				System.out.println("Account Balance :"+dep);
			}	
			
			else if(ch == 3)
			{
				System.out.println("_____________________________________________");
				System.out.println("_______________Account Details_______________");
				System.out.println("_____________________________________________");
				System.out.println("Name			:"+name);
				System.out.println("Account Number	:"+accnum);	
				System.out.println("Account Type	:"+atype);
				System.out.println("Account Balance :"+dep);
				System.out.println("Account Status  :Actice");
				System.out.println("Brank  			:xyz_city");	
				System.out.println("IFSC Code  		:XYZ1234");	
				System.out.println("MMID  			:"+name+"XYZ1234");
				System.out.println("UPI ID 			:"+name+"44@XYZ " );			
				System.out.println("Pan Card		:"+pan);
				System.out.println("Adhaar Card		:"+adhr);
				System.out.println("Age				:"+age);
				System.out.println("Nominee Name	:"+nomin);
			}
			else if(ch==4)
			{ 
				System.out.println("Exited...!");
				System.out.println("_____________________________________________");
				break;
			}
		}while(ch != 4);
	}
	//-------------------------------------------------------------------------------------------------------------	
 public void loans()
 {
	System.out.println("_____________________________________________");
	int c;
	do{
		System.out.println("\nAvailable Loans For You.....");
		System.out.println("1.Home Loan@6.5%\n2.Vehicle Loan@12%\n3.Education Loan@7%\n4.Personal Loan@8%\n5.Exit");
		System.out.println("Select your Choice");
		 
		c = S.nextInt();
		double i1, i2, i3, i4;
		i1 = 0.0054;
		i2 = 0.01;
		i3 = 0.0058;
		i4 = 0.0067;
		
		switch(c)
		{
		case 1: System.out.println("Home Loan...");
				System.out.println("Enter Amount");
				lamt = S.nextLong();
				System.out.println("Repay Time Period(in months)");
				ltime = S.nextInt();
				double temp1 = Math.pow(1+i1,ltime);
				double temp2 = Math.pow(1+i1,ltime-1);
				inter = (lamt * i1 * temp1) / (temp2);
				double pay1 = lamt + inter * ltime;
				lpay = (inter + pay1) / ltime;
				System.out.println("Your Toatal Payable amount:Rs." +Math.round(pay1));
				System.out.println("Your Monthly Instalments for " +Math.round(ltime)+ " month is Rs."+Math.round(lpay)+"/mon");
				
				break;
				
		case 2: System.out.println("Vehicle Loan...");
				System.out.println("Enter Amount");
				lamt = S.nextLong();
				System.out.println("Repay Time Period(in months)");
				ltime = S.nextInt();
				double temp3 = Math.pow(1+i2,ltime);
				double temp4 = Math.pow(1+i2,ltime-1);
				inter= (lamt * i2 * temp3) / (temp4);
				double pay2 = lamt + inter * ltime;
				lpay = (inter + pay2) / ltime;
				System.out.println("Your Toatal Payable amount:Rs."+Math.round(pay2));
				System.out.println("Your Monthly Instalments for " +Math.round(ltime)+ " month is Rs."+Math.round(lpay)+"/mon");
				
				break;
				
		case 3: System.out.println("Eduction Loan...");
				System.out.println("Enter Amount");
				lamt = S.nextLong();
				System.out.println("Repay Time Period(in months)");
				ltime = S.nextInt();
				double temp5 = Math.pow(1+i3,ltime);
				double temp6 = Math.pow(1+i3,ltime-1);
				inter = (lamt * i3 * temp5) / (temp6);
				double pay3 = lamt + inter * ltime;
				lpay = (inter + pay3) / ltime;
				System.out.println("Your Toatal Payable amount:Rs."+Math.round(pay3));
				System.out.println("Your Monthly Instalments for " +Math.round(ltime)+ " month is Rs."+Math.round(lpay)+"/mon");
				
				break;
				
		case 4: System.out.println("personal Loan...");
				System.out.println("Enter Amount");
				lamt = S.nextLong();
				System.out.println("Repay Time Period(in months)");
				ltime = S.nextInt();
				double temp7 = Math.pow(1+i4,ltime);
				double temp8 = Math.pow(1+i4,ltime-1);
				inter = (lamt * i1 * temp7) / (temp8);				
				double pay4 = lamt + inter * ltime;
				lpay = (inter + pay4) / ltime;
				System.out.println("Your Toatal Payable amount:Rs."+Math.round(pay4));
				System.out.println("Your Monthly Instalments for " +Math.round(ltime)+ " month is Rs."+Math.round(lpay)+"/mon");
				
				break;
		case 5: System.out.println("Exited...!)");	
				break;
		}
	}while(c == 5);
 }
//-------------------------------------------------------------------------------------------------------------		
 public void investments()
	{
		System.out.println("_____________________________________________");
		System.out.println("Available Investments For You.....");
		System.out.println("\n1.PPF\n2.Direct Tax\n3.National Pension Scheem\n4.Mutual Funds\n5.Exit");
		System.out.println("Select your Choice");

		int c = S.nextInt();
		switch(c)
		{
		case 1: System.out.println("PPF");
				System.out.println("Enter Amount");
				double amtx = S.nextDouble();
				System.out.println("Invested Amount: "+amtx);
				break;
				
		case 2: System.out.println("Direct Tax");
				System.out.println("Enter Amount"); 
				double amty = S.nextDouble();
				System.out.println("Invested Amount: "+amty);
				break;
				
		case 3: System.out.println("National Pension Scheem");
				System.out.println("Enter Amount");
				double amtz = S.nextDouble();
				System.out.println("Invested Amount: "+amtz);
				break;
				
		case 4: System.out.println("Mutual Funds");
				System.out.println("Enter Amount");
				double amts = S.nextDouble();
				System.out.println("Invested Amount: "+amts);
				break;
				
		case 5: System.out.println("Exited"); break;
		}
		
	}
//-------------------------------------------------------------------------------------------------------------		

 public void deposits()
	{
		double damt, drate1, drate2, dtime, fd , rd ;
		drate1 = 0.057;
		drate2 = 0.14;
		System.out.println("_____________________________________________");
		System.out.println("Available Deposit For You.....");
		System.out.println("1.Fixed Deposit\n2.Recurring Deposit\n");
		System.out.println("Select your Choice");
		int c = S.nextInt();
		switch(c)
		{
		case 1: System.out.println("Fixed Deposit");
				System.out.println("Enter Amount");
				damt = S.nextDouble();
				System.out.println("Time Period(in months)");
				dtime = S.nextInt();
				fd = damt + (damt  * drate1);
				System.out.println("Your Meturity Amount after" +Math.round(dtime)+ " month is Rs."+Math.round(fd));
				break;
				
		case 2: System.out.println("Recurring Deposit");
				System.out.println("Enter Amount");
				damt = S.nextDouble();
				System.out.println("Time Period(in months)");
				dtime = S.nextInt();
				rd = (damt * dtime) + (damt * drate2);
				System.out.println("Your Monthly Payable Amount is" +Math.round(damt)+ " for a tenure of "+Math.round(dtime));
				System.out.println("Your Meturity Amount after" +Math.round(dtime)+ " month is Rs."+Math.round(rd));
				
				
				break;
		}
		
	}
 
//-------------------------------------------------------------------------------------------------------------	
	public void fundTransfer()
	{
		System.out.println("_____________________________________________");
		System.out.println("Enter Amount");
		double amt = S.nextDouble();
		System.out.println("Enter Payee Name");
		String name = S.next();
		System.out.println(amt+".rs Transferd to " + name);
		System.out.println("Your Account Balance = "+(dep-amt));
		
	}
//-------------------------------------------------------------------------------------------------------------	
	public void debit()
	{
		System.out.println("_____________________________________________");
		System.out.println("Enter Amount");
		double amt = S.nextDouble();
		System.out.println("Enter Payee Name");
		String name = S.next();
		System.out.println(amt+".rs Debited to " + name);
		System.out.println("Your Account Balance = "+(dep-amt));
	}
//-------------------------------------------------------------------------------------------------------------	
	public void credit()
	{
		System.out.println("_____________________________________________");
		System.out.println("Enter Amount");
		double amt = S.nextDouble();
		System.out.println("Enter a message");
		System.out.println(amt+".rs Credited to your account number:  " + accnum);
		System.out.println("Your Account Balance is = "+(dep+amt));
	}
//-------------------------------------------------------------------------------------------------------------		
	public void billPay()
	{
		System.out.println("_____________________________________________");
		System.out.println("Enter Amount");
		double amt = S.nextDouble();
		System.out.println("Enter Enterprise Name");
		String name = S.next();
		System.out.println("Enter Enterprise ID");
		long id = S.nextLong();
		System.out.println(amt+".rs Payed to " + name+ "\n Store ID"+id);
		System.out.println("Your Account Balance = "+(dep-amt));
	}
//-------------------------------------------------------------------------------------------------------------		
	

 
}

public class ATM extends Accounting
{
	static int ch, ch2;
	public static void main(String[] args) 
	{
		ATM T = new ATM();
		T.wlcm();
		Scanner Sn = new Scanner(System.in);
		System.out.print("Select your method:");
		ch = Sn.nextInt();
		if(ch == 1)
		{
			T.signin();
			T.login();
			do
			{	
				System.out.println("_____________________________________________");
				System.out.print("\nSelect your choice: ");
				ch2 = Sn.nextInt();			
				switch(ch2)
				{
				case 1: T.accounts();			break;  
				case 2: T.loans();				break;
				case 3: T.investments();		break;
				case 4 :T.deposits();			break;
				case 5: T.fundTransfer();		break;
				case 6: T.debit();				break;
				case 7: T.credit();				break;
				case 8: T.billPay();			break;
				case 9: System.out.println("Do you want to Exit \nYes = 1\n No = 0"); break;
				}
			}while(ch2 != 9);
		}
		else if(ch == 2)
		{
			T.login();
			do
			{	System.out.print("Select your choice:");
				ch2 = Sn.nextInt();			
				switch(ch2)
				{
				case 1: T.accounts();			break;  
				case 2: T.loans();				break;
				case 3: T.investments();		break;
				case 4 :T.deposits();			break;
				case 5: T.fundTransfer();		break;
				case 6: T.debit();				break;
				case 7: T.credit();				break;
				case 8: T.billPay();			break;
				case 9: System.out.println("Do you want to Exit \nYes = 1\n No = 0"); break;
				}
			}while(ch2 != 9);
		}
		else
		{
			System.out.println("Terminated Succesfully!");
		}
		Sn.close();
	}
}

