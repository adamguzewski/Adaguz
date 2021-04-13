package pl.pjatk.adaguz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({ "trueProfile" })

public class HomeWorkComponent {
    public HomeWorkComponent(String result, @Value("${my.myVariable.property}") boolean variable){

        System.out.println("-----HOMEWORK-----");
        System.out.println(result);
        System.out.println("-----END OF HOMEWORK-----");

    }
}
