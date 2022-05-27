package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.EduCarrera;
import ec.edu.espe.arquitectura.Matriculacion.model.EduMateria;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(EduMallaCarrera.class)
public class EduMallaCarrera_ { 

    public static volatile SingularAttribute<EduMallaCarrera, Integer> codMateriacarrera;
    public static volatile SingularAttribute<EduMallaCarrera, EduCarrera> codCarrera;
    public static volatile SingularAttribute<EduMallaCarrera, EduMateria> eduMateria;
    public static volatile SingularAttribute<EduMallaCarrera, Integer> nivel;

}