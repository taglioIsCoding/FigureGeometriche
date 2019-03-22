/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuregeometriche;

/**
 *
 * @author 72873486
 */
public class Quadrato extends FigureGeometriche {
    
    
    int lato;
    
    
    
    //costruttori
    public Quadrato () {}
    public Quadrato (int lato)
    {
    if (lato>0)
    {
    this.lato=lato;
    }
    else this.lato=0;
    }
    
    public void setLato(int lato)
    {
        this.lato=lato;
    }
    
    public int getLato()
    {
        return lato;
    }
    //
    
    
    
    public int areaq()
    {
        return lato*lato;
    }
    
    public int perimetroq()
    {
        return lato*4;
    }
    
    
}
