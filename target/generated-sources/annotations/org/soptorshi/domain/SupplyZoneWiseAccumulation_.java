package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.SupplyZoneWiseAccumulationStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SupplyZoneWiseAccumulation.class)
public abstract class SupplyZoneWiseAccumulation_ {

	public static volatile SingularAttribute<SupplyZoneWiseAccumulation, String> zoneWiseAccumulationRefNo;
	public static volatile SingularAttribute<SupplyZoneWiseAccumulation, Product> product;
	public static volatile SingularAttribute<SupplyZoneWiseAccumulation, BigDecimal> quantity;
	public static volatile SingularAttribute<SupplyZoneWiseAccumulation, String> updatedBy;
	public static volatile SingularAttribute<SupplyZoneWiseAccumulation, Instant> updatedOn;
	public static volatile SingularAttribute<SupplyZoneWiseAccumulation, Instant> createdOn;
	public static volatile SingularAttribute<SupplyZoneWiseAccumulation, SupplyZoneManager> supplyZoneManager;
	public static volatile SingularAttribute<SupplyZoneWiseAccumulation, ProductCategory> productCategory;
	public static volatile SingularAttribute<SupplyZoneWiseAccumulation, String> createdBy;
	public static volatile SingularAttribute<SupplyZoneWiseAccumulation, BigDecimal> price;
	public static volatile SingularAttribute<SupplyZoneWiseAccumulation, SupplyZone> supplyZone;
	public static volatile SingularAttribute<SupplyZoneWiseAccumulation, Long> id;
	public static volatile SingularAttribute<SupplyZoneWiseAccumulation, String> remarks;
	public static volatile SingularAttribute<SupplyZoneWiseAccumulation, SupplyZoneWiseAccumulationStatus> status;

}

