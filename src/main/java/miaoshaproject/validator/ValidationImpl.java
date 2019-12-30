package miaoshaproject.validator;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@Component
public class ValidationImpl implements InitializingBean {
    private Validator validator;

    public ValidationResult validate(Object bean){
        final ValidationResult result=new ValidationResult();
        Set<ConstraintViolation<Object>> constraintViolationSet=validator.validate(bean);
        if(constraintViolationSet.size()>0){
            result.setHasErrors(true);
            constraintViolationSet.forEach(constraintViolation->{
                String errMsg=constraintViolation.getMessage();
                String propertyName=constraintViolation.getPropertyPath().toString();
                result.getErrorMsgMap().put(propertyName,errMsg);
            });
        }
        return result;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //通过工厂初始化方式将其实例化
        this.validator=Validation.buildDefaultValidatorFactory().getValidator();
    }
}
