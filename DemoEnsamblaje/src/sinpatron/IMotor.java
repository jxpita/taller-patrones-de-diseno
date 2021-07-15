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
interface IMotor {
    String ConsumirCombustible();
    String InyectarCombustible(int cantidad);
    String RealizarEscape();
    String RealizarCombustion();
}
