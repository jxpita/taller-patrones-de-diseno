/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.Carroceria;
import sinpatron.IMotor;
import sinpatron.Vehiculo;


/**
 *
 * @author Juan Xavier Pita
 */
public abstract class Builder{

    protected Vehiculo vehiculo;

    public void setColor(String color){
        this.vehiculo.color = color;
    }

    public void setDireccionAsistida(boolean direccionAsistida){
        this.vehiculo.direccionAsistida = direccionAsistida;
    }

    public void setMarca(String marca){
        this.vehiculo.marca = marca;
    }

    public void setModelo(String modelo){
        this.vehiculo.modelo = modelo;
    }

    public void setMotor(IMotor motor){
        this.vehiculo.motor = motor;
    }

    public void setCarroceria(Carroceria tipoCarroceria){
        this.vehiculo.tipoCarroceria = tipoCarroceria;
    }

}
