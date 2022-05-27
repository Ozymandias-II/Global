package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.SegFuncionalidad;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(SegModulo.class)
public class SegModulo_ { 

    public static volatile SingularAttribute<SegModulo, String> estado;
    public static volatile SingularAttribute<SegModulo, String> codModulo;
    public static volatile SingularAttribute<SegModulo, String> nombre;
    public static volatile SingularAttribute<SegModulo, Integer> version;
    public static volatile ListAttribute<SegModulo, SegFuncionalidad> segFuncionalidadList;

}