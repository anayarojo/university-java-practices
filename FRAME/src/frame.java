
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class frame extends JFrame{
    
    private JLabel linea;
    
    public frame(){
      setLayout(null);  
      linea=new JLabel("RAUL");
        linea.setBounds(50,20,200,30);
        add(linea);      
      
    }
    
    public static void main(String[] args) {
 
            frame W=new frame();
            W.setTitle("Windows 5000");
            W.setBounds(10, 10, 300, 200);
            W.setVisible(true);
            W.setResizable(false);
            W.setAlwaysOnTop(true);
            
        Dimension ventana=W.getSize();               
        Dimension pantalla=Toolkit.getDefaultToolkit().getScreenSize();
            W.setLocation((pantalla.width-ventana.width)/2, (pantalla.height-ventana.height)/2);
        
     
    }
}
