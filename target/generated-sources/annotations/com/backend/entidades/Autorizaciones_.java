package com.backend.entidades;

import com.backend.entidades.Ctrautorizaciones;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-03T23:11:52")
@StaticMetamodel(Autorizaciones.class)
public class Autorizaciones_ { 

    public static volatile SingularAttribute<Autorizaciones, String> estado;
    public static volatile ListAttribute<Autorizaciones, Ctrautorizaciones> ctrautorizacionesList;
    public static volatile SingularAttribute<Autorizaciones, BigDecimal> idautorizacion;
    public static volatile SingularAttribute<Autorizaciones, BigInteger> montomaximo;
    public static volatile SingularAttribute<Autorizaciones, BigInteger> idusuario;

}