package pl.pjatk.adaguz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class HomeWorkComponent {
    public HomeWorkComponent(String result, @Value("${my.myVariable.property}") boolean variable){
        boolean var = variable;

        System.out.println("----HOMEWORK----");

        if(var){
            System.out.println(result);
        }

        System.out.println("----END OF HOMEWORK----");

    }
}
