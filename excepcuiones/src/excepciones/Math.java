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
public class Math {
    public static  int dividir(int n1,int n2)throws ArithmeticException{
        if(n2==0){
            throw new ArithmeticException("no se puede dividir");
        }
        int r =n1/n2;
        
        return r;
    }
    public static int dividirPares(int n1,int n2)throws Exception{
        //acac se  comprueba si alguno de los 2 numero es cero
    if(n1%2 == 0 || n2%2 == 0){
    throw new ceroCeroException("no se puede dividir numeros impares");
    }
    // aca se comprueba si ambos 
    if(n1%2 == 0 && n2%2 == 0){
    throw new ceroExcetion("no se puede dividir numeros impares");
    }   
    if(n1%2 != 0 || n2%2 != 0){
    throw new ImparExepcion("no se puede dividir numeros impares");
    }
    int r =n1/n2;
    return r;
    }
   
}
