
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
@Table(name = "seg_perfil_funcionalidad")

public class SegPerfilFuncionalidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SegPerfilFuncionalidadPK segPerfilFuncionalidadPK;
    
    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;
    
    @Column(name = "aud_fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFecha;
    
    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;
    
    @Column(name = "version", nullable = false)
    private int version;
    @JoinColumn(name = "cod_funcionalidad", referencedColumnName = "cod_funcionalidad", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SegFuncionalidad segFuncionalidad;
    @JoinColumn(name = "cod_perfil", referencedColumnName = "cod_perfil", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SegPerfil segPerfil;

    public SegPerfilFuncionalidad() {
    }

    public SegPerfilFuncionalidad(SegPerfilFuncionalidadPK segPerfilFuncionalidadPK) {
        this.segPerfilFuncionalidadPK = segPerfilFuncionalidadPK;
    }

 
    public SegPerfilFuncionalidad(String codPerfil, int codFuncionalidad) {
        this.segPerfilFuncionalidadPK = new SegPerfilFuncionalidadPK(codPerfil, codFuncionalidad);
    }

    public SegPerfilFuncionalidadPK getSegPerfilFuncionalidadPK() {
        return segPerfilFuncionalidadPK;
    }

    public void setSegPerfilFuncionalidadPK(SegPerfilFuncionalidadPK segPerfilFuncionalidadPK) {
        this.segPerfilFuncionalidadPK = segPerfilFuncionalidadPK;
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

    public SegFuncionalidad getSegFuncionalidad() {
        return segFuncionalidad;
    }

    public void setSegFuncionalidad(SegFuncionalidad segFuncionalidad) {
        this.segFuncionalidad = segFuncionalidad;
    }

    public SegPerfil getSegPerfil() {
        return segPerfil;
    }

    public void setSegPerfil(SegPerfil segPerfil) {
        this.segPerfil = segPerfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (segPerfilFuncionalidadPK != null ? segPerfilFuncionalidadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof SegPerfilFuncionalidad)) {
            return false;
        }
        SegPerfilFuncionalidad other = (SegPerfilFuncionalidad) object;
        if ((this.segPerfilFuncionalidadPK == null && other.segPerfilFuncionalidadPK != null) || (this.segPerfilFuncionalidadPK != null && !this.segPerfilFuncionalidadPK.equals(other.segPerfilFuncionalidadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.Matriculacion.model.SegPerfilFuncionalidad[ segPerfilFuncionalidadPK=" + segPerfilFuncionalidadPK + " ]";
    }
    
}
