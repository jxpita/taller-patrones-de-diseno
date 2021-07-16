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
public class SensorRetroDecorator extends VehiculoDecorator{

    public SensorRetroDecorator(VehiculoBase vb) {
        super(vb);
    }
    
    @Override
    public String getPrestaciones(){
        String n1 = super.getPrestaciones();
        n1 += "Con sistema de sensores para retro\n";
        return n1;
    }
    
}
