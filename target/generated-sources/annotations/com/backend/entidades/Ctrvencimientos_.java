package com.backend.entidades;

import com.backend.entidades.Ctrgestiones;
import com.backend.entidades.Detallevencimientos;
import com.backend.entidades.Notificadores;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-03T23:11:52")
@StaticMetamodel(Ctrvencimientos.class)
public class Ctrvencimientos_ { 

    public static volatile SingularAttribute<Ctrvencimientos, BigDecimal> idctrvencimiento;
    public static volatile SingularAttribute<Ctrvencimientos, String> estado;
    public static volatile SingularAttribute<Ctrvencimientos, Ctrgestiones> idgestion;
    public static volatile SingularAttribute<Ctrvencimientos, Date> fechaVencimiento;
    public static volatile SingularAttribute<Ctrvencimientos, Notificadores> idNotificador;
    public static volatile ListAttribute<Ctrvencimientos, Detallevencimientos> detallevencimientosList;

}