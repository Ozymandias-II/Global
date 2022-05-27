package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.OfiSede;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(OfiInstitucion.class)
public class OfiInstitucion_ { 

    public static volatile SingularAttribute<OfiInstitucion, String> ruc;
    public static volatile SingularAttribute<OfiInstitucion, String> razonSocial;
    public static volatile SingularAttribute<OfiInstitucion, String> audUsuario;
    public static volatile SingularAttribute<OfiInstitucion, Date> audFecha;
    public static volatile SingularAttribute<OfiInstitucion, Short> codInstitucion;
    public static volatile SingularAttribute<OfiInstitucion, String> dominio;
    public static volatile SingularAttribute<OfiInstitucion, String> nombreComercial;
    public static volatile SingularAttribute<OfiInstitucion, String> audIp;
    public static volatile SingularAttribute<OfiInstitucion, Integer> version;
    public static volatile ListAttribute<OfiInstitucion, OfiSede> ofiSedeList;

}