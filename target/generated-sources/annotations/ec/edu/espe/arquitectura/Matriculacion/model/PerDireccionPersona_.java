package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.PerDireccionPersonaPK;
import ec.edu.espe.arquitectura.Matriculacion.model.PerPersona;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:11", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(PerDireccionPersona.class)
public class PerDireccionPersona_ { 

    public static volatile SingularAttribute<PerDireccionPersona, PerPersona> perPersona;
    public static volatile SingularAttribute<PerDireccionPersona, String> barrio;
    public static volatile SingularAttribute<PerDireccionPersona, String> audUsuario;
    public static volatile SingularAttribute<PerDireccionPersona, String> direccionAdicional;
    public static volatile SingularAttribute<PerDireccionPersona, String> callePrincipal;
    public static volatile SingularAttribute<PerDireccionPersona, String> numeracion;
    public static volatile SingularAttribute<PerDireccionPersona, Integer> version;
    public static volatile SingularAttribute<PerDireccionPersona, String> principal;
    public static volatile SingularAttribute<PerDireccionPersona, Integer> codOrgGeoDireccion;
    public static volatile SingularAttribute<PerDireccionPersona, Date> audFecha;
    public static volatile SingularAttribute<PerDireccionPersona, String> audIp;
    public static volatile SingularAttribute<PerDireccionPersona, PerDireccionPersonaPK> perDireccionPersonaPK;
    public static volatile SingularAttribute<PerDireccionPersona, String> telefono;
    public static volatile SingularAttribute<PerDireccionPersona, String> calleSecundaria;
    public static volatile SingularAttribute<PerDireccionPersona, String> codTipoDireccion;
    public static volatile SingularAttribute<PerDireccionPersona, String> referencia;

}