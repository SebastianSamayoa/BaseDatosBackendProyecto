package com.backend.entidades;

import com.backend.entidades.Ctrvencimientos;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-03T23:11:52")
@StaticMetamodel(Notificadores.class)
public class Notificadores_ { 

    public static volatile SingularAttribute<Notificadores, String> estado;
    public static volatile ListAttribute<Notificadores, Ctrvencimientos> ctrvencimientosList;
    public static volatile SingularAttribute<Notificadores, String> correo;
    public static volatile SingularAttribute<Notificadores, BigDecimal> idNotificador;

}