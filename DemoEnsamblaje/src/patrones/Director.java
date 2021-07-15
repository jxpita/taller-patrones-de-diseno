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
public class Director{

    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void constructVehiculoA(Builder builder){
        // buildear vehiculo A
        // builder.setColor(//color para vehiculo A);
        // builder.setMarca(//marca para vehiculo A);
        // builder.setModelo(//modelo para vehiculo A);
        // etc . . .
    }

    public void constructVehiculoB(Builder builder){
        // buildear vehiculo B
        // builder.setColor(//color para vehiculo B);
        // builder.setMarca(//marca para vehiculo B);
        // builder.setModelo(//modelo para vehiculo B);
        // etc . . .
    }

}
