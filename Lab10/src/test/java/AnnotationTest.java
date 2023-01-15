import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnnotationTest {
    Object faculty1;
    List<Course> courses = new ArrayList<>();
    @BeforeEach
    void setUp(){
        faculty1 = new Faculty("Mr A", "Lecturer", 33000);
        Course course1 = new Course(4401, "Computer", 3, CourseType.THEORY);
        Course course2 = new Course(1278, "Mathematics", 3, CourseType.LAB);
        Course course3 = new Course(1234, "History", 3, CourseType.LAB);
        Course course4 = new Course(4311, "Biology", 3, CourseType.THEORY);
        Course course5 = new Course(5241, "Physics", 3, CourseType.THEORY);
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);
        courses.add(course5);
    }


    @Test
    public void facultyMethodsAnnotationTest1(){
        Method[] methods = faculty1.getClass().getDeclaredMethods();
        List<String> actualMethodNames = new ArrayList<>();//methods with the annotations

        for(Method m: methods){
            System.out.println(m.getName()); //print method name
            boolean annotationPresent = m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class); //is this annotation present
            if(annotationPresent){
                System.out.println(m.getDeclaredAnnotations().length);
                actualMethodNames.add(m.getName());
            }
            else
                System.out.println("No annotations");
        }

        assertTrue(actualMethodNames.containsAll(Arrays.asList("teach")));
    }

    @Test
    public void facultyMethodsAnnotationTest2(){
        Constructor<?>[] declaredConstructors= faculty1.getClass().getConstructors();
        List<String> actualConstructorNames = new ArrayList<>();//methods with the annotations

        System.out.println("Number of declared constructors: " + declaredConstructors.length);
        for(Constructor c: declaredConstructors){
            System.out.println(c.getName()); //print method name
            boolean annotationPresent = c.isAnnotationPresent(DevelopmentHistoryWithReviewer.class); //is this annotation present
            if(annotationPresent){
                System.out.println(c.getDeclaredAnnotations().length);
                actualConstructorNames.add(c.getName());
            }
            else
                System.out.println("No annotations");
        }

        assertTrue(actualConstructorNames.containsAll(Arrays.asList("Faculty", "Faculty")));
    }


    @Test
    public void classAnnotationTest(){
        Annotation[] annotations = faculty1.getClass().getAnnotations();
        List<String> actualAnnotationsNames = new ArrayList<>();//methods with the annotations

        for(Annotation a: annotations){
            System.out.println(a.annotationType().getName()); //print method name
            actualAnnotationsNames.add(a.annotationType().getName());
            }
        assertTrue(actualAnnotationsNames.containsAll(Arrays.asList("DevelopmentHistory")));
        }
    }



