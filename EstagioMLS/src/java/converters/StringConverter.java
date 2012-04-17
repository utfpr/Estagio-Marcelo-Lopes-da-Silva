/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package converters;

import javax.faces.component.UIComponent;
import org.primefaces.component.inputmask.InputMask;
import org.primefaces.component.inputtext.InputText;

/**
 *
 * @author tchulla
 */
public class StringConverter implements ComponentConverter{
    
    /**
     * TODO apagar    
     * Os metodos abaixo foram gerados automáticamente com intuito de testar as funcionalidades 
     * desta classe quando necessario.
     */
    
    public static void main(String[] args) {
        new StringConverter().teste();
    }

    private void teste(){
        // Implementação de testes das funcionalidades.
        System.out.println(
        isValid(String.class));
    }

    public UIComponent getComponent(Class clazz) {
        InputText ret = new InputText();
        return ret;
    }

    public boolean isValid(Class clazz) {
        if(clazz.isPrimitive()){
            return int.class.toString().equals("int");
        }else{
            return clazz.toString().equals(new String().getClass().toString());
        }
    }

}
