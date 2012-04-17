package beans;


import core.myannotations.Entidade;
import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author tchulla
 */
@Entidade
public class AlunoBean {
    
    private Integer id;
    private Long id_L;
    private String nome;
    
    private Date dataNascimento;
    
    private ArrayList<String> listas;

    private EnderecoBean endereco;

}
