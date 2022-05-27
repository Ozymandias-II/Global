package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.EduCarrera;
import ec.edu.espe.arquitectura.Matriculacion.model.EduMatriculaNrc;
import ec.edu.espe.arquitectura.Matriculacion.model.EduMatriculaPK;
import ec.edu.espe.arquitectura.Matriculacion.model.EduPeriodo;
import ec.edu.espe.arquitectura.Matriculacion.model.PerPersona;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(EduMatricula.class)
public class EduMatricula_ { 

    public static volatile SingularAttribute<EduMatricula, PerPersona> perPersona;
    public static volatile SingularAttribute<EduMatricula, Date> fecha;
    public static volatile SingularAttribute<EduMatricula, String> tipo;
    public static volatile ListAttribute<EduMatricula, EduMatriculaNrc> eduMatriculaNrcList;
    public static volatile SingularAttribute<EduMatricula, EduMatriculaPK> eduMatriculaPK;
    public static volatile SingularAttribute<EduMatricula, Double> costo;
    public static volatile SingularAttribute<EduMatricula, EduCarrera> codCarrera;
    public static volatile SingularAttribute<EduMatricula, EduPeriodo> codPeriodo;

}