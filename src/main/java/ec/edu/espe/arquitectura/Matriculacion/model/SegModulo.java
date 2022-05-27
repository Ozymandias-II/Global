
package ec.edu.espe.arquitectura.Matriculacion.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "seg_modulo")
@NamedQueries({
    @NamedQuery(name = "SegModulo.findAll", query = "SELECT s FROM SegModulo s")})
public class SegModulo implements Serializable {

    private static final long serialVersionUID = 2342242;
    @Id
    
    @Column(name = "cod_modulo", nullable = false, length = 16)
    private String codModulo;
    
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    
    @Column(name = "estado", nullable = false, length = 3)
    private String estado;
    
    @Column(name = "version", nullable = false)
    private int version;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codModulo")
    private List<SegFuncionalidad> segFuncionalidadList;

    public SegModulo() {
    }

    public SegModulo(String codModulo) {
        this.codModulo = codModulo;
    }

 
    public String getCodModulo() {
        return codModulo;
    }

    public void setCodModulo(String codModulo) {
        this.codModulo = codModulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public List<SegFuncionalidad> getSegFuncionalidadList() {
        return segFuncionalidadList;
    }

    public void setSegFuncionalidadList(List<SegFuncionalidad> segFuncionalidadList) {
        this.segFuncionalidadList = segFuncionalidadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codModulo != null ? codModulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof SegModulo)) {
            return false;
        }
        SegModulo other = (SegModulo) object;
        if ((this.codModulo == null && other.codModulo != null) || (this.codModulo != null && !this.codModulo.equals(other.codModulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.Matriculacion.model.SegModulo[ codModulo=" + codModulo + " ]";
    }
    
}
