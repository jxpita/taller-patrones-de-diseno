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
public class VehiculoBBuilder extends Builder{
    
    @Override
    public void setColor() {
        super.vehiculo.color = "plata cromado";
    }

    @Override
    public void setDireccionAsistida() {
        super.vehiculo.direccionAsistida = true;
    }

    @Override
    public void setMarca() {
        super.vehiculo.marca = "Audi";
    }

    @Override
    public void setModelo() {
        super.vehiculo.modelo = "A3 Sportback";
    }

    @Override
    public void setMotor() {
        super.vehiculo.motor = new MotorDiesel();
    }

    @Override
    public void setCarroceria() {
        Carroceria cB = new Carroceria();
        cB.habitaculoReforzado = true;
        cB.material = "fibra de carbono";
        cB.tipoCarroceria = "deportivo";
        super.vehiculo.tipoCarroceria = cB;
    }
    
    @Override
    public Vehiculo getVehiculo(){
        return super.vehiculo;
    }
    
}
