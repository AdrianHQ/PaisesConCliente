
package entidades;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Cliente {
    
    @Id
    @GeneratedValue
    private int IdCliente;
    private String NombreCliente;
    private String apptCliente; 
    private String apmatCliente;
    private int idPais;

    @OneToMany
    private Pais pais;
    
    
    public Cliente() {
    }

    public Cliente(int IdCliente, String NombreCliente, String apptCliente, String apmatCliente, int idPais) {
        this.IdCliente = IdCliente;
        this.NombreCliente = NombreCliente;
        this.apptCliente = apptCliente;
        this.apmatCliente = apmatCliente;
        this.idPais = idPais;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }


    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getApptCliente() {
        return apptCliente;
    }

    public void setApptCliente(String apptCliente) {
        this.apptCliente = apptCliente;
    }

    public String getApmatCliente() {
        return apmatCliente;
    }

    public void setApmatCliente(String apmatCliente) {
        this.apmatCliente = apmatCliente;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }
    
    
    
}
