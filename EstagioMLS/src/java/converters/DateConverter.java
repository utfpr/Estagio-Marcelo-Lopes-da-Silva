/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package converters;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.faces.component.UIComponent;
import org.primefaces.component.inputmask.InputMask;

/**
 *
 * @author tchulla
 */
public class DateConverter implements ComponentConverter{
    
    /**
     * TODO apagar    
     * Os metodos abaixo foram gerados automáticamente com intuito de testar as funcionalidades 
     * desta classe quando necessario.
     */
    
    public static void main(String[] args) {
        new DateConverter().teste();
    }

    private void teste(){
        // Implementação de testes das funcionalidades.
        System.out.println(
        isValid(Date.class));
        System.out.println(
        isValid(Calendar.class));
    }

    public UIComponent getComponent(Class clazz) {
        org.primefaces.component.calendar.Calendar calendar = new org.primefaces.component.calendar.Calendar();
        return calendar;
    }

    public boolean isValid(Class clazz) {
            return clazz.toString().equals(new Date().getClass().toString())
                    ||clazz.toString().equals(Calendar.class.toString());
    }

}
