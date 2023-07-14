/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author isaac_dugo
 */
public class Moneda {
    public static Map<Integer, Integer> import(double importe)
    {
        Map<Integer, Integer> quant = new HashMap<>();
        int[] valores = {200, 100, 50, 20, 10, 5, 2, 1, .5, .2, .1, .05, .02, .01};
        for(int valor: valores)
        {
            int cant = importe/valor;
            if(cant>0)
            {
                quant.put(valor, cant);
                importe%=valor;
                
            }
            return quant;
        }
        
    }
       
}
