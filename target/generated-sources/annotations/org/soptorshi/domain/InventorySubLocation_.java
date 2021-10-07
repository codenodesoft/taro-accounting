package org.soptorshi.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.InventorySubLocationCategory;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InventorySubLocation.class)
public abstract class InventorySubLocation_ {

	public static volatile SingularAttribute<InventorySubLocation, InventoryLocation> inventoryLocations;
	public static volatile SingularAttribute<InventorySubLocation, String> name;
	public static volatile SingularAttribute<InventorySubLocation, String> description;
	public static volatile SingularAttribute<InventorySubLocation, Long> id;
	public static volatile SingularAttribute<InventorySubLocation, InventorySubLocationCategory> category;
	public static volatile SingularAttribute<InventorySubLocation, String> shortName;

}

