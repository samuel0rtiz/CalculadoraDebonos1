/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradebonos1;

/**
 *
 * @author martinortizmorales
 */
public class CalculadoraDebonos1 {
    
    int salario;
    String mensajebono;
 public void  calcular() {

        salario = 50000;
        mensajebono = "Bono = $" + (.02 * salario);
        System.out.println(mensajebono);

    }


    
        public static void  main (String[]args){
            CalculadoraDebonos1 calcular=new CalculadoraDebonos1();
            calcular.calcular ();
        }
}
