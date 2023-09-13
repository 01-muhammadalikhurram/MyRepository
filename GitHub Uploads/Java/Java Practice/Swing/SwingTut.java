import javax.swing.JOptionPane;

public class SwingTut{

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter Your Name: ");
		JOptionPane.showMessageDialog(null,"Hello " + name);

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age: "));
		JOptionPane.showMessageDialog(null,"Your age is: " + age);

		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height (in cm's): "));
		JOptionPane.showMessageDialog(null,"Your height is: " + height + " cm");

	}

}