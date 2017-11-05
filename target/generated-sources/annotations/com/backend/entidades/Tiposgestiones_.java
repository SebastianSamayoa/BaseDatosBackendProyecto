package com.backend.entidades;

import com.backend.entidades.Ctrgestiones;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-03T23:11:52")
@StaticMetamodel(Tiposgestiones.class)
public class Tiposgestiones_ { 

    public static volatile SingularAttribute<Tiposgestiones, BigDecimal> idtipogestion;
    public static volatile SingularAttribute<Tiposgestiones, String> descripciongestion;
    public static volatile ListAttribute<Tiposgestiones, Ctrgestiones> ctrgestionesList;

}