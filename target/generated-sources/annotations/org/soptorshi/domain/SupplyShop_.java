package org.soptorshi.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SupplyShop.class)
public abstract class SupplyShop_ {

	public static volatile SingularAttribute<SupplyShop, String> additionalInformation;
	public static volatile SingularAttribute<SupplyShop, String> address;
	public static volatile SingularAttribute<SupplyShop, String> updatedBy;
	public static volatile SingularAttribute<SupplyShop, SupplyAreaManager> supplyAreaManager;
	public static volatile SingularAttribute<SupplyShop, SupplyArea> supplyArea;
	public static volatile SingularAttribute<SupplyShop, Instant> updatedOn;
	public static volatile SingularAttribute<SupplyShop, Instant> createdOn;
	public static volatile SingularAttribute<SupplyShop, SupplyZoneManager> supplyZoneManager;
	public static volatile SingularAttribute<SupplyShop, SupplySalesRepresentative> supplySalesRepresentative;
	public static volatile SingularAttribute<SupplyShop, String> createdBy;
	public static volatile SingularAttribute<SupplyShop, String> contact;
	public static volatile SingularAttribute<SupplyShop, String> name;
	public static volatile SingularAttribute<SupplyShop, SupplyZone> supplyZone;
	public static volatile SingularAttribute<SupplyShop, Long> id;
	public static volatile SingularAttribute<SupplyShop, String> email;

}

