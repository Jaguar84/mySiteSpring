package az.mysite.springdemoone.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Computer {
    public String model;

    @Autowired
    @Qualifier(value = "myRam")
    public Ram ram;

    public Computer() {
        model = "Inspiron";

    }

}
