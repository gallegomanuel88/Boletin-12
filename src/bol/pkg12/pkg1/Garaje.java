package bol.pkg12.pkg1;

import javax.swing.JOptionPane;
/**
 *
 * @author galle
 */
public class Garaje {
    private int numeroCoches = 0;
    private String matricula1;
    private String matricula2;
    private String matricula3;
    private String matricula4;
    private String matricula5;
    
    public void comprobar (){
        if (numeroCoches>=5){
            JOptionPane.showMessageDialog(null,"COMPLETO"); 
        }
        else{ JOptionPane.showMessageDialog(null,"PLAZAS DISPONIBLES");
        asignacionMatricula();
        }
    }
    public void asignacionMatricula (){
        switch (numeroCoches){
            case 0:
                matricula1 = JOptionPane.showInputDialog("Introduce la matricula");
                numeroCoches++;
                break;
            case 1:
                matricula2 = JOptionPane.showInputDialog("Introduce la matricula");
                numeroCoches++;
                break;
            case 2:
                matricula3 = JOptionPane.showInputDialog("Introduce la matricula");
                numeroCoches++;
                break;
            case 3:
                matricula4 = JOptionPane.showInputDialog("Introduce la matricula");
                numeroCoches++;
                break;
            case 4:
                matricula5 = JOptionPane.showInputDialog("Introduce la matricula");
                numeroCoches++;
                break;
        }
    }
    
}
