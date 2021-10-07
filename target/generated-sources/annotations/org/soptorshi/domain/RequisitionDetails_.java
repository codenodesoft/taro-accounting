package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.UnitOfMeasurements;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RequisitionDetails.class)
public abstract class RequisitionDetails_ {

	public static volatile SingularAttribute<RequisitionDetails, BigDecimal> unitPrice;
	public static volatile SingularAttribute<RequisitionDetails, UnitOfMeasurements> uom;
	public static volatile SingularAttribute<RequisitionDetails, Integer> unit;
	public static volatile SingularAttribute<RequisitionDetails, LocalDate> modifiedOn;
	public static volatile SingularAttribute<RequisitionDetails, Product> product;
	public static volatile SingularAttribute<RequisitionDetails, BigDecimal> quantity;
	public static volatile SingularAttribute<RequisitionDetails, Requisition> requisition;
	public static volatile SingularAttribute<RequisitionDetails, LocalDate> estimatedDate;
	public static volatile SingularAttribute<RequisitionDetails, LocalDate> requiredOn;
	public static volatile SingularAttribute<RequisitionDetails, String> modifiedBy;
	public static volatile SingularAttribute<RequisitionDetails, Long> id;
	public static volatile SingularAttribute<RequisitionDetails, ProductCategory> productCategory;

}

