
package ec.edu.espe.arquitectura.Matriculacion.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "ofi_edificio_bloque")
@NamedQueries({
    @NamedQuery(name = "OfiEdificioBloque.findAll", query = "SELECT o FROM OfiEdificioBloque o")})
public class OfiEdificioBloque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    
    @Column(name = "cod_edificio_bloque", nullable = false, length = 8)
    private String codEdificioBloque;
    
    @Column(name = "nombre_bloque", nullable = false, length = 128)
    private String nombreBloque;
    @Column(name = "descripcion", length = 500)
    private String descripcion;
    
    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;
    
    @Column(name = "aud_fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFecha;
    
    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;
    
    @Column(name = "version", nullable = false)
    private int version;
    @JoinColumn(name = "cod_edificio", referencedColumnName = "cod_edificio")
    @ManyToOne
    private OfiEdificio codEdificio;
    @OneToMany(mappedBy = "codEdificioBloque")
    private List<OfiAula> ofiAulaList;

    public OfiEdificioBloque() {
    }

    public OfiEdificioBloque(String codEdificioBloque) {
        this.codEdificioBloque = codEdificioBloque;
    }



    public String getCodEdificioBloque() {
        return codEdificioBloque;
    }

    public void setCodEdificioBloque(String codEdificioBloque) {
        this.codEdificioBloque = codEdificioBloque;
    }

    public String getNombreBloque() {
        return nombreBloque;
    }

    public void setNombreBloque(String nombreBloque) {
        this.nombreBloque = nombreBloque;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public OfiEdificio getCodEdificio() {
        return codEdificio;
    }

    public void setCodEdificio(OfiEdificio codEdificio) {
        this.codEdificio = codEdificio;
    }

    public List<OfiAula> getOfiAulaList() {
        return ofiAulaList;
    }

    public void setOfiAulaList(List<OfiAula> ofiAulaList) {
        this.ofiAulaList = ofiAulaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEdificioBloque != null ? codEdificioBloque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof OfiEdificioBloque)) {
            return false;
        }
        OfiEdificioBloque other = (OfiEdificioBloque) object;
        if ((this.codEdificioBloque == null && other.codEdificioBloque != null) || (this.codEdificioBloque != null && !this.codEdificioBloque.equals(other.codEdificioBloque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.Matriculacion.model.OfiEdificioBloque[ codEdificioBloque=" + codEdificioBloque + " ]";
    }
    
}
