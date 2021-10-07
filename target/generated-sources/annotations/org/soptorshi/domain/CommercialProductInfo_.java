package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.PackColor;
import org.soptorshi.domain.enumeration.ProductSpecification;
import org.soptorshi.domain.enumeration.SurfaceType;
import org.soptorshi.domain.enumeration.UnitOfMeasurements;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CommercialProductInfo.class)
public abstract class CommercialProductInfo_ {

	public static volatile SingularAttribute<CommercialProductInfo, ProductSpecification> productSpecification;
	public static volatile SingularAttribute<CommercialProductInfo, String> mcSticker;
	public static volatile SingularAttribute<CommercialProductInfo, BigDecimal> buyingUnitPrice;
	public static volatile SingularAttribute<CommercialProductInfo, UnitOfMeasurements> buyingUnit;
	public static volatile SingularAttribute<CommercialProductInfo, String> cylSize;
	public static volatile SingularAttribute<CommercialProductInfo, BigDecimal> spQtyInMc;
	public static volatile SingularAttribute<CommercialProductInfo, PackColor> ipColor;
	public static volatile SingularAttribute<CommercialProductInfo, Instant> createdOn;
	public static volatile SingularAttribute<CommercialProductInfo, UnitOfMeasurements> offeredUnit;
	public static volatile SingularAttribute<CommercialProductInfo, Product> products;
	public static volatile SingularAttribute<CommercialProductInfo, Integer> spGlazing;
	public static volatile SingularAttribute<CommercialProductInfo, BigDecimal> mcCost;
	public static volatile SingularAttribute<CommercialProductInfo, BigDecimal> offeredUnitPrice;
	public static volatile SingularAttribute<CommercialProductInfo, BigDecimal> buyingPrice;
	public static volatile SingularAttribute<CommercialProductInfo, Integer> taskNo;
	public static volatile SingularAttribute<CommercialProductInfo, String> cylColor;
	public static volatile SingularAttribute<CommercialProductInfo, BigDecimal> buyingTotalPrice;
	public static volatile SingularAttribute<CommercialProductInfo, Long> id;
	public static volatile SingularAttribute<CommercialProductInfo, BigDecimal> buyingQuantity;
	public static volatile SingularAttribute<CommercialProductInfo, BigDecimal> ipCost;
	public static volatile SingularAttribute<CommercialProductInfo, String> updatedBy;
	public static volatile SingularAttribute<CommercialProductInfo, String> ipLabel;
	public static volatile SingularAttribute<CommercialProductInfo, BigDecimal> ipQtyInMc;
	public static volatile SingularAttribute<CommercialProductInfo, BigDecimal> offeredTotalPrice;
	public static volatile SingularAttribute<CommercialProductInfo, String> mcPly;
	public static volatile SingularAttribute<CommercialProductInfo, BigDecimal> cylQty;
	public static volatile SingularAttribute<CommercialProductInfo, Instant> updatedOn;
	public static volatile SingularAttribute<CommercialProductInfo, String> mcSize;
	public static volatile SingularAttribute<CommercialProductInfo, String> mcLabel;
	public static volatile SingularAttribute<CommercialProductInfo, String> spSticker;
	public static volatile SingularAttribute<CommercialProductInfo, String> spSize;
	public static volatile SingularAttribute<CommercialProductInfo, String> spLabel;
	public static volatile SingularAttribute<CommercialProductInfo, ProductCategory> productCategories;
	public static volatile SingularAttribute<CommercialProductInfo, CommercialBudget> commercialBudget;
	public static volatile SingularAttribute<CommercialProductInfo, BigDecimal> spQtyInPack;
	public static volatile SingularAttribute<CommercialProductInfo, String> ipSticker;
	public static volatile SingularAttribute<CommercialProductInfo, SurfaceType> spSurfaceType;
	public static volatile SingularAttribute<CommercialProductInfo, String> spOthersDescription;
	public static volatile SingularAttribute<CommercialProductInfo, String> createdBy;
	public static volatile SingularAttribute<CommercialProductInfo, String> ipSize;
	public static volatile SingularAttribute<CommercialProductInfo, PackColor> mcColor;
	public static volatile SingularAttribute<CommercialProductInfo, BigDecimal> cylCost;
	public static volatile SingularAttribute<CommercialProductInfo, BigDecimal> offeredQuantity;

}

