package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.EduInstitucionEducativa;
import ec.edu.espe.arquitectura.Matriculacion.model.GenInstitucion;
import ec.edu.espe.arquitectura.Matriculacion.model.GenPais;
import ec.edu.espe.arquitectura.Matriculacion.model.GenPaisEstructura;
import ec.edu.espe.arquitectura.Matriculacion.model.GenUbicacionGeografica;
import ec.edu.espe.arquitectura.Matriculacion.model.PerPersona;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(GenUbicacionGeografica.class)
public class GenUbicacionGeografica_ { 

    public static volatile ListAttribute<GenUbicacionGeografica, GenInstitucion> genInstitucionList;
    public static volatile SingularAttribute<GenUbicacionGeografica, String> audUsuario;
    public static volatile SingularAttribute<GenUbicacionGeografica, String> codigoPostal;
    public static volatile ListAttribute<GenUbicacionGeografica, PerPersona> perPersonaList;
    public static volatile SingularAttribute<GenUbicacionGeografica, String> codUbicacionGeografica;
    public static volatile SingularAttribute<GenUbicacionGeografica, String> codigoAreaTelefono;
    public static volatile SingularAttribute<GenUbicacionGeografica, GenPais> codPais;
    public static volatile SingularAttribute<GenUbicacionGeografica, String> nombre;
    public static volatile SingularAttribute<GenUbicacionGeografica, Integer> version;
    public static volatile SingularAttribute<GenUbicacionGeografica, Date> audFecha;
    public static volatile ListAttribute<GenUbicacionGeografica, EduInstitucionEducativa> eduInstitucionEducativaList;
    public static volatile ListAttribute<GenUbicacionGeografica, GenUbicacionGeografica> genUbicacionGeograficaList;
    public static volatile SingularAttribute<GenUbicacionGeografica, GenPaisEstructura> genPaisEstructura;
    public static volatile SingularAttribute<GenUbicacionGeografica, String> audIp;
    public static volatile SingularAttribute<GenUbicacionGeografica, String> codigoAlterno;
    public static volatile SingularAttribute<GenUbicacionGeografica, Integer> codUbicacionGeoInt;
    public static volatile SingularAttribute<GenUbicacionGeografica, GenUbicacionGeografica> codUbicacionGeoPadre;

}