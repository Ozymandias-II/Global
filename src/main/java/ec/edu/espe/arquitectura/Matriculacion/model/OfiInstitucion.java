
package ec.edu.espe.arquitectura.Matriculacion.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "ofi_institucion")
@NamedQueries({
    @NamedQuery(name = "OfiInstitucion.findAll", query = "SELECT o FROM OfiInstitucion o")})
public class OfiInstitucion implements Serializable {

    private static final long serialVersionUID = 4353453;
    @Id
    
    @Column(name = "cod_institucion", nullable = false)
    private Short codInstitucion;
    
    @Column(name = "ruc", nullable = false, length = 13)
    private String ruc;
    
    @Column(name = "razon_social", nullable = false, length = 250)
    private String razonSocial;
    
    @Column(name = "nombre_comercial", nullable = false, length = 250)
    private String nombreComercial;
    @Column(name = "dominio", length = 128)
    private String dominio;
    
    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;
    
    @Column(name = "aud_fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFecha;
    
    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;
    
    @Column(name = "version", nullable = false)
    private int version;
    @OneToMany(mappedBy = "codInstitucion")
    private List<OfiSede> ofiSedeList;

    public OfiInstitucion() {
    }

    public OfiInstitucion(Short codInstitucion) {
        this.codInstitucion = codInstitucion;
    }



    public Short getCodInstitucion() {
        return codInstitucion;
    }

    public void setCodInstitucion(Short codInstitucion) {
        this.codInstitucion = codInstitucion;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
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

    public List<OfiSede> getOfiSedeList() {
        return ofiSedeList;
    }

    public void setOfiSedeList(List<OfiSede> ofiSedeList) {
        this.ofiSedeList = ofiSedeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codInstitucion != null ? codInstitucion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OfiInstitucion)) {
            return false;
        }
        OfiInstitucion other = (OfiInstitucion) object;
        if ((this.codInstitucion == null && other.codInstitucion != null) || (this.codInstitucion != null && !this.codInstitucion.equals(other.codInstitucion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.Matriculacion.model.OfiInstitucion[ codInstitucion=" + codInstitucion + " ]";
    }
    
}
