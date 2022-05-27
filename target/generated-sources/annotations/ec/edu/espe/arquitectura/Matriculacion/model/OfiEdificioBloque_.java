package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.OfiAula;
import ec.edu.espe.arquitectura.Matriculacion.model.OfiEdificio;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(OfiEdificioBloque.class)
public class OfiEdificioBloque_ { 

    public static volatile SingularAttribute<OfiEdificioBloque, String> descripcion;
    public static volatile SingularAttribute<OfiEdificioBloque, String> codEdificioBloque;
    public static volatile SingularAttribute<OfiEdificioBloque, String> nombreBloque;
    public static volatile SingularAttribute<OfiEdificioBloque, String> audUsuario;
    public static volatile ListAttribute<OfiEdificioBloque, OfiAula> ofiAulaList;
    public static volatile SingularAttribute<OfiEdificioBloque, Date> audFecha;
    public static volatile SingularAttribute<OfiEdificioBloque, OfiEdificio> codEdificio;
    public static volatile SingularAttribute<OfiEdificioBloque, String> audIp;
    public static volatile SingularAttribute<OfiEdificioBloque, Integer> version;

}