/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author tchulla
 */
public enum EnumSexo {
    M("Masculino"), F("Feminino");
    private String value;

    private EnumSexo(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
