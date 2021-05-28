package com.example.galadarbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AllController {

    @GetMapping("/")
    public String home(){
        return "lv/landing";
    }

    @GetMapping("/firstStep")
    public String first(){
        return "lv/first";
    }

    @GetMapping("/secondStep")
    public String second(){
        return "lv/secondpage";
    }

    @GetMapping("/thirdStep")
    public String third(){
        return "lv/thirdpage";
    }

    @GetMapping("/fourthStep")
    public String fourth(){
        return "lv/fourthpage";
    }

    @GetMapping("/fifthStep")
    public String fifth(){
        return "lv/fifthpage";
    }

    @GetMapping("/sixthStep")
    public String sixth(){
        return "lv/sixthpage";
    }

    @GetMapping("/en")
    public String homeEn(){
        return "en/landing";
    }

    @GetMapping("/firstStep/en")
    public String firstEn(){
        return "en/first";
    }

    @GetMapping("/secondStep/en")
    public String secondEn(){
        return "en/secondpage";
    }

    @GetMapping("/thirdStep/en")
    public String thirdEn(){
        return "en/thirdpage";
    }

    @GetMapping("/fourthStep/en")
    public String fourthEn(){
        return "en/fourthpage";
    }

    @GetMapping("/fifthStep/en")
    public String fifthEn(){
        return "en/fifthpage";
    }

    @GetMapping("/sixthStep/en")
    public String sixthEn(){
        return "en/sixthpage";
    }
}
