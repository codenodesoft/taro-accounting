package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.AllowanceCategory;
import org.soptorshi.domain.enumeration.AllowanceType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DesignationWiseAllowance.class)
public abstract class DesignationWiseAllowance_ {

	public static volatile SingularAttribute<DesignationWiseAllowance, AllowanceType> allowanceType;
	public static volatile SingularAttribute<DesignationWiseAllowance, BigDecimal> amount;
	public static volatile SingularAttribute<DesignationWiseAllowance, LocalDate> modifiedOn;
	public static volatile SingularAttribute<DesignationWiseAllowance, AllowanceCategory> allowanceCategory;
	public static volatile SingularAttribute<DesignationWiseAllowance, String> modifiedBy;
	public static volatile SingularAttribute<DesignationWiseAllowance, Long> id;
	public static volatile SingularAttribute<DesignationWiseAllowance, Designation> designation;

}

