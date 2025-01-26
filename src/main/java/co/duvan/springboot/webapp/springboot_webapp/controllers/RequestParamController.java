package co.duvan.springboot.webapp.springboot_webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.duvan.springboot.webapp.springboot_webapp.model.dto.ParamDto;

@RestController
@RequestMapping("/api/params")
public class RequestParamController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hello word!") String message) { // *sirve para enviar valores a tráves de la url */

        ParamDto param = new ParamDto();
        param.setMessage(message);

        return param;

    }

    @GetMapping("/bar")
    public ParamDto bar(@RequestParam String text, @RequestParam Integer code) {

        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(text);
        paramDto.setCode(code);

        return paramDto;

    }

}
