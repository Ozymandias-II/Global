package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.PerFamiliarPersonaPK;
import ec.edu.espe.arquitectura.Matriculacion.model.PerPersona;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(PerFamiliarPersona.class)
public class PerFamiliarPersona_ { 

    public static volatile SingularAttribute<PerFamiliarPersona, PerFamiliarPersonaPK> perFamiliarPersonaPK;
    public static volatile SingularAttribute<PerFamiliarPersona, PerPersona> perPersona;
    public static volatile SingularAttribute<PerFamiliarPersona, String> audUsuario;
    public static volatile SingularAttribute<PerFamiliarPersona, Date> audFecha;
    public static volatile SingularAttribute<PerFamiliarPersona, String> tipoIdentificacion;
    public static volatile SingularAttribute<PerFamiliarPersona, Date> fechaNacimiento;
    public static volatile SingularAttribute<PerFamiliarPersona, String> identificacion;
    public static volatile SingularAttribute<PerFamiliarPersona, String> tipoFamiliar;
    public static volatile SingularAttribute<PerFamiliarPersona, String> audIp;
    public static volatile SingularAttribute<PerFamiliarPersona, String> telefono;
    public static volatile SingularAttribute<PerFamiliarPersona, String> nombre;
    public static volatile SingularAttribute<PerFamiliarPersona, Integer> version;

}