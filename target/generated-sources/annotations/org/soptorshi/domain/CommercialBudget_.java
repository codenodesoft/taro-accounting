package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.CommercialBudgetStatus;
import org.soptorshi.domain.enumeration.CommercialCustomerCategory;
import org.soptorshi.domain.enumeration.CommercialOrderCategory;
import org.soptorshi.domain.enumeration.PaymentType;
import org.soptorshi.domain.enumeration.TransportType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CommercialBudget.class)
public abstract class CommercialBudget_ {

	public static volatile SingularAttribute<CommercialBudget, LocalDate> budgetDate;
	public static volatile SingularAttribute<CommercialBudget, BigDecimal> profitAmount;
	public static volatile SingularAttribute<CommercialBudget, String> companyName;
	public static volatile SingularAttribute<CommercialBudget, CommercialBudgetStatus> budgetStatus;
	public static volatile SingularAttribute<CommercialBudget, CommercialOrderCategory> type;
	public static volatile SingularAttribute<CommercialBudget, String> budgetNo;
	public static volatile SingularAttribute<CommercialBudget, Instant> createdOn;
	public static volatile SingularAttribute<CommercialBudget, PaymentType> paymentType;
	public static volatile SingularAttribute<CommercialBudget, String> landPortName;
	public static volatile SingularAttribute<CommercialBudget, BigDecimal> totalQuantity;
	public static volatile SingularAttribute<CommercialBudget, String> airPortName;
	public static volatile SingularAttribute<CommercialBudget, BigDecimal> landPortCost;
	public static volatile SingularAttribute<CommercialBudget, Long> id;
	public static volatile SingularAttribute<CommercialBudget, BigDecimal> totalTransportationCost;
	public static volatile SingularAttribute<CommercialBudget, String> updatedBy;
	public static volatile SingularAttribute<CommercialBudget, BigDecimal> airPortCost;
	public static volatile SingularAttribute<CommercialBudget, Instant> updatedOn;
	public static volatile SingularAttribute<CommercialBudget, TransportType> transportationType;
	public static volatile SingularAttribute<CommercialBudget, String> proformaNo;
	public static volatile SingularAttribute<CommercialBudget, BigDecimal> totalBuyingPrice;
	public static volatile SingularAttribute<CommercialBudget, BigDecimal> insurancePrice;
	public static volatile SingularAttribute<CommercialBudget, String> createdBy;
	public static volatile SingularAttribute<CommercialBudget, BigDecimal> totalOfferedPrice;
	public static volatile SingularAttribute<CommercialBudget, BigDecimal> seaPortCost;
	public static volatile SingularAttribute<CommercialBudget, BigDecimal> profitPercentage;
	public static volatile SingularAttribute<CommercialBudget, String> seaPortName;
	public static volatile SingularAttribute<CommercialBudget, CommercialCustomerCategory> customer;

}

