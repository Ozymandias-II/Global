
package ec.edu.espe.arquitectura.Matriculacion.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "seg_perfil")

public class SegPerfil implements Serializable {

    private static final long serialVersionUID = 2332423;
    @Id
    
    @Column(name = "cod_perfil", nullable = false, length = 8)
    private String codPerfil;
    
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    
    @Column(name = "estado", nullable = false, length = 3)
    private String estado;
    
    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;
    
    @Column(name = "aud_fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFecha;
    
    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;
    
    @Column(name = "version", nullable = false)
    private int version;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segPerfil")
    private List<SegUsuarioPerfil> segUsuarioPerfilList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segPerfil")
    private List<SegPerfilFuncionalidad> segPerfilFuncionalidadList;

    public SegPerfil() {
    }

    public SegPerfil(String codPerfil) {
        this.codPerfil = codPerfil;
    }

 
    public String getCodPerfil() {
        return codPerfil;
    }

    public void setCodPerfil(String codPerfil) {
        this.codPerfil = codPerfil;
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

    public List<SegUsuarioPerfil> getSegUsuarioPerfilList() {
        return segUsuarioPerfilList;
    }

    public void setSegUsuarioPerfilList(List<SegUsuarioPerfil> segUsuarioPerfilList) {
        this.segUsuarioPerfilList = segUsuarioPerfilList;
    }

    public List<SegPerfilFuncionalidad> getSegPerfilFuncionalidadList() {
        return segPerfilFuncionalidadList;
    }

    public void setSegPerfilFuncionalidadList(List<SegPerfilFuncionalidad> segPerfilFuncionalidadList) {
        this.segPerfilFuncionalidadList = segPerfilFuncionalidadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPerfil != null ? codPerfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof SegPerfil)) {
            return false;
        }
        SegPerfil other = (SegPerfil) object;
        if ((this.codPerfil == null && other.codPerfil != null) || (this.codPerfil != null && !this.codPerfil.equals(other.codPerfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.Matriculacion.model.SegPerfil[ codPerfil=" + codPerfil + " ]";
    }
    
}
