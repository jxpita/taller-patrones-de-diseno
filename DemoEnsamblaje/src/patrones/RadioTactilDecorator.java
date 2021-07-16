/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 *
 * @author Juan Xavier Pita
 */
public class RadioTactilDecorator extends VehiculoDecorator{

    public RadioTactilDecorator(VehiculoBase vb) {
        super(vb);
    }
    
    @Override
    public String getPrestaciones(){
        String n1 = super.getPrestaciones();
        n1 += "Radio con pantalla táctil\n";
        return n1;
    }
    
}
