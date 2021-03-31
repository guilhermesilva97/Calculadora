package calc;

import javax.swing.JOptionPane;

public class Calcular {


	public double Calcular (double n1, double n2, int op) {
		double result = 0;
		switch (op) { 
		case 1:	result = n1+n2; break;
		case 2:	result = n1-n2; break;
		case 3:	result = n1*n2;  break;
		case 4:	if(n2==0) {
			JOptionPane.showMessageDialog(null, "Não é possível dividir um número por 0.");
			result = 0;
		}
		else {
			result = n1/n2;
		}
		break;
	}	
		return result;			
}
}
