package prueba;

import java.util.Arrays;

/**
 *
 * @author franci
 */
public class Coinage
{
    static final double[] EUR = 
    {
        0.01, 0.02, 0.05, 0.10, 0.20, 0.50,
        1, 2, 5, 10, 20, 50, 100, 200, 500, 
    };
    
    final double[] types;
    
    public Coinage(double[] coinTypes)
    {
        coinTypes = coinTypes.clone();
        Arrays.sort(coinTypes);
        this.types = new double[coinTypes.length];
        for(int i=0,n=coinTypes.length-1;i<coinTypes.length;i++,n--)
        {
            this.types[i] = coinTypes[n];
        }
    }
    
    public static Coinage eurInstance()
    {
        return new Coinage(EUR);
    }
    
    public double[] getTypes()
    {
        return this.types.clone();
    }
    
    public int[] getCoins(double amount)
    {
        int[] count = new int[this.types.length];
        double delta = this.types[this.types.length-1]/2;
        for(int i=0;i<count.length && amount>delta;)
        {
            if(amount+delta>=this.types[i])
            {
                count[i]++;
                amount -= this.types[i];
            }
            else
            {
                i++;
            }
        }
        return count;
    }
}
