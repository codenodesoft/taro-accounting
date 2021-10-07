package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.AccountType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SystemAccountMap.class)
public abstract class SystemAccountMap_ {

	public static volatile SingularAttribute<SystemAccountMap, LocalDate> modifiedOn;
	public static volatile SingularAttribute<SystemAccountMap, AccountType> accountType;
	public static volatile SingularAttribute<SystemAccountMap, String> modifiedBy;
	public static volatile SingularAttribute<SystemAccountMap, Long> id;
	public static volatile SingularAttribute<SystemAccountMap, MstAccount> account;

}

