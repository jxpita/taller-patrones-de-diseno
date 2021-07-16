/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoensamblaje;

import patrones.Director;
import patrones.VehiculoABuilder;
import patrones.VehiculoBBuilder;
import sinpatron.Carroceria;
import sinpatron.MotorDiesel;
import sinpatron.Vehiculo;

/**
 *
 * @author david_000
 */
public class DemoEnsamblaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n--------------------------------------------------");
        System.out.println("*** Sin patrón Builder ***\n");
        
        //Definir vehiculo
        Vehiculo v1 = new Vehiculo();
        v1.marca = "Citroen";
        v1.modelo = "Xsara Picasso";
        
        //Contruir motor
        v1.motor = new MotorDiesel();
        
        //Construir carroceria
        Carroceria c1 = new Carroceria();
        c1.habitaculoReforzado = false;
        c1.material = "acero";
        c1.tipoCarroceria = "monovolumnen";
        v1.tipoCarroceria = c1;
        v1.color = "negro";
        
        //Construir extras
        v1.direccionAsistida = false;
        
        //Mostrar prestaciones del vehiculo
        System.out.println(v1.getPrestaciones());


        //--------------------------------------------------
        
        //Definir vehiculo
        Vehiculo v2 = new Vehiculo();
        v2.marca = "Audi";
        v2.modelo = "A3 Sportback";
        
        //Contruir motor
        v2.motor = new MotorDiesel();
        
        //Construir carroceria
        Carroceria c2 = new Carroceria();
        c2.habitaculoReforzado = true;
        c2.material = "fibra de carbono";
        c2.tipoCarroceria = "deportivo";
        v2.tipoCarroceria = c2;
        v2.color = "plata cromado";
        
        //Construir extras
        v2.direccionAsistida = true;
        
        //Mostrar prestaciones del vehiculo
        System.out.println(v2.getPrestaciones());
        
        //--------------------------------------------------

        System.out.println("\n--------------------------------------------------");
        System.out.println("*** Con patrón Builder ***\n");

        // Construyendo con la clase Director
        Director director = new Director();
        
        // Definir un builder para vehiculo A
        VehiculoABuilder builderA = new VehiculoABuilder();
        
        // Construir vehiculo A
        director.constructVehiculoA(builderA);
        
        //Mostrar prestaciones del vehiculo
        System.out.println(builderA.getResultado().getPrestaciones());

        //--------------------------------------------------

        // Definir un builder para vehiculo B
        VehiculoBBuilder builderB = new VehiculoBBuilder();
        
        // Construir vehiculo B
        director.constructVehiculoB(builderB);
        
        //Mostrar prestaciones del vehiculo
        System.out.println(builderB.getResultado().getPrestaciones());

        //--------------------------------------------------

        //TODO: Agregar accesorios: radio y sensores de retro a v1
        //Debería agregar estos accesorios como parte de las prestaciones del vehiculo
                
        //Mostrar prestaciones actualizadas del vehiculo
        
        //--------------------------------------------------
        
        //TODO: Agregar accesorios: camara de retro a v2
        //Debería agregar estos accesorios como parte de las prestaciones del vehiculo
        
        
        //Mostrar prestaciones actualizadas del vehiculo
        
    }
    
}
