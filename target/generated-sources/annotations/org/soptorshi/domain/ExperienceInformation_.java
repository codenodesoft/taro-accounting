package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.EmploymentType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ExperienceInformation.class)
public abstract class ExperienceInformation_ {

	public static volatile SingularAttribute<ExperienceInformation, LocalDate> endDate;
	public static volatile SingularAttribute<ExperienceInformation, EmploymentType> employmentType;
	public static volatile SingularAttribute<ExperienceInformation, String> organization;
	public static volatile SingularAttribute<ExperienceInformation, Long> id;
	public static volatile SingularAttribute<ExperienceInformation, String> designation;
	public static volatile SingularAttribute<ExperienceInformation, Employee> employee;
	public static volatile SingularAttribute<ExperienceInformation, LocalDate> startDate;

}

