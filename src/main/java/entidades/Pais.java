
package entidades;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

        

@Entity    
public class Pais {
    

    @Id
    @GeneratedValue
    private int idPais; 
    private String nomPais;
    
    @ManyToOne(mappedBy = "pais")
    private List<Cliente> cliente = new ArrayList<Cliente>();
    

    public Pais() {
    }

    public Pais(int idPais, String nomPais) {
        this.idPais = idPais;
        this.nomPais = nomPais;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

 

    
    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNomPais() {
        return nomPais;
    }

    public void setNomPais(String nomPais) {
        this.nomPais = nomPais;
    }
    
    
    
    
    
}
