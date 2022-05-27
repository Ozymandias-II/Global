package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.EduCarrera;
import ec.edu.espe.arquitectura.Matriculacion.model.EduMateria;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(EduDepartamento.class)
public class EduDepartamento_ { 

    public static volatile SingularAttribute<EduDepartamento, String> descripcion;
    public static volatile SingularAttribute<EduDepartamento, Integer> codDepartamento;
    public static volatile SingularAttribute<EduDepartamento, String> siglas;
    public static volatile ListAttribute<EduDepartamento, EduCarrera> eduCarreraList;
    public static volatile ListAttribute<EduDepartamento, EduMateria> eduMateriaList;
    public static volatile SingularAttribute<EduDepartamento, String> nombre;

}