package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.OfiAula;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(OfiTipoAula.class)
public class OfiTipoAula_ { 

    public static volatile SingularAttribute<OfiTipoAula, String> descripcion;
    public static volatile SingularAttribute<OfiTipoAula, String> audUsuario;
    public static volatile ListAttribute<OfiTipoAula, OfiAula> ofiAulaList;
    public static volatile SingularAttribute<OfiTipoAula, Date> audFecha;
    public static volatile SingularAttribute<OfiTipoAula, String> codTipoAula;
    public static volatile SingularAttribute<OfiTipoAula, String> audIp;
    public static volatile SingularAttribute<OfiTipoAula, Integer> version;

}