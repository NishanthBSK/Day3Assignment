
public class BranchTest {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		SmeBranch b1=new SmeBranch(18231, "Hopefarm", "Bangalore", 500,"Metro","SME");
		System.out.println(b1);
	
		SmeBranch b2=new SmeBranch(3301, "Indiranagar", "Bangalore", -600,"Metro","SME");
		//b2.setBranchDetails();
		System.out.println(b2);


	}

}
class Branch
{
	int branchCode;
	String branchName;
	String branchAddress;
	double branchPandL;
	
	
	Branch(int branchCode, String branchName, String branchAddress, double branchPandL)
	{
		System.out.println("We are Setting Branch Details");
		this.branchCode=branchCode;
		this.branchName=branchName;
		this.branchAddress=branchAddress;
		this.branchPandL=branchPandL;
		
		
		
		
		
	}


	
}

class MetroBranch extends Branch
{
	String branchType;
	
	public MetroBranch(int branchCode, String branchName, String branchAddress, double branchPandL,String branchType) 
	{
		// TODO Auto-generated constructor stub
		
		super(branchCode,branchName, branchAddress,branchPandL);
		this.branchType=branchType;
	}
	
}

class SmeBranch extends MetroBranch
{
	String mainFocus;
	double target;
	
	public SmeBranch(int branchCode, String branchName, String branchAddress, double branchPandL,String branchType,String mainFocus) 
	{
		// TODO Auto-generated constructor stub
		
		super(branchCode,branchName, branchAddress,branchPandL,branchType);
		this.mainFocus=mainFocus;
	}
	
	@Override
	public String toString() 
	{
		
		target=targetForThisFY();
		if(branchPandL>0) 
		{
			
			
			return "Branch [branchCode=" + branchCode + ", branchName=" + branchName + ",branchType=" + branchType +", mainFocus=" + mainFocus +",branchAddress=" + branchAddress
					+ ", brancProfit=" + branchPandL + "crores"+", Target for this FY is=" + target+"crores]";
			
		}
		else 
		{
			
			
			return "Branch [branchCode=" + branchCode + ", branchName=" + branchName + ",branchType=" + branchType +", mainFocus=" + mainFocus +",branchAddress=" + branchAddress
					+ ", brancLoss=" + branchPandL + "crores"+", Target for this FY is=" + target+"crores]";
			
			
		}
		
		
	}
	double targetForThisFY()
	{
		
		double t;
		if(branchPandL>0) 
		{
			t=100;
			
			return t;
			
		}
		else 
		{
			
			t=-(branchPandL)+100;
			return t;
			
			
		}
	}
	
	
	
	
	
	
}
