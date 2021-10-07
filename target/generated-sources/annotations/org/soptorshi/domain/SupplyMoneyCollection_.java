package org.soptorshi.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SupplyMoneyCollection.class)
public abstract class SupplyMoneyCollection_ {

	public static volatile SingularAttribute<SupplyMoneyCollection, String> updatedBy;
	public static volatile SingularAttribute<SupplyMoneyCollection, SupplyAreaManager> supplyAreaManager;
	public static volatile SingularAttribute<SupplyMoneyCollection, SupplyArea> supplyArea;
	public static volatile SingularAttribute<SupplyMoneyCollection, Double> receivedAmount;
	public static volatile SingularAttribute<SupplyMoneyCollection, Instant> updatedOn;
	public static volatile SingularAttribute<SupplyMoneyCollection, Instant> createdOn;
	public static volatile SingularAttribute<SupplyMoneyCollection, SupplyZoneManager> supplyZoneManager;
	public static volatile SingularAttribute<SupplyMoneyCollection, SupplySalesRepresentative> supplySalesRepresentative;
	public static volatile SingularAttribute<SupplyMoneyCollection, Double> totalAmount;
	public static volatile SingularAttribute<SupplyMoneyCollection, SupplyOrder> supplyOrder;
	public static volatile SingularAttribute<SupplyMoneyCollection, String> createdBy;
	public static volatile SingularAttribute<SupplyMoneyCollection, SupplyShop> supplyShop;
	public static volatile SingularAttribute<SupplyMoneyCollection, SupplyZone> supplyZone;
	public static volatile SingularAttribute<SupplyMoneyCollection, Long> id;
	public static volatile SingularAttribute<SupplyMoneyCollection, String> remarks;

}

