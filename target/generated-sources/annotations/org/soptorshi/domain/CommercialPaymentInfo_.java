package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.CommercialPaymentStatus;
import org.soptorshi.domain.enumeration.PaymentType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CommercialPaymentInfo.class)
public abstract class CommercialPaymentInfo_ {

	public static volatile SingularAttribute<CommercialPaymentInfo, BigDecimal> totalAmountToPay;
	public static volatile SingularAttribute<CommercialPaymentInfo, BigDecimal> remainingAmountToPay;
	public static volatile SingularAttribute<CommercialPaymentInfo, String> updatedBy;
	public static volatile SingularAttribute<CommercialPaymentInfo, CommercialPi> commercialPi;
	public static volatile SingularAttribute<CommercialPaymentInfo, String> createdBy;
	public static volatile SingularAttribute<CommercialPaymentInfo, BigDecimal> totalAmountPaid;
	public static volatile SingularAttribute<CommercialPaymentInfo, Long> id;
	public static volatile SingularAttribute<CommercialPaymentInfo, Instant> updatedOn;
	public static volatile SingularAttribute<CommercialPaymentInfo, Instant> createdOn;
	public static volatile SingularAttribute<CommercialPaymentInfo, CommercialPaymentStatus> paymentStatus;
	public static volatile SingularAttribute<CommercialPaymentInfo, PaymentType> paymentType;

}

