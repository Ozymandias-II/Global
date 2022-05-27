package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.GenPaisEstructura;
import ec.edu.espe.arquitectura.Matriculacion.model.GenUbicacionGeografica;
import ec.edu.espe.arquitectura.Matriculacion.model.PerPersona;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(GenPais.class)
public class GenPais_ { 

    public static volatile SingularAttribute<GenPais, String> audUsuario;
    public static volatile ListAttribute<GenPais, PerPersona> perPersonaList;
    public static volatile SingularAttribute<GenPais, String> codigoTelefonico;
    public static volatile SingularAttribute<GenPais, String> codPais;
    public static volatile ListAttribute<GenPais, GenPaisEstructura> genPaisEstructuraList;
    public static volatile SingularAttribute<GenPais, String> nombre;
    public static volatile SingularAttribute<GenPais, Integer> version;
    public static volatile SingularAttribute<GenPais, String> nacionalidad;
    public static volatile SingularAttribute<GenPais, String> porOmision;
    public static volatile SingularAttribute<GenPais, Date> audFecha;
    public static volatile ListAttribute<GenPais, GenUbicacionGeografica> genUbicacionGeograficaList;
    public static volatile SingularAttribute<GenPais, String> audIp;
    public static volatile ListAttribute<GenPais, PerPersona> perPersonaList1;

}