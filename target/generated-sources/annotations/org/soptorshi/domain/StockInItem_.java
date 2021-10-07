package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.ContainerCategory;
import org.soptorshi.domain.enumeration.ProductType;
import org.soptorshi.domain.enumeration.UnitOfMeasurements;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(StockInItem.class)
public abstract class StockInItem_ {

	public static volatile SingularAttribute<StockInItem, InventorySubLocation> inventorySubLocations;
	public static volatile SingularAttribute<StockInItem, String> stockInBy;
	public static volatile SingularAttribute<StockInItem, BigDecimal> quantity;
	public static volatile SingularAttribute<StockInItem, ProductType> typeOfProduct;
	public static volatile SingularAttribute<StockInItem, Requisition> requisitions;
	public static volatile SingularAttribute<StockInItem, Product> products;
	public static volatile SingularAttribute<StockInItem, LocalDate> expiryDate;
	public static volatile SingularAttribute<StockInItem, ContainerCategory> containerCategory;
	public static volatile SingularAttribute<StockInItem, ProductCategory> productCategories;
	public static volatile SingularAttribute<StockInItem, UnitOfMeasurements> unit;
	public static volatile SingularAttribute<StockInItem, InventoryLocation> inventoryLocations;
	public static volatile SingularAttribute<StockInItem, BigDecimal> price;
	public static volatile SingularAttribute<StockInItem, Instant> stockInDate;
	public static volatile SingularAttribute<StockInItem, Vendor> vendor;
	public static volatile SingularAttribute<StockInItem, Long> id;
	public static volatile SingularAttribute<StockInItem, String> containerTrackingId;
	public static volatile SingularAttribute<StockInItem, LocalDate> mfgDate;
	public static volatile SingularAttribute<StockInItem, StockInProcess> stockInProcesses;
	public static volatile SingularAttribute<StockInItem, String> remarks;

}

