package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.MonthType;
import org.soptorshi.domain.enumeration.MonthlySalaryStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MonthlySalary.class)
public abstract class MonthlySalary_ {

	public static volatile SingularAttribute<MonthlySalary, BigDecimal> medicalAllowance;
	public static volatile SingularAttribute<MonthlySalary, Integer> year;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> overTimeAllowance;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> fuelLubAllowance;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> providentFund;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> travelAllowance;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> advanceHO;
	public static volatile SingularAttribute<MonthlySalary, Employee> employee;
	public static volatile SingularAttribute<MonthlySalary, Boolean> voucherGenerated;
	public static volatile SingularAttribute<MonthlySalary, Boolean> approved;
	public static volatile SingularAttribute<MonthlySalary, LocalDate> modifiedOn;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> arrearAllowance;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> payable;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> fine;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> billReceivable;
	public static volatile SingularAttribute<MonthlySalary, Integer> absent;
	public static volatile SingularAttribute<MonthlySalary, String> modifiedBy;
	public static volatile SingularAttribute<MonthlySalary, Long> id;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> otherAllowance;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> foodAllowance;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> mobileAllowance;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> billPayable;
	public static volatile SetAttribute<MonthlySalary, SalaryMessages> comments;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> gross;
	public static volatile SingularAttribute<MonthlySalary, Boolean> onHold;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> houseRent;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> advanceFactory;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> tax;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> loanAmount;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> festivalAllowance;
	public static volatile SingularAttribute<MonthlySalary, MonthType> month;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> basic;
	public static volatile SingularAttribute<MonthlySalary, BigDecimal> driverAllowance;
	public static volatile SingularAttribute<MonthlySalary, MonthlySalaryStatus> status;

}

