package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.OfiAula;
import ec.edu.espe.arquitectura.Matriculacion.model.OfiEdificioBloque;
import ec.edu.espe.arquitectura.Matriculacion.model.OfiSede;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(OfiEdificio.class)
public class OfiEdificio_ { 

    public static volatile SingularAttribute<OfiEdificio, String> descripcion;
    public static volatile SingularAttribute<OfiEdificio, String> manejaBloques;
    public static volatile SingularAttribute<OfiEdificio, String> audUsuario;
    public static volatile SingularAttribute<OfiEdificio, String> codAlterno;
    public static volatile SingularAttribute<OfiEdificio, Short> pisos;
    public static volatile SingularAttribute<OfiEdificio, String> direccion;
    public static volatile SingularAttribute<OfiEdificio, String> comentario;
    public static volatile SingularAttribute<OfiEdificio, String> nombre;
    public static volatile SingularAttribute<OfiEdificio, Integer> version;
    public static volatile SingularAttribute<OfiEdificio, OfiSede> codSede;
    public static volatile ListAttribute<OfiEdificio, OfiAula> ofiAulaList;
    public static volatile SingularAttribute<OfiEdificio, String> codEdificio;
    public static volatile SingularAttribute<OfiEdificio, Date> audFecha;
    public static volatile SingularAttribute<OfiEdificio, String> poseeAulas;
    public static volatile ListAttribute<OfiEdificio, OfiEdificioBloque> ofiEdificioBloqueList;
    public static volatile SingularAttribute<OfiEdificio, String> audIp;

}