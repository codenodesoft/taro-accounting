package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.BalanceType;
import org.soptorshi.domain.enumeration.DepreciationType;
import org.soptorshi.domain.enumeration.ReservedFlag;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MstAccount.class)
public abstract class MstAccount_ {

	public static volatile SingularAttribute<MstAccount, ReservedFlag> reservedFlag;
	public static volatile SingularAttribute<MstAccount, LocalDate> modifiedOn;
	public static volatile SingularAttribute<MstAccount, String> code;
	public static volatile SingularAttribute<MstAccount, BalanceType> yearOpenBalanceType;
	public static volatile SingularAttribute<MstAccount, String> name;
	public static volatile SingularAttribute<MstAccount, BigDecimal> yearOpenBalance;
	public static volatile SingularAttribute<MstAccount, String> modifiedBy;
	public static volatile SingularAttribute<MstAccount, Long> id;
	public static volatile SingularAttribute<MstAccount, BigDecimal> depreciationRate;
	public static volatile SingularAttribute<MstAccount, BigDecimal> yearCloseBalance;
	public static volatile SingularAttribute<MstAccount, DepreciationType> depreciationType;
	public static volatile SingularAttribute<MstAccount, MstGroup> group;

}

