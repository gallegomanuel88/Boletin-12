package bol.pkg12.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Ticket {
    float tiempo;
    float precio;
    float dineroP;
    float dineroD;
    String matricula;
    
    public void calcularPrecio (){

        if (tiempo <=3){
            precio = 1.5f;
        }
        else if (tiempo>3){
            precio = (1.5f+(tiempo-3)*0.20f);
        }
    }

    public void imprimirTicket (){
        matricula = JOptionPane.showInputDialog("Introduce la tu matricula");
        tiempo = Float.parseFloat(JOptionPane.showInputDialog("Introduce el tiempo"));        
        calcularPrecio();
        dineroP = Float.parseFloat(JOptionPane.showInputDialog("Precio a pagar "+precio+"€ \nIntroduce dinero"));
        dineroD = dineroP - precio;
        JOptionPane.showMessageDialog(null,"Factura"+"\nMatricula "+"\nTiempo "+tiempo+" horas \nPrecio "+precio+"€ \nDinero pagado "+dineroP+"€ \nDinero devuelto "+dineroD+"€ \nGRACIAS POR USAR NUESTRO PARKING");
        
    }

    
}
