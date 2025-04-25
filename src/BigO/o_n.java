package BigO;
/*
 * Cuando se habla de algoritmos, existe el Big O, que es con lo que vamos a medir la complejidad
 * en tiempo de nuestros algoritmos
 * En esta clase en especifico se habla de O(N) donde N representara la cantidad de veces que debe
 * ser ejecutado el codigo.
 * *   |
 *      *   32|                              *
 *      *    |                             *
 *      *   16|                        *
 *      *    |                   *
 *      *    8|              *
 *      *    |          *
 *      *    4|      *
 *      *    |   *
 *      *    2| *
 *      *    |*       *       *       *       *       *     → O(n)
 *      *    ----------------------------------------------------→ n
 *      *     1   2       3       4       5       6       7
 */

public class o_n {
    /*
     * En este ejercicio, imprimimos desde 0 hasta n, sin incluir n(el parametrp, al ir de 0 a N
     * Se puede afirmar que se ejecuta N veces, por lo que el algoritmo calza con O(n)
     */

    public static void printItems(int n){
        for(int i=0; i<0;i++){
            System.out.println(i);
        }
    }

}
