package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ConversionFactor.class)
public abstract class ConversionFactor_ {

	public static volatile SingularAttribute<ConversionFactor, BigDecimal> rcovFactor;
	public static volatile SingularAttribute<ConversionFactor, LocalDate> modifiedOn;
	public static volatile SingularAttribute<ConversionFactor, BigDecimal> covFactor;
	public static volatile SingularAttribute<ConversionFactor, BigDecimal> bcovFactor;
	public static volatile SingularAttribute<ConversionFactor, String> modifiedBy;
	public static volatile SingularAttribute<ConversionFactor, Currency> currency;
	public static volatile SingularAttribute<ConversionFactor, Long> id;
	public static volatile SingularAttribute<ConversionFactor, BigDecimal> rbcovFactor;

}

