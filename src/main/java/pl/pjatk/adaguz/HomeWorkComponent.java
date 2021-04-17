package pl.pjatk.adaguz;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(
        value = "my.custom.boolean",
        havingValue = "true"
)
public class HomeWorkComponent {


    public HomeWorkComponent(String result) {

        System.out.println(result);
    }

}


