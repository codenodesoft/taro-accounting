package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.ContainerCategory;
import org.soptorshi.domain.enumeration.ProductType;
import org.soptorshi.domain.enumeration.StockInProcessStatus;
import org.soptorshi.domain.enumeration.UnitOfMeasurements;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(StockInProcess.class)
public abstract class StockInProcess_ {

	public static volatile SingularAttribute<StockInProcess, BigDecimal> unitPrice;
	public static volatile SingularAttribute<StockInProcess, InventorySubLocation> inventorySubLocations;
	public static volatile SingularAttribute<StockInProcess, String> stockInBy;
	public static volatile SingularAttribute<StockInProcess, ProductType> typeOfProduct;
	public static volatile SingularAttribute<StockInProcess, Requisition> requisitions;
	public static volatile SingularAttribute<StockInProcess, Instant> processStartedOn;
	public static volatile SingularAttribute<StockInProcess, Product> products;
	public static volatile SingularAttribute<StockInProcess, LocalDate> expiryDate;
	public static volatile SingularAttribute<StockInProcess, ContainerCategory> containerCategory;
	public static volatile SingularAttribute<StockInProcess, ProductCategory> productCategories;
	public static volatile SingularAttribute<StockInProcess, UnitOfMeasurements> unit;
	public static volatile SingularAttribute<StockInProcess, String> processStartedBy;
	public static volatile SingularAttribute<StockInProcess, BigDecimal> totalQuantity;
	public static volatile SingularAttribute<StockInProcess, String> quantityPerContainer;
	public static volatile SingularAttribute<StockInProcess, InventoryLocation> inventoryLocations;
	public static volatile SingularAttribute<StockInProcess, Instant> stockInDate;
	public static volatile SingularAttribute<StockInProcess, Vendor> vendor;
	public static volatile SingularAttribute<StockInProcess, Integer> totalContainer;
	public static volatile SingularAttribute<StockInProcess, Long> id;
	public static volatile SingularAttribute<StockInProcess, String> containerTrackingId;
	public static volatile SingularAttribute<StockInProcess, LocalDate> mfgDate;
	public static volatile SingularAttribute<StockInProcess, String> remarks;
	public static volatile SingularAttribute<StockInProcess, StockInProcessStatus> status;

}

