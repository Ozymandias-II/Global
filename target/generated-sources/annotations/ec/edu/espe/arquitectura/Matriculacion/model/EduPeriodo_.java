package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.EduMatricula;
import ec.edu.espe.arquitectura.Matriculacion.model.EduNrc;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(EduPeriodo.class)
public class EduPeriodo_ { 

    public static volatile SingularAttribute<EduPeriodo, Date> fechaInicio;
    public static volatile SingularAttribute<EduPeriodo, EduNrc> eduNrc;
    public static volatile SingularAttribute<EduPeriodo, Integer> codPeriodo;
    public static volatile SingularAttribute<EduPeriodo, String> nombre;
    public static volatile SingularAttribute<EduPeriodo, String> nivel;
    public static volatile SingularAttribute<EduPeriodo, Date> fechaFin;
    public static volatile SingularAttribute<EduPeriodo, EduMatricula> eduMatricula;
    public static volatile SingularAttribute<EduPeriodo, Short> parciales;

}