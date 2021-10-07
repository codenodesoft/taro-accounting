package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(StockOutItem.class)
public abstract class StockOutItem_ {

	public static volatile SingularAttribute<StockOutItem, InventorySubLocation> inventorySubLocations;
	public static volatile SingularAttribute<StockOutItem, BigDecimal> quantity;
	public static volatile SingularAttribute<StockOutItem, Product> products;
	public static volatile SingularAttribute<StockOutItem, ProductCategory> productCategories;
	public static volatile SingularAttribute<StockOutItem, String> receiverId;
	public static volatile SingularAttribute<StockOutItem, String> receivingPlace;
	public static volatile SingularAttribute<StockOutItem, StockInItem> stockInItems;
	public static volatile SingularAttribute<StockOutItem, InventoryLocation> inventoryLocations;
	public static volatile SingularAttribute<StockOutItem, Instant> stockOutDate;
	public static volatile SingularAttribute<StockOutItem, Long> id;
	public static volatile SingularAttribute<StockOutItem, String> containerTrackingId;
	public static volatile SingularAttribute<StockOutItem, String> stockOutBy;
	public static volatile SingularAttribute<StockOutItem, String> remarks;

}

