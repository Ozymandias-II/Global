package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.SegModulo;
import ec.edu.espe.arquitectura.Matriculacion.model.SegPerfilFuncionalidad;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:11", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(SegFuncionalidad.class)
public class SegFuncionalidad_ { 

    public static volatile SingularAttribute<SegFuncionalidad, String> descripcion;
    public static volatile SingularAttribute<SegFuncionalidad, String> estado;
    public static volatile SingularAttribute<SegFuncionalidad, String> audUsuario;
    public static volatile SingularAttribute<SegFuncionalidad, Date> audFecha;
    public static volatile SingularAttribute<SegFuncionalidad, SegModulo> codModulo;
    public static volatile ListAttribute<SegFuncionalidad, SegPerfilFuncionalidad> segPerfilFuncionalidadList;
    public static volatile SingularAttribute<SegFuncionalidad, String> audIp;
    public static volatile SingularAttribute<SegFuncionalidad, String> urlPrincipal;
    public static volatile SingularAttribute<SegFuncionalidad, Integer> codFuncionalidad;
    public static volatile SingularAttribute<SegFuncionalidad, String> nombre;
    public static volatile SingularAttribute<SegFuncionalidad, Integer> version;

}