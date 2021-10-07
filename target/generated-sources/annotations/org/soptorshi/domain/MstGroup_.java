package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.ReservedFlag;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MstGroup.class)
public abstract class MstGroup_ {

	public static volatile SingularAttribute<MstGroup, Long> mainGroup;
	public static volatile SingularAttribute<MstGroup, ReservedFlag> reservedFlag;
	public static volatile SingularAttribute<MstGroup, LocalDate> modifiedOn;
	public static volatile SingularAttribute<MstGroup, String> name;
	public static volatile SingularAttribute<MstGroup, String> modifiedBy;
	public static volatile SingularAttribute<MstGroup, Long> id;

}

