package bol.pkg12.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Bol121 {

    public static void main(String[] args) {
        
        int opciones;
        boolean repeticion = true;
        
        Garaje objGaraje = new Garaje ();
        Ticket objTicket = new Ticket ();
        
        do{
            opciones = Integer.parseInt(JOptionPane.showInputDialog("Para aparcar pulse 1\nPara imprimir el ticket pulse 2"));
            switch (opciones){
                case 1:
                   objGaraje.comprobar();
                    break;
                case 2:
                   objTicket.imprimirTicket();
                    break;
            }
        }
        while (repeticion = true);
    }
    
}
