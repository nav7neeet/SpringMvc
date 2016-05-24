package validator;

import model.User;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator
{
	@Override
	public boolean supports(Class clazz)
	{
		// just validate the Customer instances
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors)
	{
		System.out.println("inside validator");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "hello");

	}
}