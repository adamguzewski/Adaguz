package pl.pjatk.adaguz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class HomeWorkComponent {

    public HomeWorkComponent(String result, @Value("${my.custom.boolean}") boolean variable) {

        if (variable) {

            System.out.println("-----HOMEWORK-----");
            System.out.println(result);
            System.out.println("-----END OF HOMEWORK-----");
        }
    }
}
