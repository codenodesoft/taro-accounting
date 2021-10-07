package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.GroupType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SystemGroupMap.class)
public abstract class SystemGroupMap_ {

	public static volatile SingularAttribute<SystemGroupMap, GroupType> groupType;
	public static volatile SingularAttribute<SystemGroupMap, LocalDate> modifiedOn;
	public static volatile SingularAttribute<SystemGroupMap, String> modifiedBy;
	public static volatile SingularAttribute<SystemGroupMap, Long> id;
	public static volatile SingularAttribute<SystemGroupMap, MstGroup> group;

}

