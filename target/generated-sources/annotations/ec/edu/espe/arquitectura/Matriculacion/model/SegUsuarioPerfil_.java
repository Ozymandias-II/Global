package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.SegPerfil;
import ec.edu.espe.arquitectura.Matriculacion.model.SegUsuario;
import ec.edu.espe.arquitectura.Matriculacion.model.SegUsuarioPerfilPK;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(SegUsuarioPerfil.class)
public class SegUsuarioPerfil_ { 

    public static volatile SingularAttribute<SegUsuarioPerfil, String> audUsuario;
    public static volatile SingularAttribute<SegUsuarioPerfil, Date> audFecha;
    public static volatile SingularAttribute<SegUsuarioPerfil, SegUsuarioPerfilPK> segUsuarioPerfilPK;
    public static volatile SingularAttribute<SegUsuarioPerfil, String> audIp;
    public static volatile SingularAttribute<SegUsuarioPerfil, Integer> version;
    public static volatile SingularAttribute<SegUsuarioPerfil, SegUsuario> segUsuario;
    public static volatile SingularAttribute<SegUsuarioPerfil, SegPerfil> segPerfil;

}