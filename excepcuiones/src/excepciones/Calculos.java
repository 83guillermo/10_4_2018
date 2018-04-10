
package excepciones;

/**
 *
 * @author alumno
 */
public class Calculos {
    static public int dividir(int n1,int n2)throws ArithmeticException {
       
        int r = Math.dividir(n1,n2);
        return r;
    }
        public static int dividirPares(int n1,int n2)throws ImparExepcion{
            int r= Math.dividirPares(n1, n2);
            return r;
        
       
    }
}
    
