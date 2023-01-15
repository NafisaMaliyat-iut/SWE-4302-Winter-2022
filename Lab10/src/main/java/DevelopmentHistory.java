import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented()
public @interface DevelopmentHistory {
    double version () default 1;
    String developer();
    String tester() default "";
}
