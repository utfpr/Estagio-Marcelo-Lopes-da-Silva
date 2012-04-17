/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package converters;

import java.util.ArrayList;
import javax.faces.component.UIComponent;

/**
 *
 * @author tchulla
 */
public class ListConverters extends ArrayList<ComponentConverter> {
    
    public ListConverters() {
        registerAll();
    }
    
    private void registerAll(){
        register(new NumericConverter());
        register(new StringConverter());
        register(new EnumConverter());
        register(new DateConverter());
        register(new ListStringConverter());
//        register(new EntityConverter());
        
    }
    
    public void register(ComponentConverter comp){
        System.out.println("Registrando: " + comp);
        if(!contains(comp)){
            add(comp);
        }
    }
    
    public UIComponent getComponent(Class clazz){
        for (ComponentConverter cc : this) {
            if(cc.isValid(clazz)){
                return cc.getComponent(clazz);
            }
        }
        
        return null;
    }
}
