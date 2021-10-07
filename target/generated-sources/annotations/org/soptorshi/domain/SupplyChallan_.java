package org.soptorshi.domain;

import java.time.Instant;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SupplyChallan.class)
public abstract class SupplyChallan_ {

	public static volatile SingularAttribute<SupplyChallan, String> updatedBy;
	public static volatile SingularAttribute<SupplyChallan, SupplyAreaManager> supplyAreaManager;
	public static volatile SingularAttribute<SupplyChallan, SupplyArea> supplyArea;
	public static volatile SingularAttribute<SupplyChallan, Instant> updatedOn;
	public static volatile SingularAttribute<SupplyChallan, Instant> createdOn;
	public static volatile SingularAttribute<SupplyChallan, SupplyZoneManager> supplyZoneManager;
	public static volatile SingularAttribute<SupplyChallan, SupplySalesRepresentative> supplySalesRepresentative;
	public static volatile SingularAttribute<SupplyChallan, String> challanNo;
	public static volatile SingularAttribute<SupplyChallan, SupplyOrder> supplyOrder;
	public static volatile SingularAttribute<SupplyChallan, String> createdBy;
	public static volatile SingularAttribute<SupplyChallan, LocalDate> dateOfChallan;
	public static volatile SingularAttribute<SupplyChallan, SupplyShop> supplyShop;
	public static volatile SingularAttribute<SupplyChallan, SupplyZone> supplyZone;
	public static volatile SingularAttribute<SupplyChallan, Long> id;
	public static volatile SingularAttribute<SupplyChallan, String> remarks;

}

