package northwind.service;

//import java.time.Instant;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;
//import java.util.TimeZone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import northwind.entity.Order;

public class OrderRequiredDateValidator implements ConstraintValidator<ValidOrderRequiredDate, Order>{

	@Override
	public boolean isValid(Order currentOrder, ConstraintValidatorContext context) {
		if (currentOrder == null || currentOrder.getOrderDate() == null || currentOrder.getRequiredDate() == null) {
			return true;
		}
		
		// Java 8 technique
//		Instant requireDateInstant = currentOrder.getRequiredDate().toInstant();
//		ZoneId defaultZone = TimeZone.getDefault().toZoneId();
//		LocalDateTime requiredDate = LocalDateTime.ofInstant(requireDateInstant, defaultZone);
//		requiredDate.plusDays(3);
//		Instant orderDateInstant = currentOrder.getOrderDate().toInstant();
//		LocalDateTime orderDate = LocalDateTime.ofInstant(orderDateInstant, defaultZone);
//		return requiredDate.isAfter(orderDate);

		// Java 7 technique
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(currentOrder.getShippedDate());
		calendar.add(Calendar.DATE, 3);
		return calendar.getTime().after(currentOrder.getOrderDate());
		
	}

}
