package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.SegPerfilFuncionalidad;
import ec.edu.espe.arquitectura.Matriculacion.model.SegUsuarioPerfil;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(SegPerfil.class)
public class SegPerfil_ { 

    public static volatile ListAttribute<SegPerfil, SegUsuarioPerfil> segUsuarioPerfilList;
    public static volatile SingularAttribute<SegPerfil, String> estado;
    public static volatile SingularAttribute<SegPerfil, String> audUsuario;
    public static volatile SingularAttribute<SegPerfil, String> codPerfil;
    public static volatile SingularAttribute<SegPerfil, Date> audFecha;
    public static volatile ListAttribute<SegPerfil, SegPerfilFuncionalidad> segPerfilFuncionalidadList;
    public static volatile SingularAttribute<SegPerfil, String> audIp;
    public static volatile SingularAttribute<SegPerfil, String> nombre;
    public static volatile SingularAttribute<SegPerfil, Integer> version;

}