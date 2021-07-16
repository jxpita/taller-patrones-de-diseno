/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.Vehiculo;


/**
 *
 * @author Juan Xavier Pita
 */
public abstract class Builder{

    protected Vehiculo vehiculo = new Vehiculo();

    public void setColor(){
        this.vehiculo.color = "";
    }
    abstract public void setDireccionAsistida();
    abstract public void setMarca();
    abstract public void setModelo();
    abstract public void setMotor();
    abstract public void setCarroceria();
    abstract public Vehiculo getVehiculo();

}