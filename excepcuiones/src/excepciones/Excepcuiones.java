
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author alumno
 */
public class Excepcuiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int resultados=Calculos.dividir(3, 0);
        //System.out.println(resultados);
        try{
        int resultado=Calculos.dividir(3, 0);
        System.out.println("el resultado es : "+resultado);
        }catch(Exception e){
            System.out.println(e.toString());
        
        }
      
    }
    
}
