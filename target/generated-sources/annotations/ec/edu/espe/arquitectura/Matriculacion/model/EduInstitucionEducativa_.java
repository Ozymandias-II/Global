package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.GenUbicacionGeografica;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:11", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(EduInstitucionEducativa.class)
public class EduInstitucionEducativa_ { 

    public static volatile SingularAttribute<EduInstitucionEducativa, Integer> codInstitucionEducativa;
    public static volatile SingularAttribute<EduInstitucionEducativa, String> tipo;
    public static volatile SingularAttribute<EduInstitucionEducativa, String> audUsuario;
    public static volatile SingularAttribute<EduInstitucionEducativa, Date> audFecha;
    public static volatile SingularAttribute<EduInstitucionEducativa, String> direccion;
    public static volatile SingularAttribute<EduInstitucionEducativa, String> audIp;
    public static volatile SingularAttribute<EduInstitucionEducativa, GenUbicacionGeografica> codUbicacionGeoInt;
    public static volatile SingularAttribute<EduInstitucionEducativa, String> nombre;
    public static volatile SingularAttribute<EduInstitucionEducativa, Integer> version;

}