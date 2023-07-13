/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author isaac_dugo
 */
public abstract class Fecha {

    public static long diff(LocalDate a, LocalDate b) {

        return ChronoUnit.DAYS.between(a, b);

    }

    public static int counth(LocalDate starDate, LocalDate endDate)
    {
        int count=0;
        LocalDate currentDate = starDate;
        while(!currentDate.isAfter(endDate))
        {   
            if(currentDate.getDayOfMonth()==13 && currentDate.getDayOfWeek().equals("TUESDAY"))
            {
                count++;
            }
       
            currentDate=currentDate.plusDays(1);
            
        }
        return count;
    }

}
