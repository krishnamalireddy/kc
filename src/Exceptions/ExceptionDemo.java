package Exceptions;


// This program creates a custom exception type.
class MyMoneyTransferException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int detail;

	MyMoneyTransferException(int amount) {
		detail = amount;
	}

	public String toString() {
		return "MyMoneyTransferException[" + detail + "]";
	}
}

class ExceptionDemo {
	static void transfermoney (int amount) throws MyMoneyTransferException 
	{
		
		System.out.println("Called transfermoney(" + amount + ")");
		
		try	{
		
				if (amount > 10){
					throw new MyMoneyTransferException(amount);
				}
			}
		catch (MyMoneyTransferException e)
		{
			System.out.println(e);
		}	
		System.out.println("rest of code to transfer money");
		System.out.println("rest of code to transfer money");
		System.out.println("rest of code to transfer money");
	}

	public static void main(String args[]) {
		try {
			//compute(1);
			transfermoney(16);
		} catch (MyMoneyTransferException e) {
			System.out.println("Caught " + e);
		}
	}
}
