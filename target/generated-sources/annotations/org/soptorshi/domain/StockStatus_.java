package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.UnitOfMeasurements;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(StockStatus.class)
public abstract class StockStatus_ {

	public static volatile SingularAttribute<StockStatus, BigDecimal> availableQuantity;
	public static volatile SingularAttribute<StockStatus, InventorySubLocation> inventorySubLocations;
	public static volatile SingularAttribute<StockStatus, String> stockInBy;
	public static volatile SingularAttribute<StockStatus, BigDecimal> totalPrice;
	public static volatile SingularAttribute<StockStatus, StockInItem> stockInItem;
	public static volatile SingularAttribute<StockStatus, Product> products;
	public static volatile SingularAttribute<StockStatus, ProductCategory> productCategories;
	public static volatile SingularAttribute<StockStatus, UnitOfMeasurements> unit;
	public static volatile SingularAttribute<StockStatus, BigDecimal> totalQuantity;
	public static volatile SingularAttribute<StockStatus, InventoryLocation> inventoryLocations;
	public static volatile SingularAttribute<StockStatus, Instant> stockInDate;
	public static volatile SingularAttribute<StockStatus, Long> id;
	public static volatile SingularAttribute<StockStatus, String> containerTrackingId;
	public static volatile SingularAttribute<StockStatus, BigDecimal> availablePrice;

}

