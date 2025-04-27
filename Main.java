
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        
        Vigas viga1 = new Vigas();
        
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base da viga (em metros):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da viga (em metros):"));
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da viga (em metros):"));
        
        viga1.setBase(20);
        viga1.setAltura(30);
        viga1.setComprimento(40);
        viga1.CalculoVolumeConcreto();
        
        JOptionPane.showMessageDialog(null, "Para a construção, são necessários " + viga1.getVolumeConcreto() + " m³ de concreto.");
    }
}