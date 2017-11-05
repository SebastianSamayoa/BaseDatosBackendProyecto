package com.backend.entidades;

import com.backend.entidades.Ctrgestiones;
import com.backend.entidades.DetallegestionPK;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-03T23:11:52")
@StaticMetamodel(Detallegestion.class)
public class Detallegestion_ { 

    public static volatile SingularAttribute<Detallegestion, BigInteger> numerofactura;
    public static volatile SingularAttribute<Detallegestion, BigDecimal> monto;
    public static volatile SingularAttribute<Detallegestion, Ctrgestiones> ctrgestiones;
    public static volatile SingularAttribute<Detallegestion, String> tipofactura;
    public static volatile SingularAttribute<Detallegestion, DetallegestionPK> detallegestionPK;

}