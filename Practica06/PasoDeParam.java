/**
 *Clase para notar las diferencias entre el paso de parámetros por valor y por referencia
 *@author Mario Rosales
 *@version 1.0
 */
public class PasoDeParam{
    /**
     *Método principal
     *@param args Argumentos
     */
    public static void main (String[] args){
	//Declaramos e inicializamos dos arreglos con 0 como único valor
	int[] valor = {0};
	int[] referencia = {0};
	//Pasamos la variable por valor y le sumamos 5
	porValor(valor[0]);
	System.out.println(valor[0]); //Imprime 0 porque en el paso de parámetros por valor no se cambia la variable original ya que solo se le pasó una copia de su valor a la función
	//Pasamos la variable por referencia y le sumamos 5
	porReferencia(referencia);
	System.out.println(referencia[0]); //Imprime 5 porque en el paso por referencia sí se cambia la variable original
	//Hacemos otro paso por valor pero con un return
	valor[0] = porValor2(valor[0]);
	System.out.println(valor[0]);//Imprime 5 porque el valor fue devuelto y asignado a la variable original
    }
    /**
     *Método que recibe un entero por valor y le suma 5
     *@param v El valor de una variable
     */
    public static void porValor(int v){
	v+=5;
    }
    /**Método que recibe un arreglo de enteros por referencia y le suma 5 al primer elemento
     *@param r La referencia del arreglo
     */
    public static void porReferencia(int[] r){
	r[0]+=5;
    }
    /**
     *Método que recibe un entero por valor, le suma 5 y lo devuelve
     *@param v El valor de una variable
     *@return El valor de la variable más 5
     */
    public static int porValor2(int v){
	v+=5;
	    return v;
    }
}
