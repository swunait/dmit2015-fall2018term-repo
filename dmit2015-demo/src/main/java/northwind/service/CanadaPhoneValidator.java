package northwind.service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import northwind.entity.Shipper;

public class CanadaPhoneValidator implements ConstraintValidator<ValidCanadaPhone, Shipper>{

	@Override
	public boolean isValid(Shipper currentShipper, ConstraintValidatorContext context) {
		if (currentShipper == null) {
			return true;
		}
		return currentShipper.getPhone().matches("^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$");
	}

}
