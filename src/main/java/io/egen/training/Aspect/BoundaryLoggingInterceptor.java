package io.egen.training.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by prane on 6/29/2017.
 */
@Aspect
public class BoundaryLoggingInterceptor {
  //  private static final Logger LOGGER = LoggerFactory.getLogger(BoundaryLoggingInterceptor.class);

    @Pointcut(value = "execution( public * io.egen.training..*(..))" )
    public void logging(){
    }
    @Before("logging() && @annotation(BoundaryLogger)")
    public  void loggingAdvice(){
        System.out.println("Logging method working");
    }
}
