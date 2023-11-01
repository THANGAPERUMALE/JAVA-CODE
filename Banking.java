class Bank{
    String bankName;
    String location;
    int regno;
    Bank(){
        bankName="SBI";
        location="Chennai";
        regno=1532;
        infoOfBank();
    }
    public void infoOfBank(){
        System.out.printf(bankName+"\n"+location+"\n"+regno+"\n");
    }  
}
public class Main
{
	public static void main(String[] args) {
	    Bank b=new Bank();
	    b.bankName="INDIAN";
	    b.location="Tuticorin";
	    b.regno=3491;
	    b.infoOfBank();
	}
}
