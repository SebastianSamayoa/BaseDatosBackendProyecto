package com.backend.entidades;

import com.backend.entidades.Ctrautorizaciones;
import com.backend.entidades.Tarjetadevoluciondet;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-03T23:11:52")
@StaticMetamodel(Tarjetadevolucion.class)
public class Tarjetadevolucion_ { 

    public static volatile SingularAttribute<Tarjetadevolucion, String> estado;
    public static volatile SingularAttribute<Tarjetadevolucion, Ctrautorizaciones> idctrautorizacion;
    public static volatile SingularAttribute<Tarjetadevolucion, BigDecimal> monto;
    public static volatile SingularAttribute<Tarjetadevolucion, Date> fechacreacion;
    public static volatile SingularAttribute<Tarjetadevolucion, BigDecimal> saldodisp;
    public static volatile ListAttribute<Tarjetadevolucion, Tarjetadevoluciondet> tarjetadevoluciondetList;
    public static volatile SingularAttribute<Tarjetadevolucion, BigDecimal> idtarjetadev;

}