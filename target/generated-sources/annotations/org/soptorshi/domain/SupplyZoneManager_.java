package org.soptorshi.domain;

import java.time.Instant;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.SupplyZoneManagerStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SupplyZoneManager.class)
public abstract class SupplyZoneManager_ {

	public static volatile SingularAttribute<SupplyZoneManager, String> updatedBy;
	public static volatile SingularAttribute<SupplyZoneManager, LocalDate> endDate;
	public static volatile SingularAttribute<SupplyZoneManager, String> createdBy;
	public static volatile SingularAttribute<SupplyZoneManager, SupplyZone> supplyZone;
	public static volatile SingularAttribute<SupplyZoneManager, Long> id;
	public static volatile SingularAttribute<SupplyZoneManager, Instant> updatedOn;
	public static volatile SingularAttribute<SupplyZoneManager, Employee> employee;
	public static volatile SingularAttribute<SupplyZoneManager, Instant> createdOn;
	public static volatile SingularAttribute<SupplyZoneManager, SupplyZoneManagerStatus> status;

}

