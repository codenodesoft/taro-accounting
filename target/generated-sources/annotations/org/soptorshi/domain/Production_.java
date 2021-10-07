package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.ProductionWeightStep;
import org.soptorshi.domain.enumeration.UnitOfMeasurements;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Production.class)
public abstract class Production_ {

	public static volatile SingularAttribute<Production, BigDecimal> wastage;
	public static volatile SingularAttribute<Production, BigDecimal> quantity;
	public static volatile SingularAttribute<Production, String> updatedBy;
	public static volatile SingularAttribute<Production, ProductionWeightStep> weightStep;
	public static volatile SingularAttribute<Production, Requisition> requisitions;
	public static volatile SingularAttribute<Production, Instant> updatedOn;
	public static volatile SingularAttribute<Production, Instant> createdOn;
	public static volatile SingularAttribute<Production, Product> products;
	public static volatile SingularAttribute<Production, BigDecimal> byProductQuantity;
	public static volatile SingularAttribute<Production, ProductCategory> productCategories;
	public static volatile SingularAttribute<Production, UnitOfMeasurements> unit;
	public static volatile SingularAttribute<Production, String> createdBy;
	public static volatile SingularAttribute<Production, String> byProductDescription;
	public static volatile SingularAttribute<Production, Long> id;
	public static volatile SingularAttribute<Production, String> remarks;

}

