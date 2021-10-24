package Shildt.Reflaction;
//https://www.youtube.com/watch?v=XJQuBXWADZg&list=PLiJ76e8LBYQX0CsDJhH0hXMCWReZKNbBh&index=22&t=9s
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE;

@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
@interface RebAnno {
    String since() default "";
}
public class Rabit {
    @Deprecated
    @SuppressWarnings(value = "Olala")
    private String rabbitName;

    @RebAnno(since = "Rebbit Annno Text")
    private String dd;

    public String getRabbitName() {
        return rabbitName;
    }

    public String getDd() {
        return dd;
    }
}
