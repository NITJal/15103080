package Assignment_1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*By : 15103080
 * This program check if input String is Palindrome or not.
 * It treat small and capital alphabet differently
 * 
 */


public class StringPalindrome {
	private String st;
	
	public StringPalindrome(String st){
		this.st = st;
	}
	
	public boolean checkPalidrome(){
		for(int i=0; i<=st.length()/2; i++){
			if(st.charAt(i) != st.charAt(st.length()-i-1)){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		String st="";
		try{
			st = JOptionPane.showInputDialog(frame, "Enter String", "PalindromeCheck Program", JOptionPane.INFORMATION_MESSAGE);
			if(st == null){
				throw new NullPointerException();
			}
		}
		catch(NullPointerException e){
			System.out.println("Nothing was Entered:");
			System.exit(0);
		}
		StringPalindrome pal = new StringPalindrome(st);
		boolean flag = pal.checkPalidrome();
		if(flag){
			JOptionPane.showMessageDialog(frame, st+" is a Palidrome String.", "Output",JOptionPane.INFORMATION_MESSAGE );
		}else{
			JOptionPane.showMessageDialog(frame, st+" is not a Palidrome String.", "Output",JOptionPane.INFORMATION_MESSAGE );
		}

	}

}
