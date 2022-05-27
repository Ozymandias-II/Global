package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.EduDepartamento;
import ec.edu.espe.arquitectura.Matriculacion.model.EduMallaCarrera;
import ec.edu.espe.arquitectura.Matriculacion.model.EduMateriaPK;
import ec.edu.espe.arquitectura.Matriculacion.model.EduNrc;
import ec.edu.espe.arquitectura.Matriculacion.model.EduPrerequisito;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(EduMateria.class)
public class EduMateria_ { 

    public static volatile SingularAttribute<EduMateria, BigDecimal> horas;
    public static volatile SingularAttribute<EduMateria, EduMateriaPK> eduMateriaPK;
    public static volatile SingularAttribute<EduMateria, BigDecimal> ponderacion;
    public static volatile ListAttribute<EduMateria, EduNrc> eduNrcList;
    public static volatile SingularAttribute<EduMateria, EduDepartamento> eduDepartamento;
    public static volatile ListAttribute<EduMateria, EduMallaCarrera> eduMallaCarreraList;
    public static volatile ListAttribute<EduMateria, EduPrerequisito> eduPrerequisitoList1;
    public static volatile ListAttribute<EduMateria, EduPrerequisito> eduPrerequisitoList;
    public static volatile SingularAttribute<EduMateria, BigDecimal> creditos;
    public static volatile SingularAttribute<EduMateria, String> nombre;

}