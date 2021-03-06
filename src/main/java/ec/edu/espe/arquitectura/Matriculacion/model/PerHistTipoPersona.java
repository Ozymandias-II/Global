
package ec.edu.espe.arquitectura.Matriculacion.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "per_hist_tipo_persona")

public class PerHistTipoPersona implements Serializable {

    private static final long serialVersionUID = 23423423;
    @EmbeddedId
    protected PerHistTipoPersonaPK perHistTipoPersonaPK;
    
    @Column(name = "fecha_inicio", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
   
    @Column(name = "cod_usuario_ini", nullable = false, length = 30)
    private String codUsuarioIni;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "cod_usuario_fin", length = 30)
    private String codUsuarioFin;
    
    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;
    
    @Column(name = "aud_fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFecha;
   
    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;
    
    @Column(name = "version", nullable = false)
    private int version;
    @JoinColumn(name = "cod_persona", referencedColumnName = "cod_persona", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PerPersona perPersona;
    @JoinColumn(name = "cod_tipo_persona", referencedColumnName = "cod_tipo_persona", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PerTipoPersona perTipoPersona;

    public PerHistTipoPersona() {
    }

    public PerHistTipoPersona(PerHistTipoPersonaPK perHistTipoPersonaPK) {
        this.perHistTipoPersonaPK = perHistTipoPersonaPK;
    }

 

    public PerHistTipoPersona(int codPersona, String codTipoPersona) {
        this.perHistTipoPersonaPK = new PerHistTipoPersonaPK(codPersona, codTipoPersona);
    }

    public PerHistTipoPersonaPK getPerHistTipoPersonaPK() {
        return perHistTipoPersonaPK;
    }

    public void setPerHistTipoPersonaPK(PerHistTipoPersonaPK perHistTipoPersonaPK) {
        this.perHistTipoPersonaPK = perHistTipoPersonaPK;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCodUsuarioIni() {
        return codUsuarioIni;
    }

    public void setCodUsuarioIni(String codUsuarioIni) {
        this.codUsuarioIni = codUsuarioIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getCodUsuarioFin() {
        return codUsuarioFin;
    }

    public void setCodUsuarioFin(String codUsuarioFin) {
        this.codUsuarioFin = codUsuarioFin;
    }

    public String getAudUsuario() {
        return audUsuario;
    }

    public void setAudUsuario(String audUsuario) {
        this.audUsuario = audUsuario;
    }

    public Date getAudFecha() {
        return audFecha;
    }

    public void setAudFecha(Date audFecha) {
        this.audFecha = audFecha;
    }

    public String getAudIp() {
        return audIp;
    }

    public void setAudIp(String audIp) {
        this.audIp = audIp;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public PerPersona getPerPersona() {
        return perPersona;
    }

    public void setPerPersona(PerPersona perPersona) {
        this.perPersona = perPersona;
    }

    public PerTipoPersona getPerTipoPersona() {
        return perTipoPersona;
    }

    public void setPerTipoPersona(PerTipoPersona perTipoPersona) {
        this.perTipoPersona = perTipoPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perHistTipoPersonaPK != null ? perHistTipoPersonaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof PerHistTipoPersona)) {
            return false;
        }
        PerHistTipoPersona other = (PerHistTipoPersona) object;
        if ((this.perHistTipoPersonaPK == null && other.perHistTipoPersonaPK != null) || (this.perHistTipoPersonaPK != null && !this.perHistTipoPersonaPK.equals(other.perHistTipoPersonaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.Matriculacion.model.PerHistTipoPersona[ perHistTipoPersonaPK=" + perHistTipoPersonaPK + " ]";
    }
    
}
