package com.backend.entidades;

import com.backend.entidades.Tarjetadevolucion;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-03T23:11:52")
@StaticMetamodel(Tarjetadevoluciondet.class)
public class Tarjetadevoluciondet_ { 

    public static volatile SingularAttribute<Tarjetadevoluciondet, BigDecimal> idtarjetadevdet;
    public static volatile SingularAttribute<Tarjetadevoluciondet, BigDecimal> monto;
    public static volatile SingularAttribute<Tarjetadevoluciondet, Date> fechacreacion;
    public static volatile SingularAttribute<Tarjetadevoluciondet, String> usuario;
    public static volatile SingularAttribute<Tarjetadevoluciondet, BigDecimal> saldo;
    public static volatile SingularAttribute<Tarjetadevoluciondet, Tarjetadevolucion> idtarjetadev;

}