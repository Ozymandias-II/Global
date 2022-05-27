package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.EduCalificacion;
import ec.edu.espe.arquitectura.Matriculacion.model.EduMatricula;
import ec.edu.espe.arquitectura.Matriculacion.model.EduMatriculaNrcPK;
import ec.edu.espe.arquitectura.Matriculacion.model.EduNrc;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(EduMatriculaNrc.class)
public class EduMatriculaNrc_ { 

    public static volatile SingularAttribute<EduMatriculaNrc, String> estado;
    public static volatile SingularAttribute<EduMatriculaNrc, Short> numero;
    public static volatile SingularAttribute<EduMatriculaNrc, BigDecimal> costo;
    public static volatile SingularAttribute<EduMatriculaNrc, EduNrc> eduNrc;
    public static volatile ListAttribute<EduMatriculaNrc, EduCalificacion> eduCalificacionList;
    public static volatile SingularAttribute<EduMatriculaNrc, EduMatriculaNrcPK> eduMatriculaNrcPK;
    public static volatile SingularAttribute<EduMatriculaNrc, EduMatricula> eduMatricula;

}