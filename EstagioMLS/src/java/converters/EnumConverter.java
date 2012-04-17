/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package converters;

import beans.EnumSexo;
import java.lang.reflect.Field;
import javax.faces.component.UIComponent;
import org.primefaces.component.inputmask.InputMask;
import org.primefaces.component.selectbooleancheckbox.SelectBooleanCheckbox;
import org.primefaces.component.selectonelistbox.SelectOneListbox;

/**
 *
 * @author tchulla
 */
public class EnumConverter implements ComponentConverter{
    
    /**
     * TODO apagar    
     * Os metodos abaixo foram gerados automáticamente com intuito de testar as funcionalidades 
     * desta classe quando necessario.
     */
    
    public static void main(String[] args) {
        new EnumConverter().teste();
    }

    private void teste(){
        // Implementação de testes das funcionalidades.
        System.out.println(
        isValid(EnumSexo.class));
        getComponent(EnumSexo.class);
    }

    public UIComponent getComponent(Class clazz) {
        SelectOneListbox comboBox = new SelectOneListbox();
        
        return comboBox;
    }

    public boolean isValid(Class clazz) {
        return clazz.isEnum();
//        if(clazz.isPrimitive()){
//            return int.class.toString().equals("int");
//        }else{
//            return clazz.toString().equals(new Integer(0).getClass().toString());
//        }
    }

}
