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
		return currentShipper.getPhone().matches("^(?:\\+?1[-. ]?)?\\(?([0-9]{3})\\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$");
	}

}
