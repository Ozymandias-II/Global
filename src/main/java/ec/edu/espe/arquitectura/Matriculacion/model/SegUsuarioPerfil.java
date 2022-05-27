
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
@Table(name = "seg_usuario_perfil")

public class SegUsuarioPerfil implements Serializable {

    private static final long serialVersionUID = 435345345;
    @EmbeddedId
    protected SegUsuarioPerfilPK segUsuarioPerfilPK;
    
    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;
    
    @Column(name = "aud_fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFecha;
   
    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;
    
    @Column(name = "version", nullable = false)
    private int version;
    @JoinColumn(name = "cod_perfil", referencedColumnName = "cod_perfil", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SegPerfil segPerfil;
    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SegUsuario segUsuario;

    public SegUsuarioPerfil() {
    }

    public SegUsuarioPerfil(SegUsuarioPerfilPK segUsuarioPerfilPK) {
        this.segUsuarioPerfilPK = segUsuarioPerfilPK;
    }

 

    public SegUsuarioPerfil(String codUsuario, String codPerfil) {
        this.segUsuarioPerfilPK = new SegUsuarioPerfilPK(codUsuario, codPerfil);
    }

    public SegUsuarioPerfilPK getSegUsuarioPerfilPK() {
        return segUsuarioPerfilPK;
    }

    public void setSegUsuarioPerfilPK(SegUsuarioPerfilPK segUsuarioPerfilPK) {
        this.segUsuarioPerfilPK = segUsuarioPerfilPK;
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

    public SegPerfil getSegPerfil() {
        return segPerfil;
    }

    public void setSegPerfil(SegPerfil segPerfil) {
        this.segPerfil = segPerfil;
    }

    public SegUsuario getSegUsuario() {
        return segUsuario;
    }

    public void setSegUsuario(SegUsuario segUsuario) {
        this.segUsuario = segUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (segUsuarioPerfilPK != null ? segUsuarioPerfilPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof SegUsuarioPerfil)) {
            return false;
        }
        SegUsuarioPerfil other = (SegUsuarioPerfil) object;
        if ((this.segUsuarioPerfilPK == null && other.segUsuarioPerfilPK != null) || (this.segUsuarioPerfilPK != null && !this.segUsuarioPerfilPK.equals(other.segUsuarioPerfilPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.Matriculacion.model.SegUsuarioPerfil[ segUsuarioPerfilPK=" + segUsuarioPerfilPK + " ]";
    }
    
}
