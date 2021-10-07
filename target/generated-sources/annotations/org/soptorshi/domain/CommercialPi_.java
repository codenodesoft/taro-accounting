package org.soptorshi.domain;

import java.time.Instant;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.CommercialPiStatus;
import org.soptorshi.domain.enumeration.PaymentType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CommercialPi.class)
public abstract class CommercialPi_ {

	public static volatile SingularAttribute<CommercialPi, String> harmonicCode;
	public static volatile SingularAttribute<CommercialPi, String> updatedBy;
	public static volatile SingularAttribute<CommercialPi, String> companyName;
	public static volatile SingularAttribute<CommercialPi, String> companyDescription;
	public static volatile SingularAttribute<CommercialPi, Instant> updatedOn;
	public static volatile SingularAttribute<CommercialPi, String> proformaNo;
	public static volatile SingularAttribute<CommercialPi, Instant> createdOn;
	public static volatile SingularAttribute<CommercialPi, PaymentType> paymentType;
	public static volatile SingularAttribute<CommercialPi, CommercialPiStatus> piStatus;
	public static volatile SingularAttribute<CommercialPi, String> termsOfDelivery;
	public static volatile SingularAttribute<CommercialPi, String> purchaseOrderNo;
	public static volatile SingularAttribute<CommercialPi, LocalDate> proformaDate;
	public static volatile SingularAttribute<CommercialPi, CommercialBudget> commercialBudget;
	public static volatile SingularAttribute<CommercialPi, String> createdBy;
	public static volatile SingularAttribute<CommercialPi, Long> id;
	public static volatile SingularAttribute<CommercialPi, String> shipmentDate;
	public static volatile SingularAttribute<CommercialPi, String> portOfLoading;
	public static volatile SingularAttribute<CommercialPi, String> paymentTerm;
	public static volatile SingularAttribute<CommercialPi, String> portOfDestination;

}

