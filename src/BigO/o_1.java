package BigO;
/*
 * A diferencia de O(n), O(1) significa que sin importar como crezca la operacion , la cantidad
 * de operaciones sera siempre constante
* */

public class o_1 {
    /*
    * Por ejemplo, aca, sin importar cuantas veces n, siempre habra una sola operacion, por lo que es constante
    *Este es el O(n) mas eficiente*/
    public static int  addItems(int n){
        return n+n;
    }
}
