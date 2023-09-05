import javax.swing.JOptionPane;

public class SomaDoisNumeros {
	public static void main(String[] args) {
		double primeiroOperando;
		double segundoOperando;
		double resultado;
		
		primeiroOperando = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro operando"));
		segundoOperando = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo operando"));
		
		resultado = primeiroOperando + segundoOperando;

		JOptionPane.showMessageDialog(null, resultado);
	}
}
