/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package figuregeometriche;
import java.util.*;
/**
 *
 * @author 72873486
 */
public class FigureGeometriche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     // TODO code application logic here
     Scanner s=new Scanner(System.in);
     
     Quadrato q1=new Quadrato();
     Quadrato q2=new Quadrato(4);
    
     int A;
     int P;
     int input;
     input=s.nextInt();
     
     q1.setLato(input);
     A=q1.areaq();
     P=q1.perimetroq();
     
     System.out.println("area q1="+A);
     System.out.println("perimetro q1="+P);
     
     
    }
    
}
