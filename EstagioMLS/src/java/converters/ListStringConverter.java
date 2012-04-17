/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package converters;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlOutputLabel;
import org.primefaces.component.autocomplete.AutoComplete;
import org.primefaces.component.button.Button;
import org.primefaces.component.column.Column;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.panelgrid.PanelGrid;
import org.primefaces.component.row.Row;

/**
 *
 * @author tchulla
 */
public class ListStringConverter implements ComponentConverter{
    
    /**
     * TODO apagar    
     * Os metodos abaixo foram gerados automáticamente com intuito de testar as funcionalidades 
     * desta classe quando necessario.
     */
    
    public static void main(String[] args) {
        new ListStringConverter().teste();
    }

    private void teste(){
        // Implementação de testes das funcionalidades.
        System.out.println(
        isValid((new ArrayList<String>()).getClass()));
        
        System.out.println(
        isValid(String[].class));
    }

    public UIComponent getComponent(Class clazz) {
        List<String>lista = (List<String>) clazz.cast(new ArrayList());
        
        PanelGrid panelGrid = new PanelGrid();
        panelGrid.setColumns(2);
       
        Row row = new Row();
        
        HtmlOutputLabel label = new HtmlOutputLabel();
        label.setValue(clazz.getSuperclass().getName()   + "");
        
        Column c1 = new Column();
        c1.getChildren().add(label);
        
        InputText text = new InputText();
        Column c2 = new Column();
        c2.getChildren().add(text);
        
        Column c3 = new Column();
        Button button = new Button();
        button.setValue("+");
        
        c3.getChildren().add(button);
        
        row.getChildren().add(c1);
        row.getChildren().add(c2);
        row.getChildren().add(c3);
        
        panelGrid.getChildren().add(row);
        
        return panelGrid;
    }

    public boolean isValid(Class clazz) {
        System.out.println(clazz);
        
        try {
            if(clazz.isPrimitive()){
                return int.class.toString().equals("int");
            }else{
                return clazz.getSuperclass().toString().equals(AbstractList.class.toString())
                        || clazz.isArray();
            }
        } catch (Exception e) {
            return false;
        }
    }

}
