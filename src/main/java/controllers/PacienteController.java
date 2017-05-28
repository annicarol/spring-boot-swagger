package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @RequestMapping(value = "/findAll", method= RequestMethod.GET)
    public String findAll(){
        return "[{\"nome\":\"Aaron Considine\",\"cpf\":27085766662,\"senha\":\"hackathon2017!\"},{\"nome\":\"Aaron Sampaio\",\"cpf\":84849394485,\"senha\":\"hackathon2017!\"},{\"nome\":\"Adam Dach\",\"cpf\":2572742276,\"senha\":\"hackathon2017!\"},{\"nome\":\"Adam Guimarães\",\"cpf\":60793748119,\"senha\":\"hackathon2017!\"},{\"nome\":\"Agnes Bradtke\",\"cpf\":63596018269,\"senha\":\"hackathon2017!\"},{\"nome\":\"Agnes Guimarães\",\"cpf\":11659402999,\"senha\":\"hackathon2017!\"}]";
    }

}