package Principal;
import View.TelaInicial;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
public class Principal {

    public static void main(String[] args) {
        try{
            FlatDarkLaf.setup();
        }catch (Exception e){
            
        }
        
        String options[] = {"Light Mode", "Dark Mode"};
        
        int n = JOptionPane.showOptionDialog(
            null,
                "Escolha um tema",
                "Calculadora",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
            );
        switch (n){
            case 1 -> java.awt.EventQueue.invokeLater( () -> {
                try{
                    FlatDarkLaf.setup();
                }catch (Exception e){
                }
                new TelaInicial().setVisible(true);
            });
            case 0 -> java.awt.EventQueue.invokeLater( () -> {
                try{
                    FlatLightLaf.setup();
                }catch (Exception e){
                }
                new TelaInicial().setVisible(true);
            });
        }   
    }
}
