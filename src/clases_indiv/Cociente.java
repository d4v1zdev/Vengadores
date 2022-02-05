package clases_indiv;

/**
 * Declaracion de la clase Cociente
 *
 * @author d4v1z
 * @version 1.0
 *
 */


public class Cociente {

    /**
     * Definimos las variables de ambito privado, total como double sin asignar valor, ya que se implicito.
     * donde almacenaremos siempre el resultado de las operaciones
     *
     */
    
    private double total;

    /**
     * Metodo que realiza la <b>division de enteros</b>, tiene en cunta si introducimos un valor 0, con lo
     * que lanzara un error, pero no generara excepcion
     * @param num1 es el valor que usaremos para el dividendo
     * @param num2 es el valor que usaremos para el divisor
     * @return <b> total</b>
     */
   
    public int cocEnterosTry(int num1, int num2) {
        try {
            total = num1 / num2;
        } catch (ArithmeticException ex) {
            System.out.println("Hay un error.: "+ ex.getMessage());
        } finally {
            return (int) total;
        }


    }

    /**
     * Metodo que realiza la <b>division de numeros reales</b>, tiene en cuenta si introducimos un valor 0, con lo
     * que lanzara un error, pero no generara excepcion, nos indicara que tipo de excepcion
     * @param num1 es el valor que usaremos para el dividendo
     * @param num2 es el valor que usaremos para el divisor
     * @return <b> total</b> redondeando a numero con <b>2 decimales</b>
     * @throws Exception Si el num2 es igual a 0, el sistema va lanzar una excepcion, que indicaremos en el main.
     */


    public static double cocReal(double num1, double num2) throws Exception {
        double total = 0;
        if(num2!=0) {
            total = Math.round((num1 / num2)*100d)/100d;
        } else {
            throw new Exception();
        }
        return total;
    }


    /**
     * Metodo que realiza el calculo del inverso multiplicativo. El inverso es el numero que debes multiplicar
     * a cualquier numero diferente de 0 para que el resultado sea 1. Tambien es conocido como recıproco
     * tiene en cuenta si introducimos un valor 0, ya que el 0 no tiene Inverso
     * que lanzara un error, pero no generara excepcion, nos indicara que tipo de excepcion
     * @param num1 es el valor que usaremos para para calcular el inverso
     * @return <b> total</b> redondeando a numero con <b>9 decimales</b>
     * @throws Exception Se comprueba que excepcion devuelve al intentar hacer el Inverso de 0.
     */


    public static double inverso(double num1) throws Exception {
        double total = 0;
        if(num1!=0){
            total = 1/num1;
        }else {
            throw new Exception();
        }
        return total;
    }

    /**
     * Metodo que calcula la raiz cuadrada de un numero, teniendo en cuenta las premisas de que no todos los números
     * tienen raz cuadrada, la <b>raiz cuadrada de un num positivo</b>, tiene 2 soluciones +-x,
     * <b>la raiz cuadrada de 0 es 0</b>, <b>la rz cuadrada de un num negativo</b>, no tiene solucion real.
     * @param num1
     * @return total Si el num1 no es numero negativo su raiz cuadrada
     * @throws Exception Comprueba si hay una excepcion y en la ejecucion nos indica que tipo de excepcion
     */
    
    public static double calRaiz(double num1) throws Exception {
        double total = 0;
        if(num1>=0){
            total = Math.sqrt(num1);
        } else {
            throw new Exception();
        }
        return total;
    }

}
