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
        
        builder.setColor();
        builder.setDireccionAsistida();
        builder.setMarca();
        builder.setModelo();
        builder.setMotor();
        builder.setCarroceria();
        
    }

    public void constructVehiculoB(Builder builder){
        
        builder.setColor();
        builder.setDireccionAsistida();
        builder.setMarca();
        builder.setModelo();
        builder.setMotor();
        builder.setCarroceria();
        
    }

}
