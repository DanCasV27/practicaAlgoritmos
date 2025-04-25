package BigO;
/*
 * Por Otro lado, O(n^2) sucede cuando el tiempo se incrementa al n^2 esti oyede syceder por que
 * el algoritmo se ejecuta adentro de otro lo que hace que sea n*n o n^2
 * *   32|
 * *      *    |           * O(n^2)                 *→ O(n)
 * *      *   16|         *               *
 * *      *    |         *          *
 * *      *    8|       *       *
 * *      *    |       *   *
 * *      *    4|     * *
 * *      *    |   * *
 * *      *    2| * *
 * *      *    |*  *
 * *      *    ----------------------------------------------------→ n
 * *      *     1   2       3       4       5       6       7
 *
 * */
public class o_n_elevado_2 {
    public static void printItems(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n; j++){
                System.out.println(i+ " "+j);
            }
        }
    }
}
