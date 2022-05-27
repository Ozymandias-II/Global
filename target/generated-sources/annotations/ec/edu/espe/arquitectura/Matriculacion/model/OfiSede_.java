package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.OfiEdificio;
import ec.edu.espe.arquitectura.Matriculacion.model.OfiInstitucion;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(OfiSede.class)
public class OfiSede_ { 

    public static volatile SingularAttribute<OfiSede, String> codSede;
    public static volatile SingularAttribute<OfiSede, String> audUsuario;
    public static volatile SingularAttribute<OfiSede, Date> audFecha;
    public static volatile SingularAttribute<OfiSede, OfiInstitucion> codInstitucion;
    public static volatile ListAttribute<OfiSede, OfiEdificio> ofiEdificioList;
    public static volatile SingularAttribute<OfiSede, String> direccion;
    public static volatile SingularAttribute<OfiSede, String> esPrincipal;
    public static volatile SingularAttribute<OfiSede, String> audIp;
    public static volatile SingularAttribute<OfiSede, String> nombre;
    public static volatile SingularAttribute<OfiSede, Integer> version;

}