/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.Carroceria;
import sinpatron.MotorDiesel;
import sinpatron.Vehiculo;

/**
 *
 * @author Juan Xavier Pita
 */
public class VehiculoABuilder extends Builder{

    @Override
    public void setColor() {
        super.vehiculo.color = "negro";
    }

    @Override
    public void setDireccionAsistida() {
        super.vehiculo.direccionAsistida = false;
    }

    @Override
    public void setMarca() {
        super.vehiculo.marca = "Citroen";
    }

    @Override
    public void setModelo() {
        super.vehiculo.modelo = "Xsara Picasso";
    }

    @Override
    public void setMotor() {
        super.vehiculo.motor = new MotorDiesel();
    }

    @Override
    public void setCarroceria() {
        Carroceria cA = new Carroceria();
        cA.habitaculoReforzado = false;
        cA.material = "acero";
        cA.tipoCarroceria = "monovolumnen";
        super.vehiculo.tipoCarroceria = cA;
    }
    
    @Override
    public Vehiculo getVehiculo(){
        return super.vehiculo;
    }
    
}
