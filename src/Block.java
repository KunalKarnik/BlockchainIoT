import java.util.Arrays;

public class Block {
	
	private long previousBlockRef; // A hash to the previous block.
	
	private String[] transactions; // Some transactions that need to be inscribed to the world ledger.
	
	private long guess;// A new generated hash HOPEFULLY below a target value.

	public long getPreviousBlockRef() {
		return previousBlockRef;
	}

	public String[] getTransactions() {
		return transactions;
	}
	
	public long getGuess() {
		return guess;
	}

	public Block(long previousBlockRef, String[] transactions, long guess) {
		//super();
		this.previousBlockRef = previousBlockRef;
		this.transactions = transactions;
		Object[] ob = {Arrays.hashCode(transactions), previousBlockRef, guess};
		this.guess = Arrays.hashCode(ob);
	}

}
