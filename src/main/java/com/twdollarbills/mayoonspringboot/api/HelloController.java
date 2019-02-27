package com.twdollarbills.mayoonspringboot.api;

import com.twdollarbills.mayoonspringboot.PredicateIfc.impl.AppleGreenColorPredicate;
import com.twdollarbills.mayoonspringboot.PredicateIfc.impl.AppleHeavyWeightPredicate;
import com.twdollarbills.mayoonspringboot.vo.Apple;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.twdollarbills.mayoonspringboot.testClass.PrettyPrintApple.prettyPrintApple;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello, BFFs :)";
    }

    @GetMapping("/appleColor")
    public String quizAppleColor(){
        List<Apple> apples =  Arrays.asList(new Apple(60,"green")
                                            , new Apple(155,"green")
                                            , new Apple(120, "red"));

        return prettyPrintApple(apples, new AppleGreenColorPredicate()).toString();
    }

    @GetMapping("/appleWeight")
    public String quizAppleWeight(){
        List<Apple> apples =  Arrays.asList(new Apple(60,"green")
                                        , new Apple(155,"green")
                                        , new Apple(120, "red"));

        return prettyPrintApple(apples, new AppleHeavyWeightPredicate()).toString();
    }
}
