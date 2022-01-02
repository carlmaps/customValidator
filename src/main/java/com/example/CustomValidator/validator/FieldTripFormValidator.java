package com.example.CustomValidator.validator;

import com.example.CustomValidator.dto.FieldTripForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


@Component
public class FieldTripFormValidator implements Validator {

    @Override
    public boolean supports(Class clazz) {
        return FieldTripForm.class.isAssignableFrom(clazz);
    }
    @Override
    public void validate(Object target, Errors errors){

        FieldTripForm form = (FieldTripForm) target;

        if(errors.getErrorCount() == 0){
            ValidationUtils.rejectIfEmptyOrWhitespace(
                    errors, "age",
                    "error.age",
                    "Age is required.");
            ValidationUtils.rejectIfEmptyOrWhitespace(
                    errors, "name",
                    "error.name",
                    "Nameis required.");

            if(form.getAge() < 18){
                ValidationUtils.rejectIfEmptyOrWhitespace(
                        errors, "guardian",
                        "error.guardian",
                        "Guardian name is required.");
            }
        }
    }
}