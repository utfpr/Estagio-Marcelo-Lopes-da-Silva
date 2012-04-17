/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package converters;

import java.util.ArrayList;
import java.util.List;
import javax.faces.component.UIComponent;
import org.primefaces.component.inputmask.InputMask;

/**
 *
 * @author tchulla
 */
public class NumericConverter implements ComponentConverter{
    
    /**
     * TODO apagar    
     * Os metodos abaixo foram gerados automáticamente com intuito de testar as funcionalidades 
     * desta classe quando necessario.
     */
    
    public static void main(String[] args) {
        new NumericConverter().teste();
    }

    private void teste(){
        // Implementação de testes das funcionalidades.
        System.out.println(
        isValid(Integer.class));
        
        
        
        System.out.println(getComponent(ArrayList.class));
    }

    public UIComponent getComponent(Class clazz) {
        InputMask inputMask = new InputMask();
        inputMask.setMask("number");
        return inputMask;
    }

    public boolean isValid(Class clazz) {
        try {
            if(clazz.isPrimitive()){
                return int.class.toString().equals("int");
            }else{
                return clazz.getGenericSuperclass().toString().equals(Number.class.toString());
            }
            
        } catch (Exception e) {
            return false;
        }
    }

}
