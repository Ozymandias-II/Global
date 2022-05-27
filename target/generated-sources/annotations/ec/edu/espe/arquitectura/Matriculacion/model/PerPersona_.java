package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.EduMatricula;
import ec.edu.espe.arquitectura.Matriculacion.model.EduNrc;
import ec.edu.espe.arquitectura.Matriculacion.model.GenPais;
import ec.edu.espe.arquitectura.Matriculacion.model.GenUbicacionGeografica;
import ec.edu.espe.arquitectura.Matriculacion.model.PerDireccionPersona;
import ec.edu.espe.arquitectura.Matriculacion.model.PerDocumentoPersona;
import ec.edu.espe.arquitectura.Matriculacion.model.PerFamiliarPersona;
import ec.edu.espe.arquitectura.Matriculacion.model.PerHistTipoPersona;
import ec.edu.espe.arquitectura.Matriculacion.model.PerTipoDiscapacidad;
import ec.edu.espe.arquitectura.Matriculacion.model.PerTipoPersona;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(PerPersona.class)
public class PerPersona_ { 

    public static volatile SingularAttribute<PerPersona, String> estado;
    public static volatile SingularAttribute<PerPersona, String> audUsuario;
    public static volatile SingularAttribute<PerPersona, Integer> codPersona;
    public static volatile SingularAttribute<PerPersona, String> tipoIdentificacion;
    public static volatile SingularAttribute<PerPersona, Date> fechaNacimiento;
    public static volatile SingularAttribute<PerPersona, Short> porcentajeDiscapacidad;
    public static volatile SingularAttribute<PerPersona, PerTipoDiscapacidad> codTipoDiscapacidad;
    public static volatile SingularAttribute<PerPersona, String> nombre2;
    public static volatile SingularAttribute<PerPersona, String> nombreCompleto;
    public static volatile SingularAttribute<PerPersona, String> nombre1;
    public static volatile ListAttribute<PerPersona, PerHistTipoPersona> perHistTipoPersonaList;
    public static volatile SingularAttribute<PerPersona, GenPais> nacionalidad;
    public static volatile SingularAttribute<PerPersona, Date> audFecha;
    public static volatile SingularAttribute<PerPersona, String> carnetConadis;
    public static volatile SingularAttribute<PerPersona, String> genero;
    public static volatile SingularAttribute<PerPersona, GenPais> codPaisNacimiento;
    public static volatile ListAttribute<PerPersona, PerFamiliarPersona> perFamiliarPersonaList;
    public static volatile SingularAttribute<PerPersona, String> requiereRepresentante;
    public static volatile SingularAttribute<PerPersona, String> codigoAlterno;
    public static volatile SingularAttribute<PerPersona, String> email;
    public static volatile SingularAttribute<PerPersona, String> apellido2;
    public static volatile ListAttribute<PerPersona, PerDocumentoPersona> perDocumentoPersonaList;
    public static volatile ListAttribute<PerPersona, EduNrc> eduNrcList;
    public static volatile SingularAttribute<PerPersona, String> apellido1;
    public static volatile SingularAttribute<PerPersona, String> nombreComun;
    public static volatile SingularAttribute<PerPersona, String> identificacion;
    public static volatile SingularAttribute<PerPersona, String> estadoCivil;
    public static volatile SingularAttribute<PerPersona, Integer> version;
    public static volatile SingularAttribute<PerPersona, String> extranjero;
    public static volatile ListAttribute<PerPersona, EduMatricula> eduMatriculaList;
    public static volatile ListAttribute<PerPersona, PerDireccionPersona> perDireccionPersonaList;
    public static volatile SingularAttribute<PerPersona, String> emailAlterno;
    public static volatile SingularAttribute<PerPersona, String> discapacidad;
    public static volatile SingularAttribute<PerPersona, String> telefonoMovil;
    public static volatile SingularAttribute<PerPersona, String> audIp;
    public static volatile SingularAttribute<PerPersona, GenUbicacionGeografica> lugarNacimiento;
    public static volatile SingularAttribute<PerPersona, PerTipoPersona> codTipoPersona;

}