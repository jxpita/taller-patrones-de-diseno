/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinpatron;

import patrones.VehiculoBase;

/**
 *
 * @author david_000
 */
public class Vehiculo implements IMotor, VehiculoBase{
    public String color;
    public boolean direccionAsistida;
    public String marca;
    public String modelo;
    public IMotor motor;
    public Carroceria tipoCarroceria;

    // Vehiculo se compone de Motor y Carrocería
    public Vehiculo() {
        this.motor = new IMotor() {
            @Override
            public String ConsumirCombustible() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String InyectarCombustible(int cantidad) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String RealizarEscape() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String RealizarCombustion() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        this.tipoCarroceria = new Carroceria();
    }
   
   
    @Override
    public String getPrestaciones(){
        String n1 = "Prestaciones:\n";
        n1 += "El presente vehículo es un " + marca + " modelo " + modelo + "\n";
        n1 += "Estilo " + tipoCarroceria.tipoCarroceria + "\n";
        n1 += "Color: " + color + "\n";
        n1 += (direccionAsistida ? "Con ":"Sin ") + "dirección asistida" + "\n";
        n1 += "Carrocería de " + tipoCarroceria.material + "\n";
        n1 += "Respuesta del motor: " + motor.InyectarCombustible(100) + "\n";

        return n1;
    }

    @Override
    public String ConsumirCombustible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String InyectarCombustible(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String RealizarEscape() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String RealizarCombustion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
