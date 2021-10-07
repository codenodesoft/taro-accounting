package org.soptorshi.domain;

import java.time.Instant;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.CommercialPoStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CommercialPo.class)
public abstract class CommercialPo_ {

	public static volatile SingularAttribute<CommercialPo, String> purchaseOrderNo;
	public static volatile SingularAttribute<CommercialPo, LocalDate> purchaseOrderDate;
	public static volatile SingularAttribute<CommercialPo, String> updatedBy;
	public static volatile SingularAttribute<CommercialPo, CommercialPi> commercialPi;
	public static volatile SingularAttribute<CommercialPo, String> createdBy;
	public static volatile SingularAttribute<CommercialPo, String> originOfGoods;
	public static volatile SingularAttribute<CommercialPo, String> finalDestination;
	public static volatile SingularAttribute<CommercialPo, Long> id;
	public static volatile SingularAttribute<CommercialPo, LocalDate> shipmentDate;
	public static volatile SingularAttribute<CommercialPo, CommercialPoStatus> poStatus;
	public static volatile SingularAttribute<CommercialPo, Instant> updatedOn;
	public static volatile SingularAttribute<CommercialPo, Instant> createdOn;

}

