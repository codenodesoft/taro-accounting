package org.soptorshi.domain;

import java.time.Instant;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.SupplyOrderStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SupplyOrder.class)
public abstract class SupplyOrder_ {

	public static volatile SingularAttribute<SupplyOrder, LocalDate> dateOfOrder;
	public static volatile SingularAttribute<SupplyOrder, String> orderNo;
	public static volatile SingularAttribute<SupplyOrder, String> updatedBy;
	public static volatile SingularAttribute<SupplyOrder, SupplyAreaManager> supplyAreaManager;
	public static volatile SingularAttribute<SupplyOrder, SupplyArea> supplyArea;
	public static volatile SingularAttribute<SupplyOrder, String> areaWiseAccumulationRefNo;
	public static volatile SingularAttribute<SupplyOrder, Instant> updatedOn;
	public static volatile SingularAttribute<SupplyOrder, Instant> createdOn;
	public static volatile SingularAttribute<SupplyOrder, SupplyZoneManager> supplyZoneManager;
	public static volatile SingularAttribute<SupplyOrder, SupplySalesRepresentative> supplySalesRepresentative;
	public static volatile SingularAttribute<SupplyOrder, String> createdBy;
	public static volatile SingularAttribute<SupplyOrder, SupplyShop> supplyShop;
	public static volatile SingularAttribute<SupplyOrder, SupplyZone> supplyZone;
	public static volatile SingularAttribute<SupplyOrder, Long> id;
	public static volatile SingularAttribute<SupplyOrder, LocalDate> deliveryDate;
	public static volatile SingularAttribute<SupplyOrder, String> remarks;
	public static volatile SingularAttribute<SupplyOrder, SupplyOrderStatus> status;

}

