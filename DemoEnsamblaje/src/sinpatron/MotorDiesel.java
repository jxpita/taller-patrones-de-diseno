/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinpatron;

/**
 *
 * @author david_000
 */
public class MotorDiesel implements IMotor{

    @Override
    public String ConsumirCombustible() {
        return RealizarCombustion();
    }

    @Override
    public String InyectarCombustible(int cantidad) {
        return "MotorDiesel: Inyectados " + cantidad + " ml. de Gasoil.";
    }

    @Override
    public String RealizarEscape() {
        return "MotorDiesel: Realizando escape de gases";
    }

    @Override
    public String RealizarCombustion() {
        return "MotorDiesel: Realizada combustión del Gasoil.";
    }
    
}
