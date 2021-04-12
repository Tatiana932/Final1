package com.validators;

import com.models.Client;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class CliValidator implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return Client.class.isAssignableFrom(type);
    }

    
    /**
     * This method allow validate each value in the moment to create or update a user.
     * Validate if the field have empty or white spaces and avoid the bad creation in the database.
     **/
    @Override
    public void validate(Object o, Errors errors) {
        Client client = (Client)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "th_name", "The field NAME is requiered.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "th_lastname", "The field Firts LAST NAME is requiered.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "th_mail", "The field Second MAIL is requiered.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "th_phone", "The field PHONE is requiered.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "th_subject", "The field SUBJECT is requiered.");
    }
    
}
