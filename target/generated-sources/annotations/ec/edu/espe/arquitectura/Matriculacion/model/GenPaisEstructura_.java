package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.GenPais;
import ec.edu.espe.arquitectura.Matriculacion.model.GenPaisEstructuraPK;
import ec.edu.espe.arquitectura.Matriculacion.model.GenUbicacionGeografica;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(GenPaisEstructura.class)
public class GenPaisEstructura_ { 

    public static volatile SingularAttribute<GenPaisEstructura, String> audUsuario;
    public static volatile SingularAttribute<GenPaisEstructura, Date> audFecha;
    public static volatile SingularAttribute<GenPaisEstructura, GenPais> genPais;
    public static volatile ListAttribute<GenPaisEstructura, GenUbicacionGeografica> genUbicacionGeograficaList;
    public static volatile SingularAttribute<GenPaisEstructura, String> audIp;
    public static volatile SingularAttribute<GenPaisEstructura, String> nombre;
    public static volatile SingularAttribute<GenPaisEstructura, Integer> version;
    public static volatile SingularAttribute<GenPaisEstructura, GenPaisEstructuraPK> genPaisEstructuraPK;

}