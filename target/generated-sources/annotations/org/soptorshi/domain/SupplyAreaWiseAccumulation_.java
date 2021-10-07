package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.SupplyAreaWiseAccumulationStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SupplyAreaWiseAccumulation.class)
public abstract class SupplyAreaWiseAccumulation_ {

	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, String> zoneWiseAccumulationRefNo;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, Product> product;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, BigDecimal> quantity;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, String> updatedBy;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, SupplyAreaManager> supplyAreaManager;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, SupplyArea> supplyArea;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, String> areaWiseAccumulationRefNo;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, Instant> updatedOn;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, Instant> createdOn;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, SupplyZoneManager> supplyZoneManager;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, ProductCategory> productCategory;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, String> createdBy;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, BigDecimal> price;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, SupplyZone> supplyZone;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, Long> id;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, String> remarks;
	public static volatile SingularAttribute<SupplyAreaWiseAccumulation, SupplyAreaWiseAccumulationStatus> status;

}

