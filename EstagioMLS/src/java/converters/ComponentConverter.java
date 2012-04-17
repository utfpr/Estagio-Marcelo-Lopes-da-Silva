/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

import javax.faces.component.UIComponent;

/**
 *
 * @author tchulla
 */
public interface ComponentConverter {
    UIComponent getComponent(Class clazz);
    boolean isValid(Class clazz);
}
