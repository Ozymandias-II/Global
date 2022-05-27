package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.PerDocumentoPersonaPK;
import ec.edu.espe.arquitectura.Matriculacion.model.PerPersona;
import ec.edu.espe.arquitectura.Matriculacion.model.PerTipoDocumento;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(PerDocumentoPersona.class)
public class PerDocumentoPersona_ { 

    public static volatile SingularAttribute<PerDocumentoPersona, PerPersona> perPersona;
    public static volatile SingularAttribute<PerDocumentoPersona, Date> fechaCaducidad;
    public static volatile SingularAttribute<PerDocumentoPersona, String> estado;
    public static volatile SingularAttribute<PerDocumentoPersona, String> digitalizado;
    public static volatile SingularAttribute<PerDocumentoPersona, String> audUsuario;
    public static volatile SingularAttribute<PerDocumentoPersona, Date> fechaRegistro;
    public static volatile SingularAttribute<PerDocumentoPersona, PerDocumentoPersonaPK> perDocumentoPersonaPK;
    public static volatile SingularAttribute<PerDocumentoPersona, Date> fechaEmision;
    public static volatile SingularAttribute<PerDocumentoPersona, Integer> version;
    public static volatile SingularAttribute<PerDocumentoPersona, String> url;
    public static volatile SingularAttribute<PerDocumentoPersona, Date> audFecha;
    public static volatile SingularAttribute<PerDocumentoPersona, PerTipoDocumento> perTipoDocumento;
    public static volatile SingularAttribute<PerDocumentoPersona, String> archivado;
    public static volatile SingularAttribute<PerDocumentoPersona, String> audIp;

}