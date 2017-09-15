package Assignment_1;

/*By : 15103080 
 * This program take a number n as input
 * and genrate all possible prime number till n
 * I've used little bit GUI(JOptionPane) for input output purpose  
 */



import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PrimeNumber {
	private int n;
	private boolean[] primeNum;
	
	public PrimeNumber(int n){
		primeNum = new boolean[n+1]; 
		Arrays.fill(primeNum, true);
	}
	
	public void generatePrime(){
		primeNum[0] = false;
		primeNum[1] = false;
		
		for(int i=2; i*i<=n; i++){
			if(primeNum[i]){
				for(int j = i*i; j<=n; j+=i){
					primeNum[j] = false;
				}
			}
		}
	}
	
	public String showPrimeNum(int n){
		String st = "2";
		for(int i=3; i<=n; i+=2)
			if(primeNum[i]){
				st = st + " " + i;
			}
		return st;
	}
	
	public static void main(String []args){
		JFrame frame = new JFrame();			//Creating a frame for JOptionPane
		String st="";
		try{
			st = JOptionPane.showInputDialog(frame,"Enter Number");  //for taking input from user as string
			if(st == null){
				throw new NullPointerException();
			}
		}catch(NullPointerException e){
			System.out.println("Nothing was entered");
			System.exit(0);
		}
		int n = Integer.parseInt(st);			//Converting into integer from String
		
		PrimeNumber pNum = new PrimeNumber(n);
		pNum.generatePrime();
		
		JOptionPane.showMessageDialog(frame, pNum.showPrimeNum(n), "PrimeNumber",JOptionPane.INFORMATION_MESSAGE );  //For showing Output
		
	}
}
