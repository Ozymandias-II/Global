package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.PerDocumentoPersona;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(PerTipoDocumento.class)
public class PerTipoDocumento_ { 

    public static volatile ListAttribute<PerTipoDocumento, PerDocumentoPersona> perDocumentoPersonaList;
    public static volatile SingularAttribute<PerTipoDocumento, String> audUsuario;
    public static volatile SingularAttribute<PerTipoDocumento, Date> audFecha;
    public static volatile SingularAttribute<PerTipoDocumento, String> codTipoDocumento;
    public static volatile SingularAttribute<PerTipoDocumento, String> audIp;
    public static volatile SingularAttribute<PerTipoDocumento, String> nombre;
    public static volatile SingularAttribute<PerTipoDocumento, Integer> version;

}