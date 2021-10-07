package org.soptorshi.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SupplyArea.class)
public abstract class SupplyArea_ {

	public static volatile SingularAttribute<SupplyArea, String> code;
	public static volatile SingularAttribute<SupplyArea, String> updatedBy;
	public static volatile SingularAttribute<SupplyArea, String> createdBy;
	public static volatile SingularAttribute<SupplyArea, String> name;
	public static volatile SingularAttribute<SupplyArea, SupplyZone> supplyZone;
	public static volatile SingularAttribute<SupplyArea, Long> id;
	public static volatile SingularAttribute<SupplyArea, Instant> updatedOn;
	public static volatile SingularAttribute<SupplyArea, Instant> createdOn;
	public static volatile SingularAttribute<SupplyArea, SupplyZoneManager> supplyZoneManager;

}

