
import java.awt.Dimension;
import views.Principal;

public class Main {
    
    public static void main(String[] args) { 
        
        Principal main = new Principal();
        main.setPreferredSize(new Dimension(668, 499));
        main.setMaximumSize(new Dimension(668, 499));
        main.setMinimumSize(new Dimension(668, 499));
        main.setLocationRelativeTo(null);
        main.setVisible(true);
        
    }
}
