package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.PerHistTipoPersona;
import ec.edu.espe.arquitectura.Matriculacion.model.PerPersona;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:11", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(PerTipoPersona.class)
public class PerTipoPersona_ { 

    public static volatile SingularAttribute<PerTipoPersona, String> descripcion;
    public static volatile SingularAttribute<PerTipoPersona, String> estado;
    public static volatile SingularAttribute<PerTipoPersona, String> audUsuario;
    public static volatile SingularAttribute<PerTipoPersona, Date> audFecha;
    public static volatile ListAttribute<PerTipoPersona, PerPersona> perPersonaList;
    public static volatile SingularAttribute<PerTipoPersona, String> audIp;
    public static volatile SingularAttribute<PerTipoPersona, String> nombre;
    public static volatile SingularAttribute<PerTipoPersona, Integer> version;
    public static volatile ListAttribute<PerTipoPersona, PerHistTipoPersona> perHistTipoPersonaList;
    public static volatile SingularAttribute<PerTipoPersona, String> codTipoPersona;

}