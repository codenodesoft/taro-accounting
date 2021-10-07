package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.AITStatus;
import org.soptorshi.domain.enumeration.Currency;
import org.soptorshi.domain.enumeration.PayType;
import org.soptorshi.domain.enumeration.UnitOfMeasurements;
import org.soptorshi.domain.enumeration.VatStatus;
import org.soptorshi.domain.enumeration.WarrantyStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(QuotationDetails.class)
public abstract class QuotationDetails_ {

	public static volatile SingularAttribute<QuotationDetails, Product> product;
	public static volatile SingularAttribute<QuotationDetails, Integer> quantity;
	public static volatile SingularAttribute<QuotationDetails, BigDecimal> aitPercentage;
	public static volatile SingularAttribute<QuotationDetails, LocalDate> estimatedDate;
	public static volatile SingularAttribute<QuotationDetails, UnitOfMeasurements> unitOfMeasurements;
	public static volatile SingularAttribute<QuotationDetails, AITStatus> aitStatus;
	public static volatile SingularAttribute<QuotationDetails, LocalDate> modifiedOn;
	public static volatile SingularAttribute<QuotationDetails, PayType> payType;
	public static volatile SingularAttribute<QuotationDetails, RequisitionDetails> requisitionDetails;
	public static volatile SingularAttribute<QuotationDetails, WarrantyStatus> warrantyStatus;
	public static volatile SingularAttribute<QuotationDetails, BigDecimal> rate;
	public static volatile SingularAttribute<QuotationDetails, BigDecimal> vatPercentage;
	public static volatile SingularAttribute<QuotationDetails, String> loadingPort;
	public static volatile SingularAttribute<QuotationDetails, BigDecimal> creditLimit;
	public static volatile SingularAttribute<QuotationDetails, VatStatus> vatStatus;
	public static volatile SingularAttribute<QuotationDetails, Currency> currency;
	public static volatile SingularAttribute<QuotationDetails, String> modifiedBy;
	public static volatile SingularAttribute<QuotationDetails, Long> id;
	public static volatile SingularAttribute<QuotationDetails, Quotation> quotation;
	public static volatile SingularAttribute<QuotationDetails, String> remarks;

}

