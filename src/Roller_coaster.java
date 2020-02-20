import javax.swing.JOptionPane;

public class Roller_coaster {
public static void main(String[] args) {


String Hight =JOptionPane.showInputDialog("What is your hight?");
int	hight=Integer.parseInt(Hight);
if(hight>48) {
	JOptionPane.showMessageDialog(null,"your good to go,go ahead.");}	
	
	else {
	JOptionPane.showMessageDialog(null,"sorry grow up more.");	
	}
}	
}
