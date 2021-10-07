package org.soptorshi.domain;

import java.time.Instant;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.SupplyAreaManagerStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SupplyAreaManager.class)
public abstract class SupplyAreaManager_ {

	public static volatile SingularAttribute<SupplyAreaManager, String> updatedBy;
	public static volatile SingularAttribute<SupplyAreaManager, String> createdBy;
	public static volatile SingularAttribute<SupplyAreaManager, LocalDate> endDate;
	public static volatile SingularAttribute<SupplyAreaManager, SupplyArea> supplyArea;
	public static volatile SingularAttribute<SupplyAreaManager, SupplyZone> supplyZone;
	public static volatile SingularAttribute<SupplyAreaManager, Long> id;
	public static volatile SingularAttribute<SupplyAreaManager, Instant> updatedOn;
	public static volatile SingularAttribute<SupplyAreaManager, Employee> employee;
	public static volatile SingularAttribute<SupplyAreaManager, Instant> createdOn;
	public static volatile SingularAttribute<SupplyAreaManager, SupplyZoneManager> supplyZoneManager;
	public static volatile SingularAttribute<SupplyAreaManager, SupplyAreaManagerStatus> status;

}

