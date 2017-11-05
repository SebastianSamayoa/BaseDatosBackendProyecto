package com.backend.entidades;

import com.backend.entidades.Ctrvencimientos;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-03T23:11:52")
@StaticMetamodel(Detallevencimientos.class)
public class Detallevencimientos_ { 

    public static volatile SingularAttribute<Detallevencimientos, String> estadoEjecucion;
    public static volatile SingularAttribute<Detallevencimientos, Ctrvencimientos> idctrvencimiento;
    public static volatile SingularAttribute<Detallevencimientos, Date> inicioEjecucion;
    public static volatile SingularAttribute<Detallevencimientos, Date> finEjecucion;
    public static volatile SingularAttribute<Detallevencimientos, BigDecimal> iddetalle;

}