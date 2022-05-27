package ec.edu.espe.arquitectura.Matriculacion.model;

import ec.edu.espe.arquitectura.Matriculacion.model.EduDepartamento;
import ec.edu.espe.arquitectura.Matriculacion.model.EduMallaCarrera;
import ec.edu.espe.arquitectura.Matriculacion.model.EduMatricula;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T11:40:10", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(EduCarrera.class)
public class EduCarrera_ { 

    public static volatile SingularAttribute<EduCarrera, String> grado;
    public static volatile SingularAttribute<EduCarrera, EduDepartamento> codDepartamento;
    public static volatile SingularAttribute<EduCarrera, String> nombre;
    public static volatile SingularAttribute<EduCarrera, Integer> totalSemestres;
    public static volatile ListAttribute<EduCarrera, EduMatricula> eduMatriculaList;
    public static volatile SingularAttribute<EduCarrera, Integer> codCarrera;
    public static volatile SingularAttribute<EduCarrera, String> modalidad;
    public static volatile ListAttribute<EduCarrera, EduMallaCarrera> eduMallaCarreraList;
    public static volatile SingularAttribute<EduCarrera, BigDecimal> totalHoras;
    public static volatile SingularAttribute<EduCarrera, String> siglas;
    public static volatile SingularAttribute<EduCarrera, BigDecimal> totalCreditos;
    public static volatile SingularAttribute<EduCarrera, BigDecimal> precioCredito;
    public static volatile SingularAttribute<EduCarrera, String> nivel;
    public static volatile SingularAttribute<EduCarrera, String> perfilProfesional;

}