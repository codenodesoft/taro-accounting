package org.soptorshi.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.SupplySalesRepresentativeStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SupplySalesRepresentative.class)
public abstract class SupplySalesRepresentative_ {

	public static volatile SingularAttribute<SupplySalesRepresentative, String> additionalInformation;
	public static volatile SingularAttribute<SupplySalesRepresentative, String> updatedBy;
	public static volatile SingularAttribute<SupplySalesRepresentative, SupplyAreaManager> supplyAreaManager;
	public static volatile SingularAttribute<SupplySalesRepresentative, SupplyArea> supplyArea;
	public static volatile SingularAttribute<SupplySalesRepresentative, Instant> updatedOn;
	public static volatile SingularAttribute<SupplySalesRepresentative, Instant> createdOn;
	public static volatile SingularAttribute<SupplySalesRepresentative, SupplyZoneManager> supplyZoneManager;
	public static volatile SingularAttribute<SupplySalesRepresentative, String> createdBy;
	public static volatile SingularAttribute<SupplySalesRepresentative, String> contact;
	public static volatile SingularAttribute<SupplySalesRepresentative, String> name;
	public static volatile SingularAttribute<SupplySalesRepresentative, SupplyZone> supplyZone;
	public static volatile SingularAttribute<SupplySalesRepresentative, Long> id;
	public static volatile SingularAttribute<SupplySalesRepresentative, String> email;
	public static volatile SingularAttribute<SupplySalesRepresentative, SupplySalesRepresentativeStatus> status;

}

