
package ec.edu.espe.arquitectura.Matriculacion.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class PerDireccionPersonaPK implements Serializable {

    
    @Column(name = "cod_persona", nullable = false)
    private int codPersona;
   
    @Column(name = "sec_direccion", nullable = false)
    private short secDireccion;

    public PerDireccionPersonaPK() {
    }

    public PerDireccionPersonaPK(int codPersona, short secDireccion) {
        this.codPersona = codPersona;
        this.secDireccion = secDireccion;
    }

    public int getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
    }

    public short getSecDireccion() {
        return secDireccion;
    }

    public void setSecDireccion(short secDireccion) {
        this.secDireccion = secDireccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codPersona;
        hash += (int) secDireccion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
       
        if (!(object instanceof PerDireccionPersonaPK)) {
            return false;
        }
        PerDireccionPersonaPK other = (PerDireccionPersonaPK) object;
        if (this.codPersona != other.codPersona) {
            return false;
        }
        if (this.secDireccion != other.secDireccion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.Matriculacion.model.PerDireccionPersonaPK[ codPersona=" + codPersona + ", secDireccion=" + secDireccion + " ]";
    }
    
}
