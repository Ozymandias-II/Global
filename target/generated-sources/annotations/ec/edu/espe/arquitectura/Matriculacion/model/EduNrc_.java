package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.EduMateria;
import ec.edu.espe.arquitectura.Matriculacion.model.EduMatriculaNrc;
import ec.edu.espe.arquitectura.Matriculacion.model.EduNrcHorario;
import ec.edu.espe.arquitectura.Matriculacion.model.EduNrcPK;
import ec.edu.espe.arquitectura.Matriculacion.model.EduPeriodo;
import ec.edu.espe.arquitectura.Matriculacion.model.PerPersona;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(EduNrc.class)
public class EduNrc_ { 

    public static volatile SingularAttribute<EduNrc, Short> cupoDisponible;
    public static volatile ListAttribute<EduNrc, EduMatriculaNrc> eduMatriculaNrcList;
    public static volatile SingularAttribute<EduNrc, PerPersona> codPersona;
    public static volatile ListAttribute<EduNrc, EduNrcHorario> eduNrcHorarioList;
    public static volatile SingularAttribute<EduNrc, EduNrcPK> eduNrcPK;
    public static volatile SingularAttribute<EduNrc, EduMateria> eduMateria;
    public static volatile SingularAttribute<EduNrc, Short> cupoRegistrado;
    public static volatile SingularAttribute<EduNrc, EduPeriodo> eduPeriodo;
    public static volatile SingularAttribute<EduNrc, String> nombre;

}