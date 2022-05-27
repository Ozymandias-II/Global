package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.PerHistTipoPersonaPK;
import ec.edu.espe.arquitectura.Matriculacion.model.PerPersona;
import ec.edu.espe.arquitectura.Matriculacion.model.PerTipoPersona;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(PerHistTipoPersona.class)
public class PerHistTipoPersona_ { 

    public static volatile SingularAttribute<PerHistTipoPersona, PerPersona> perPersona;
    public static volatile SingularAttribute<PerHistTipoPersona, PerHistTipoPersonaPK> perHistTipoPersonaPK;
    public static volatile SingularAttribute<PerHistTipoPersona, PerTipoPersona> perTipoPersona;
    public static volatile SingularAttribute<PerHistTipoPersona, String> audUsuario;
    public static volatile SingularAttribute<PerHistTipoPersona, Date> audFecha;
    public static volatile SingularAttribute<PerHistTipoPersona, Date> fechaInicio;
    public static volatile SingularAttribute<PerHistTipoPersona, String> codUsuarioFin;
    public static volatile SingularAttribute<PerHistTipoPersona, String> audIp;
    public static volatile SingularAttribute<PerHistTipoPersona, String> codUsuarioIni;
    public static volatile SingularAttribute<PerHistTipoPersona, Date> fechaFin;
    public static volatile SingularAttribute<PerHistTipoPersona, Integer> version;

}