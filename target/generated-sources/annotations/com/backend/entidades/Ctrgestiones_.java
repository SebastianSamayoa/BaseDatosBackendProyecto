package com.backend.entidades;

import com.backend.entidades.Ctrautorizaciones;
import com.backend.entidades.Ctrvencimientos;
import com.backend.entidades.Detallegestion;
import com.backend.entidades.Tiposgestiones;
import com.backend.entidades.Tiposmotivos;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-03T23:11:52")
@StaticMetamodel(Ctrgestiones.class)
public class Ctrgestiones_ { 

    public static volatile SingularAttribute<Ctrgestiones, Tiposgestiones> idtipogestion;
    public static volatile SingularAttribute<Ctrgestiones, BigDecimal> idgestion;
    public static volatile SingularAttribute<Ctrgestiones, BigInteger> monto;
    public static volatile ListAttribute<Ctrgestiones, Ctrautorizaciones> ctrautorizacionesList;
    public static volatile SingularAttribute<Ctrgestiones, String> estadogestion;
    public static volatile ListAttribute<Ctrgestiones, Ctrvencimientos> ctrvencimientosList;
    public static volatile SingularAttribute<Ctrgestiones, Tiposmotivos> idmotivo;
    public static volatile ListAttribute<Ctrgestiones, Detallegestion> detallegestionList;
    public static volatile SingularAttribute<Ctrgestiones, String> origen;
    public static volatile SingularAttribute<Ctrgestiones, String> usuarioregistro;
    public static volatile SingularAttribute<Ctrgestiones, Date> fecharegistro;
    public static volatile SingularAttribute<Ctrgestiones, BigInteger> idcliente;

}