
package ec.edu.espe.arquitectura.Matriculacion.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "seg_funcionalidad")

public class SegFuncionalidad implements Serializable {

    private static final long serialVersionUID = 234879324;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "cod_funcionalidad", nullable = false)
    private Integer codFuncionalidad;
    
    @Column(name = "url_principal", nullable = false, length = 200)
    private String urlPrincipal;
    
    @Column(name = "nombre", nullable = false, length = 200)
    private String nombre;
    @Column(name = "descripcion", length = 500)
    private String descripcion;
    
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
    @JoinColumn(name = "cod_modulo", referencedColumnName = "cod_modulo", nullable = false)
    @ManyToOne(optional = false)
    private SegModulo codModulo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segFuncionalidad")
    private List<SegPerfilFuncionalidad> segPerfilFuncionalidadList;

    public SegFuncionalidad() {
    }

    public SegFuncionalidad(Integer codFuncionalidad) {
        this.codFuncionalidad = codFuncionalidad;
    }



    public Integer getCodFuncionalidad() {
        return codFuncionalidad;
    }

    public void setCodFuncionalidad(Integer codFuncionalidad) {
        this.codFuncionalidad = codFuncionalidad;
    }

    public String getUrlPrincipal() {
        return urlPrincipal;
    }

    public void setUrlPrincipal(String urlPrincipal) {
        this.urlPrincipal = urlPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public SegModulo getCodModulo() {
        return codModulo;
    }

    public void setCodModulo(SegModulo codModulo) {
        this.codModulo = codModulo;
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
        hash += (codFuncionalidad != null ? codFuncionalidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof SegFuncionalidad)) {
            return false;
        }
        SegFuncionalidad other = (SegFuncionalidad) object;
        if ((this.codFuncionalidad == null && other.codFuncionalidad != null) || (this.codFuncionalidad != null && !this.codFuncionalidad.equals(other.codFuncionalidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.Matriculacion.model.SegFuncionalidad[ codFuncionalidad=" + codFuncionalidad + " ]";
    }
    
}
