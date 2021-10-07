package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.CurrencyFlag;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Currency.class)
public abstract class Currency_ {

	public static volatile SingularAttribute<Currency, LocalDate> modifiedOn;
	public static volatile SingularAttribute<Currency, CurrencyFlag> flag;
	public static volatile SingularAttribute<Currency, String> notation;
	public static volatile SingularAttribute<Currency, String> description;
	public static volatile SingularAttribute<Currency, String> modifiedBy;
	public static volatile SingularAttribute<Currency, Long> id;

}

