package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.PerPersona;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(PerTipoDiscapacidad.class)
public class PerTipoDiscapacidad_ { 

    public static volatile SingularAttribute<PerTipoDiscapacidad, String> audUsuario;
    public static volatile SingularAttribute<PerTipoDiscapacidad, Date> audFecha;
    public static volatile ListAttribute<PerTipoDiscapacidad, PerPersona> perPersonaList;
    public static volatile SingularAttribute<PerTipoDiscapacidad, String> audIp;
    public static volatile SingularAttribute<PerTipoDiscapacidad, String> codTipoDiscapacidad;
    public static volatile SingularAttribute<PerTipoDiscapacidad, String> nombre;
    public static volatile SingularAttribute<PerTipoDiscapacidad, Integer> version;

}