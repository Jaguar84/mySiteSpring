package az.mysite.springdemoone.config;


import az.mysite.springdemoone.beans.Computer;
import az.mysite.springdemoone.beans.Ram;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfig {

    @Value(value ="${myName}" )
    private  String myName;

    @Bean
    public Computer myComputer(){
        Computer computer=new Computer();
        computer.model="G62";
        return computer;
    }

    @Bean
    public Ram myRam(){
        Ram r= new Ram();
        r.size=24;
        r.brand="HP";
        return r;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}
