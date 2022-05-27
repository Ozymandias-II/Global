package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.GenUbicacionGeografica;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(GenInstitucion.class)
public class GenInstitucion_ { 

    public static volatile SingularAttribute<GenInstitucion, String> ruc;
    public static volatile SingularAttribute<GenInstitucion, String> razonSocial;
    public static volatile SingularAttribute<GenInstitucion, String> urlSistema;
    public static volatile SingularAttribute<GenInstitucion, String> dominio;
    public static volatile SingularAttribute<GenInstitucion, String> direccion;
    public static volatile SingularAttribute<GenInstitucion, String> nombreComercial;
    public static volatile SingularAttribute<GenInstitucion, String> urlInfo;
    public static volatile SingularAttribute<GenInstitucion, GenUbicacionGeografica> codUbicacionGeoInt;
    public static volatile SingularAttribute<GenInstitucion, Integer> version;

}