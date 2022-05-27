package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.EduNrcHorario;
import ec.edu.espe.arquitectura.Matriculacion.model.OfiEdificio;
import ec.edu.espe.arquitectura.Matriculacion.model.OfiEdificioBloque;
import ec.edu.espe.arquitectura.Matriculacion.model.OfiTipoAula;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(OfiAula.class)
public class OfiAula_ { 

    public static volatile SingularAttribute<OfiAula, Short> piso;
    public static volatile SingularAttribute<OfiAula, Integer> codAula;
    public static volatile SingularAttribute<OfiAula, OfiEdificioBloque> codEdificioBloque;
    public static volatile SingularAttribute<OfiAula, String> audUsuario;
    public static volatile SingularAttribute<OfiAula, String> codAlterno;
    public static volatile SingularAttribute<OfiAula, Date> audFecha;
    public static volatile SingularAttribute<OfiAula, OfiEdificio> codEdificio;
    public static volatile ListAttribute<OfiAula, EduNrcHorario> eduNrcHorarioList;
    public static volatile SingularAttribute<OfiAula, String> audIp;
    public static volatile SingularAttribute<OfiAula, OfiTipoAula> codTipoAula;
    public static volatile SingularAttribute<OfiAula, Integer> version;
    public static volatile SingularAttribute<OfiAula, Short> capacidad;

}