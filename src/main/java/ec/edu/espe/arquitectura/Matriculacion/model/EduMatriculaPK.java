/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.Matriculacion.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author pato-
 */
@Embeddable
public class EduMatriculaPK implements Serializable {

    
    @Column(name = "cod_matricula", nullable = false, length = 10)
    private String codMatricula;
    
    @Column(name = "cod_persona", nullable = false)
    private int codPersona;

    public EduMatriculaPK() {
    }

    public EduMatriculaPK(String codMatricula, int codPersona) {
        this.codMatricula = codMatricula;
        this.codPersona = codPersona;
    }

    public String getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(String codMatricula) {
        this.codMatricula = codMatricula;
    }

    public int getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codMatricula != null ? codMatricula.hashCode() : 0);
        hash += (int) codPersona;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof EduMatriculaPK)) {
            return false;
        }
        EduMatriculaPK other = (EduMatriculaPK) object;
        if ((this.codMatricula == null && other.codMatricula != null) || (this.codMatricula != null && !this.codMatricula.equals(other.codMatricula))) {
            return false;
        }
        if (this.codPersona != other.codPersona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.Matriculacion.model.EduMatriculaPK[ codMatricula=" + codMatricula + ", codPersona=" + codPersona + " ]";
    }
    
}
