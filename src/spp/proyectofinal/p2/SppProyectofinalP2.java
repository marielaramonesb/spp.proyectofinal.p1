/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.proyectofinal.p2;
import javax.swing.JOptionPane;
/*Equipo:
*Lisdy Rohmann A00513659
*Alejandro García A0161137
*Kevin Hinojosa A01411383
*Mariela Ramones A01441449
*Catalina Domínguez A01411583
*/
public class SppProyectofinalP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        op();
    }
    
    public static int vEnteros(String men){
        int n=0;
        boolean flag;
        do{
            try{
            String dato=JOptionPane.showInputDialog (null, men);
            n=Integer.parseInt(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        }while (flag); 
        return n;
    }
    
    public static double gastos(String men){
        double n=0;
        boolean flag;
        do{
            try{
            String dato=JOptionPane.showInputDialog (null, men);
            n=Double.parseDouble(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return n;
    }
    
    public static double[] op(){
        double sum=0;
        int gastos=vEnteros("Escribe el número de gastos"); 
        double[]mat=new double[gastos];
        for (int i=0; i<mat.length; i++){
                mat[i]=gastos("Escribe la cantidad" + (i+1));
                if(mat[i]>0){
                  sum=(sum+mat[i]);  
                } 
                else{
                    JOptionPane.showMessageDialog(null, "Error, no puede haber cantidades negativas");
                }
            }
        
        JOptionPane.showMessageDialog (null, "El total de los gastos es: " + sum);
    return mat;
    }
    
}

