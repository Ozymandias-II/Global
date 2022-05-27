package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.SegUsuarioPerfil;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(SegUsuario.class)
public class SegUsuario_ { 

    public static volatile SingularAttribute<SegUsuario, String> clave;
    public static volatile SingularAttribute<SegUsuario, String> estado;
    public static volatile SingularAttribute<SegUsuario, String> codUsuario;
    public static volatile SingularAttribute<SegUsuario, String> audUsuario;
    public static volatile SingularAttribute<SegUsuario, String> mail;
    public static volatile SingularAttribute<SegUsuario, String> origen;
    public static volatile SingularAttribute<SegUsuario, Short> nroIntentosFallidos;
    public static volatile SingularAttribute<SegUsuario, Date> fechaUltimaSesion;
    public static volatile SingularAttribute<SegUsuario, String> nombre;
    public static volatile SingularAttribute<SegUsuario, Integer> version;
    public static volatile SingularAttribute<SegUsuario, Date> fechaCambioClave;
    public static volatile ListAttribute<SegUsuario, SegUsuarioPerfil> segUsuarioPerfilList;
    public static volatile SingularAttribute<SegUsuario, Date> audFecha;
    public static volatile SingularAttribute<SegUsuario, Date> fechaCreacion;
    public static volatile SingularAttribute<SegUsuario, String> audIp;
    public static volatile SingularAttribute<SegUsuario, String> telefono;

}