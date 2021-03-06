
package ec.edu.espe.arquitectura.Matriculacion.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class EduNrcHorarioPK implements Serializable {

    
    @Column(name = "cod_nrc", nullable = false)
    private short codNrc;
    
    @Column(name = "cod_periodo", nullable = false)
    private int codPeriodo;
    
    @Column(name = "cod_departamento", nullable = false)
    private int codDepartamento;
    
    @Column(name = "cod_materia", nullable = false)
    private int codMateria;
    
    @Column(name = "cod_aula", nullable = false)
    private int codAula;
    
    @Column(name = "dia_semana", nullable = false, length = 25)
    private String diaSemana;

    public EduNrcHorarioPK() {
    }

    public EduNrcHorarioPK(short codNrc, int codPeriodo, int codDepartamento, int codMateria, int codAula, String diaSemana) {
        this.codNrc = codNrc;
        this.codPeriodo = codPeriodo;
        this.codDepartamento = codDepartamento;
        this.codMateria = codMateria;
        this.codAula = codAula;
        this.diaSemana = diaSemana;
    }

    public short getCodNrc() {
        return codNrc;
    }

    public void setCodNrc(short codNrc) {
        this.codNrc = codNrc;
    }

    public int getCodPeriodo() {
        return codPeriodo;
    }

    public void setCodPeriodo(int codPeriodo) {
        this.codPeriodo = codPeriodo;
    }

    public int getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(int codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public int getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(int codMateria) {
        this.codMateria = codMateria;
    }

    public int getCodAula() {
        return codAula;
    }

    public void setCodAula(int codAula) {
        this.codAula = codAula;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codNrc;
        hash += (int) codPeriodo;
        hash += (int) codDepartamento;
        hash += (int) codMateria;
        hash += (int) codAula;
        hash += (diaSemana != null ? diaSemana.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof EduNrcHorarioPK)) {
            return false;
        }
        EduNrcHorarioPK other = (EduNrcHorarioPK) object;
        if (this.codNrc != other.codNrc) {
            return false;
        }
        if (this.codPeriodo != other.codPeriodo) {
            return false;
        }
        if (this.codDepartamento != other.codDepartamento) {
            return false;
        }
        if (this.codMateria != other.codMateria) {
            return false;
        }
        if (this.codAula != other.codAula) {
            return false;
        }
        if ((this.diaSemana == null && other.diaSemana != null) || (this.diaSemana != null && !this.diaSemana.equals(other.diaSemana))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.Matriculacion.model.EduNrcHorarioPK[ codNrc=" + codNrc + ", codPeriodo=" + codPeriodo + ", codDepartamento=" + codDepartamento + ", codMateria=" + codMateria + ", codAula=" + codAula + ", diaSemana=" + diaSemana + " ]";
    }
    
}
