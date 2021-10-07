package org.soptorshi.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DepreciationMap.class)
public abstract class DepreciationMap_ {

	public static volatile SingularAttribute<DepreciationMap, Long> accountId;
	public static volatile SingularAttribute<DepreciationMap, Instant> modifiedOn;
	public static volatile SingularAttribute<DepreciationMap, String> accountName;
	public static volatile SingularAttribute<DepreciationMap, String> createdBy;
	public static volatile SingularAttribute<DepreciationMap, String> depreciationAccountName;
	public static volatile SingularAttribute<DepreciationMap, String> modifiedBy;
	public static volatile SingularAttribute<DepreciationMap, Long> id;
	public static volatile SingularAttribute<DepreciationMap, Long> depreciationAccountId;
	public static volatile SingularAttribute<DepreciationMap, Instant> createdOn;

}

