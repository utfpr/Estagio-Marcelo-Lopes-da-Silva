/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core.myannotations;

import java.lang.annotation.*;

/**
 *
 * @author tchulla
 */
@Retention (RetentionPolicy.RUNTIME)  
@Target (value={ElementType.TYPE})  
@Documented
public @interface Entidade {
    
}
