import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * @author Sheng
 * Creat a new Cycle, prompt the user to enter the number of wheels and weight
 * if the value is less than or equal to 0, throw the data
 */
public class Cycle {
	static double numberOfWheels;
	static double weight;	
	public Cycle(double numberOfWheels,  double weight){
		this.numberOfWheels=numberOfWheels;
		this.weight=weight;
		//constructor of cycle
	}
	
	@Override
	public String toString() {
		return "Cycle [numberOfWheels=" + numberOfWheels + ", weight=" + weight
				+ "]";
	}


	public static void main(String[] args) throws ValueMismatch {
		// TODO Auto-generated method stub	
		JTextField NumberOfWheels = new JTextField(10);
		JTextField Weight = new JTextField(10);
		JLabel label = new JLabel(
				"Enter integer numerator and denominator to find the quotient.");
		JPanel panel = new JPanel();

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(label);
		panel.add(NumberOfWheels);
		panel.add(Weight);
		
		JOptionPane.showMessageDialog(null, panel);
		//prompt user to enter the number of wheels and weight
		
		try{
			setData(NumberOfWheels.getText(),Weight.getText());
			
			}
		catch(Exception ValueMismatch){
			
			throw new ValueMismatch("Values cannot be less than or equal to zero");			
		}
		Cycle cycle1=new Cycle(numberOfWheels, weight);
		System.out.println(cycle1.toString());
	}
	public static void setData(String NumberOfWheels, String Weight)
			throws ValueMismatch{
				numberOfWheels= Double.parseDouble(NumberOfWheels);
				weight= Double.parseDouble(Weight);
				if (numberOfWheels<=0 || weight<=0)//throw when the value is less than or equal to 0
					throw new ValueMismatch("Values cannot be less than or equal to zero");
				}			
			
		}	
		


