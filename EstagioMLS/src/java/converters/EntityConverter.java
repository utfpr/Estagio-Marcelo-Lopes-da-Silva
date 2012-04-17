/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

import beans.AlunoBean;
import core.FormBuilder;
import core.myannotations.Entidade;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlOutputLabel;
import org.primefaces.component.button.Button;
import org.primefaces.component.column.Column;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.panelgrid.PanelGrid;
import org.primefaces.component.row.Row;

/**
 *
 * @author tchulla
 */
public class EntityConverter implements ComponentConverter {

    /**
     * TODO apagar Os metodos abaixo foram gerados automáticamente com intuito
     * de testar as funcionalidades desta classe quando necessario.
     */
    public static void main(String[] args) {
        new EntityConverter().teste();
    }

    private void teste() {
        // Implementação de testes das funcionalidades.
        System.out.println(
                isValid((new ArrayList<String>()).getClass()));

        System.out.println(
                isValid(AlunoBean.class));
    }

    public UIComponent getComponent(Class clazz) {
        List<String> lista = (List<String>) clazz.cast(new ArrayList());

        PanelGrid panelGrid = new PanelGrid();
        panelGrid.setColumns(2);
        
//        panelGrid.getChildren().add(new FormBuilder().getPanelGrid(clazz));
        
        return panelGrid;
    }

    public boolean isValid(Class clazz) {
        System.out.println(clazz);

        try {

            System.out.println(clazz);
            
            return clazz.isAnnotationPresent(Entidade.class);

        } catch (Exception e) {
            return false;
        }
    }
}
