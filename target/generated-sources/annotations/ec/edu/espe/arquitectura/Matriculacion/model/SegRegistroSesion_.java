package ec.edu.espe.arquitectura.Matriculacion.model;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(SegRegistroSesion.class)
public class SegRegistroSesion_ { 

    public static volatile SingularAttribute<SegRegistroSesion, String> codUsuario;
    public static volatile SingularAttribute<SegRegistroSesion, String> ipConexion;
    public static volatile SingularAttribute<SegRegistroSesion, String> resultado;
    public static volatile SingularAttribute<SegRegistroSesion, Integer> secuencia;
    public static volatile SingularAttribute<SegRegistroSesion, String> error;
    public static volatile SingularAttribute<SegRegistroSesion, Date> fechaConexion;

}