
package ec.edu.espe.arquitectura.Matriculacion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "edu_matricula_nrc")

public class EduMatriculaNrc implements Serializable {

    private static final long serialVersionUID = 65756;
    @EmbeddedId
    protected EduMatriculaNrcPK eduMatriculaNrcPK;
    
    @Column(name = "estado", nullable = false, length = 3)
    private String estado;
    
    @Column(name = "numero", nullable = false)
    private short numero;
   
    @Column(name = "costo", nullable = false, precision = 7, scale = 2)
    private BigDecimal costo;
    @JoinColumns({
        @JoinColumn(name = "cod_matricula", referencedColumnName = "cod_matricula", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "cod_persona", referencedColumnName = "cod_persona", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private EduMatricula eduMatricula;
    @JoinColumns({
        @JoinColumn(name = "cod_nrc", referencedColumnName = "cod_nrc", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "cod_periodo", referencedColumnName = "cod_periodo", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "cod_departamento", referencedColumnName = "cod_departamento", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "cod_materia", referencedColumnName = "cod_materia", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private EduNrc eduNrc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eduMatriculaNrc")
    private List<EduCalificacion> eduCalificacionList;

    public EduMatriculaNrc() {
    }

    public EduMatriculaNrc(EduMatriculaNrcPK eduMatriculaNrcPK) {
        this.eduMatriculaNrcPK = eduMatriculaNrcPK;
    }



    public EduMatriculaNrc(short codNrc, int codPeriodo, int codDepartamento, int codMateria, String codMatricula, int codPersona) {
        this.eduMatriculaNrcPK = new EduMatriculaNrcPK(codNrc, codPeriodo, codDepartamento, codMateria, codMatricula, codPersona);
    }

    public EduMatriculaNrcPK getEduMatriculaNrcPK() {
        return eduMatriculaNrcPK;
    }

    public void setEduMatriculaNrcPK(EduMatriculaNrcPK eduMatriculaNrcPK) {
        this.eduMatriculaNrcPK = eduMatriculaNrcPK;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public short getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public EduMatricula getEduMatricula() {
        return eduMatricula;
    }

    public void setEduMatricula(EduMatricula eduMatricula) {
        this.eduMatricula = eduMatricula;
    }

    public EduNrc getEduNrc() {
        return eduNrc;
    }

    public void setEduNrc(EduNrc eduNrc) {
        this.eduNrc = eduNrc;
    }

    public List<EduCalificacion> getEduCalificacionList() {
        return eduCalificacionList;
    }

    public void setEduCalificacionList(List<EduCalificacion> eduCalificacionList) {
        this.eduCalificacionList = eduCalificacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eduMatriculaNrcPK != null ? eduMatriculaNrcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
       
        if (!(object instanceof EduMatriculaNrc)) {
            return false;
        }
        EduMatriculaNrc other = (EduMatriculaNrc) object;
        if ((this.eduMatriculaNrcPK == null && other.eduMatriculaNrcPK != null) || (this.eduMatriculaNrcPK != null && !this.eduMatriculaNrcPK.equals(other.eduMatriculaNrcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.Matriculacion.model.EduMatriculaNrc[ eduMatriculaNrcPK=" + eduMatriculaNrcPK + " ]";
    }
    
}
