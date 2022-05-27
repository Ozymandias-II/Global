
package ec.edu.espe.arquitectura.Matriculacion.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class PerHistTipoPersonaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "cod_persona", nullable = false)
    private int codPersona;
    @Basic(optional = false)
    @Column(name = "cod_tipo_persona", nullable = false, length = 3)
    private String codTipoPersona;

    public PerHistTipoPersonaPK() {
    }

    public PerHistTipoPersonaPK(int codPersona, String codTipoPersona) {
        this.codPersona = codPersona;
        this.codTipoPersona = codTipoPersona;
    }

    public int getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
    }

    public String getCodTipoPersona() {
        return codTipoPersona;
    }

    public void setCodTipoPersona(String codTipoPersona) {
        this.codTipoPersona = codTipoPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codPersona;
        hash += (codTipoPersona != null ? codTipoPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof PerHistTipoPersonaPK)) {
            return false;
        }
        PerHistTipoPersonaPK other = (PerHistTipoPersonaPK) object;
        if (this.codPersona != other.codPersona) {
            return false;
        }
        if ((this.codTipoPersona == null && other.codTipoPersona != null) || (this.codTipoPersona != null && !this.codTipoPersona.equals(other.codTipoPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.Matriculacion.model.PerHistTipoPersonaPK[ codPersona=" + codPersona + ", codTipoPersona=" + codTipoPersona + " ]";
    }
    
}
