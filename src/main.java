import java.util.ArrayList;

//import

//Kunal A. Karik
// BlockCain in Java - Basics of understanding Contract programming!
// My understanding stands that a block should only include:
//	1> A hash to the previous block.
//	2> Some transactions that need to be inscribed to the world ledger.
//	3> A new generated hash below a target value.
// The goal here is to simply understand the Need for Contract programming (and thus, what it is!)
// Instead of using some function runner, like an amazon lambda instance to run periodically. 

public class main {
	
	static ArrayList<Block> kchain = new ArrayList<Block>();
	static long lastHash;
	static long Target = (long) (Integer.MAX_VALUE*0.95);
	
	public static void main(String[] args)	{
		
		String[] firstTransaction = {"Seed funding from Satoshi Nakamoto", "kchain kisks off!", "Other important transactions for the world to see!"};
		
		Block genesis = new Block(0, firstTransaction, 7);
		lastHash = genesis.getGuess();
				
		kchain.add(genesis);
		
		String[][] Transactions = {{"q","w","e","r","t","y"},{"a","b","c","d","e","f"}};
		
		for(int i = 0; i<2; i++)	{
			long guess = 0;
			Block next = new Block(lastHash, Transactions[0], guess);
			while(true)	{
				guess++;
				next = new Block(lastHash, Transactions[i], guess);
				System.out.println("er");
				if(next.getGuess() < Target)	{
					break;
				}
			}
			kchain.add(next);
		}
		System.out.println(kchain.toString());
		
	}
}
