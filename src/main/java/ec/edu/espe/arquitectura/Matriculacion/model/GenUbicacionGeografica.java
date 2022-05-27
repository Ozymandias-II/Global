
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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "gen_ubicacion_geografica")
@NamedQueries({
    @NamedQuery(name = "GenUbicacionGeografica.findAll", query = "SELECT g FROM GenUbicacionGeografica g")})
public class GenUbicacionGeografica implements Serializable {

    private static final long serialVersionUID = 1435344;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "cod_ubicacion_geo_int", nullable = false)
    private Integer codUbicacionGeoInt;
    
    @Column(name = "cod_ubicacion_geografica", nullable = false, length = 20)
    private String codUbicacionGeografica;
    
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name = "codigo_area_telefono", length = 4)
    private String codigoAreaTelefono;
    @Column(name = "codigo_alterno", length = 15)
    private String codigoAlterno;
    @Column(name = "codigo_postal", length = 15)
    private String codigoPostal;
  
    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;
   
    @Column(name = "aud_fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFecha;
    
    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;
   
    @Column(name = "version", nullable = false)
    private int version;
    @OneToMany(mappedBy = "codUbicacionGeoInt")
    private List<GenInstitucion> genInstitucionList;
    @JoinColumn(name = "cod_pais", referencedColumnName = "cod_pais")
    @ManyToOne
    private GenPais codPais;
    @JoinColumns({
        @JoinColumn(name = "cod_pais", referencedColumnName = "cod_pais"),
        @JoinColumn(name = "nivel", referencedColumnName = "nivel", nullable = false)})
    @ManyToOne(optional = false)
    private GenPaisEstructura genPaisEstructura;
    @OneToMany(mappedBy = "codUbicacionGeoPadre")
    private List<GenUbicacionGeografica> genUbicacionGeograficaList;
    @JoinColumn(name = "cod_ubicacion_geo_padre", referencedColumnName = "cod_ubicacion_geo_int")
    @ManyToOne
    private GenUbicacionGeografica codUbicacionGeoPadre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lugarNacimiento")
    private List<PerPersona> perPersonaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUbicacionGeoInt")
    private List<EduInstitucionEducativa> eduInstitucionEducativaList;

    public GenUbicacionGeografica() {
    }

    public GenUbicacionGeografica(Integer codUbicacionGeoInt) {
        this.codUbicacionGeoInt = codUbicacionGeoInt;
    }



    public Integer getCodUbicacionGeoInt() {
        return codUbicacionGeoInt;
    }

    public void setCodUbicacionGeoInt(Integer codUbicacionGeoInt) {
        this.codUbicacionGeoInt = codUbicacionGeoInt;
    }

    public String getCodUbicacionGeografica() {
        return codUbicacionGeografica;
    }

    public void setCodUbicacionGeografica(String codUbicacionGeografica) {
        this.codUbicacionGeografica = codUbicacionGeografica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoAreaTelefono() {
        return codigoAreaTelefono;
    }

    public void setCodigoAreaTelefono(String codigoAreaTelefono) {
        this.codigoAreaTelefono = codigoAreaTelefono;
    }

    public String getCodigoAlterno() {
        return codigoAlterno;
    }

    public void setCodigoAlterno(String codigoAlterno) {
        this.codigoAlterno = codigoAlterno;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
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

    public List<GenInstitucion> getGenInstitucionList() {
        return genInstitucionList;
    }

    public void setGenInstitucionList(List<GenInstitucion> genInstitucionList) {
        this.genInstitucionList = genInstitucionList;
    }

    public GenPais getCodPais() {
        return codPais;
    }

    public void setCodPais(GenPais codPais) {
        this.codPais = codPais;
    }

    public GenPaisEstructura getGenPaisEstructura() {
        return genPaisEstructura;
    }

    public void setGenPaisEstructura(GenPaisEstructura genPaisEstructura) {
        this.genPaisEstructura = genPaisEstructura;
    }

    public List<GenUbicacionGeografica> getGenUbicacionGeograficaList() {
        return genUbicacionGeograficaList;
    }

    public void setGenUbicacionGeograficaList(List<GenUbicacionGeografica> genUbicacionGeograficaList) {
        this.genUbicacionGeograficaList = genUbicacionGeograficaList;
    }

    public GenUbicacionGeografica getCodUbicacionGeoPadre() {
        return codUbicacionGeoPadre;
    }

    public void setCodUbicacionGeoPadre(GenUbicacionGeografica codUbicacionGeoPadre) {
        this.codUbicacionGeoPadre = codUbicacionGeoPadre;
    }

    public List<PerPersona> getPerPersonaList() {
        return perPersonaList;
    }

    public void setPerPersonaList(List<PerPersona> perPersonaList) {
        this.perPersonaList = perPersonaList;
    }

    public List<EduInstitucionEducativa> getEduInstitucionEducativaList() {
        return eduInstitucionEducativaList;
    }

    public void setEduInstitucionEducativaList(List<EduInstitucionEducativa> eduInstitucionEducativaList) {
        this.eduInstitucionEducativaList = eduInstitucionEducativaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUbicacionGeoInt != null ? codUbicacionGeoInt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
       
        if (!(object instanceof GenUbicacionGeografica)) {
            return false;
        }
        GenUbicacionGeografica other = (GenUbicacionGeografica) object;
        if ((this.codUbicacionGeoInt == null && other.codUbicacionGeoInt != null) || (this.codUbicacionGeoInt != null && !this.codUbicacionGeoInt.equals(other.codUbicacionGeoInt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.Matriculacion.model.GenUbicacionGeografica[ codUbicacionGeoInt=" + codUbicacionGeoInt + " ]";
    }
    
}
