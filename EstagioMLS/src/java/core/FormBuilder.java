/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import beans.AlunoBean;
import converters.ComponentConverter;
import converters.ListConverters;
import core.myannotations.Entidade;
import java.lang.reflect.Field;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.webapp.FacetTag;
import org.primefaces.component.panelgrid.PanelGrid;

/**
 *
 * @author tchulla
 */
//constroi um formulario baseado em fields 
@ManagedBean
public class FormBuilder {

    private ListConverters listConverters;
    private Class entity;

    public FormBuilder() {
        listConverters = new ListConverters();
        setBean(AlunoBean.class);
    }

    public void setBean(Class managedBean) {
        this.entity = managedBean;
    }

    public static void main(String[] args) {
        new FormBuilder().teste();
    }

    public void print() {
        UIForm form = getUIForm();

        for (UIComponent ua : form.getChildren()) {
            System.out.println(ua);
            for (UIComponent ub : ua.getChildren()) {
                System.out.println(ub);
            }
        }
    }

    public PanelGrid getPanelGrid(Class classe) {
        PanelGrid panelGrid = new PanelGrid();
        panelGrid.setColumns(2);

        panelGrid.setInView(false);
        
        ListConverters lc = new ListConverters();
        
        

        for (Field field : classe.getDeclaredFields()) {
            if (lc != null) {
                UIComponent component = lc.getComponent(field.getType());
                
                if(component!=null){
                    //TODO label
                    HtmlOutputLabel label = new HtmlOutputLabel();
                    label.setValue(field.getName());
                    panelGrid.getChildren().add(label);
                    panelGrid.getChildren().add(lc.getComponent(field.getType()));
                }
            }


//            panelGrid.getChildren().add(new ListConverters().getComponent(field.getDeclaringClass()));

        }

        return panelGrid;
    }

    public UIForm getUIForm() {
        UIForm ret = new UIForm();

        if (entity == null) {
            return null;
        }

        if (entity.isAnnotationPresent(/*
                 * TODO: Deverá ser trocado pelo tipo da entidade
                 */Entidade.class)) {
//            System.out.println("Verificando: " + entity);
//            for (Field field : entity.getDeclaredFields()) {
//                UIComponent comp = listConverters.getComponent(field.getType());
//                if (comp != null) {
//                    System.out.println("add in " + ret.getClass().getSimpleName() + " -> " + comp.getClass().getSimpleName());
//                    ret.getChildren().add(comp);
//                }
//            }

            ret.getChildren().add(getPanelGrid(entity));

            return ret;
        }
        return null;
    }

    public UIForm getUIFormTest() {
        //formulário de teste
        setBean(AlunoBean.class);
        return getUIForm();
    }

    private void teste() {
        setBean(AlunoBean.class);
        System.out.println(getUIForm());
    }
}
