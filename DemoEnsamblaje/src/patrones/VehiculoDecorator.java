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
public abstract class VehiculoDecorator implements VehiculoBase{

    protected VehiculoBase wrapee;

    // VehiculoDecorator agrega VehiculoBase
    public VehiculoDecorator(VehiculoBase vb){
        this.wrapee = vb;
    }

    @Override
    public String getPrestaciones() {
        return wrapee.getPrestaciones();
    }

}
