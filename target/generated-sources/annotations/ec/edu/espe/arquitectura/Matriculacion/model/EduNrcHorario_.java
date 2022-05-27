package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.EduNrc;
import ec.edu.espe.arquitectura.Matriculacion.model.EduNrcHorarioPK;
import ec.edu.espe.arquitectura.Matriculacion.model.OfiAula;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(EduNrcHorario.class)
public class EduNrcHorario_ { 

    public static volatile SingularAttribute<EduNrcHorario, Date> horaFin;
    public static volatile SingularAttribute<EduNrcHorario, OfiAula> ofiAula;
    public static volatile SingularAttribute<EduNrcHorario, EduNrc> eduNrc;
    public static volatile SingularAttribute<EduNrcHorario, EduNrcHorarioPK> eduNrcHorarioPK;
    public static volatile SingularAttribute<EduNrcHorario, Date> horaInicio;

}