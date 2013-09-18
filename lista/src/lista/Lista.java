
package lista;

import javax.swing.JOptionPane;


public class Lista {

    
    public static void main(String[] args) {
       
        int n = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DE PERSONAS"));
        registro r = new registro (n);
        
        
        for (int i=0;i<n;i++){
            String ide = JOptionPane.showInputDialog("DIGITE LA IDENTIFICACION DE LA PERSONA  "+(i+1));
            String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DE LA PERSONA  "+(i+1));
            String saldo = JOptionPane.showInputDialog("DIGITE EL SALDO DE LA PERSONA  "+(i+1));
            r.ingresar(ide, nombre, saldo, i);
   
        }
        for (int i=0;i<n;i++){
            persona paux = r.darpersona(i);
            System.out.println(paux.getNombre()+"\n"+paux.getIdentificacion()+"\n"+paux.getSaldo()+"\n");        
            
                   
           
            
            
        }
}
}
