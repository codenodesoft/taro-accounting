package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SupplyOrderDetails.class)
public abstract class SupplyOrderDetails_ {

	public static volatile SingularAttribute<SupplyOrderDetails, Product> product;
	public static volatile SingularAttribute<SupplyOrderDetails, String> updatedBy;
	public static volatile SingularAttribute<SupplyOrderDetails, BigDecimal> quantity;
	public static volatile SingularAttribute<SupplyOrderDetails, SupplyOrder> supplyOrder;
	public static volatile SingularAttribute<SupplyOrderDetails, String> createdBy;
	public static volatile SingularAttribute<SupplyOrderDetails, BigDecimal> price;
	public static volatile SingularAttribute<SupplyOrderDetails, Long> id;
	public static volatile SingularAttribute<SupplyOrderDetails, Instant> updatedOn;
	public static volatile SingularAttribute<SupplyOrderDetails, Instant> createdOn;
	public static volatile SingularAttribute<SupplyOrderDetails, ProductCategory> productCategory;

}

