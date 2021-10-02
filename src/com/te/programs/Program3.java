package com.te.programs;


interface UPIBanking
{
	void sendMoney(double amt,long recieverContact);
	void recieveMoney(double amt,long senderContact);
	void checkBalance();
}
class GooGlePay implements  UPIBanking
{
	long contactNumber;
	String bankName;
	String upiId;
	double balance;
	GooGlePay(long contactNumber,String bankName,String upiId,double balance)
	{
		this.contactNumber=contactNumber;
		this.bankName=bankName;
		this.upiId=upiId;
		this.balance=balance;
	}
	public	void sendMoney(double amt,long recieverContact)
	{
		System.out.println("connecting to googlepay server");
		if(amt<=balance)
		{
			balance=balance-amt;
			System.out.println("tranaction sucessfull");
			System.out.println("cash back");
		}
		else
		{
			System.out.println("insuffuient balance");
		}
	}
	public void recieveMoney(double amt,long senderContact)
	{
		System.out.println("connecting to googlepay server");
		System.out.println("recieved money from"+senderContact);
		balance=balance+amt;
	}
	public void checkBalance()
	{
		System.out.println("connecting to googlepay server");
		System.out.println("balance="+balance);
	}
}
class PhonePe implements  UPIBanking
{
	long contactNumber;
	String bankName;
	String upiId;
	double balance;
	PhonePe(long contactNumber,String bankName,String upiId,double balance)
	{
		this.contactNumber=contactNumber;
		this.bankName=bankName;
		this.upiId=upiId;
		this.balance=balance;
	}
	public	void sendMoney(double amt,long recieverContact)
	{
		System.out.println("connecting to PhonePe server");
		if(amt<=balance)
		{
			balance=balance-amt;
			System.out.println("tranaction sucessfull");
			System.out.println("collect coupouns");	
		}
		else
		{
			System.out.println("insuffuient balance");
		}
	}
	public void recieveMoney(double amt,long senderContact)
	{
		System.out.println("connecting to PhonePe server");
		System.out.println("recieved money from"+senderContact);
		balance=balance+amt;
	}
	public void checkBalance()
	{
		System.out.println("connecting to PhonePe server");
		System.out.println("balance="+balance);
	}
}

class PlayStore 
{
	 UPIBanking download(char type)
		{
			if(type=='g')
			{
				return new GooGlePay(123456779L,"ICICI","email@gok",5000.00);
			}
			else
			{
				return new PhonePe(123456779L,"ICICI","email@gok",5000.00);
			}
		}
}

public class Program3 {
	
	public static void main(String[] args) {
		
	
	System.out.println("download application first ");
	PlayStore ps=new PlayStore();
	UPIBanking ref=ps.download('p');
	ref.sendMoney(3000,415263L);
	ref.recieveMoney(5000,254136L);
	ref.checkBalance();
	}
}
