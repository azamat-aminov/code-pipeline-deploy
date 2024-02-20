package aws.codepipeline.codepiplelinedeploy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aws")
public class CodeDeployController {

    @GetMapping("/")
    public String index() {
        return "Home page!";
    }

}
