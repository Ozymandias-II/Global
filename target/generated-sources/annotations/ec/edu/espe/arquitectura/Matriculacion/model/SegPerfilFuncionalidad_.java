package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.SegFuncionalidad;
import ec.edu.espe.arquitectura.Matriculacion.model.SegPerfil;
import ec.edu.espe.arquitectura.Matriculacion.model.SegPerfilFuncionalidadPK;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(SegPerfilFuncionalidad.class)
public class SegPerfilFuncionalidad_ { 

    public static volatile SingularAttribute<SegPerfilFuncionalidad, SegPerfilFuncionalidadPK> segPerfilFuncionalidadPK;
    public static volatile SingularAttribute<SegPerfilFuncionalidad, String> audUsuario;
    public static volatile SingularAttribute<SegPerfilFuncionalidad, Date> audFecha;
    public static volatile SingularAttribute<SegPerfilFuncionalidad, SegFuncionalidad> segFuncionalidad;
    public static volatile SingularAttribute<SegPerfilFuncionalidad, String> audIp;
    public static volatile SingularAttribute<SegPerfilFuncionalidad, Integer> version;
    public static volatile SingularAttribute<SegPerfilFuncionalidad, SegPerfil> segPerfil;

}