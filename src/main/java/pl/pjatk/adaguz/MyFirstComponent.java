package pl.pjatk.adaguz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class MyFirstComponent {
    public MyFirstComponent(MySecondComponent mySecondComponent, MySimplePojo mySimplePOJO, List<String> defaultData,
                            List<String> anotherDefaultData, List<MySimplePojo> mySimplePojoList, int someInt,
                            @Value("${my.custom.property}") String valueFromProperties,
                            @Value("${my.custom.random:some default value from @value}")
                                    String randomValueFromJazProperties) {
//        System.out.println("Hello from MyFirstComponent");
//        mySecondComponent.helloFromMethod();
//        mySimplePOJO.printOutMe();
//        System.out.println(defaultData);
//        System.out.println(anotherDefaultData);
//        System.out.println(mySimplePojoList);
//        System.out.println(someInt);
//
//        System.out.println("********************");
//        System.out.println(valueFromProperties);
//        System.out.println(randomValueFromJazProperties);

    }
}
