package MetTours;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface LuxuryTax{
	
	float value() default 5;
}

