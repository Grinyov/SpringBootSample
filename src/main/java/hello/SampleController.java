/**
 * Created by Grinyov Vitaliy on 28.08.15.
 *
 * Демонстрирует простой пример с использованием SpringBoot
 *
 * 1) автоматически стартует tomcat
 * 2) главная страничка как указывает аннотация @RequestMapping("/") отдаст
 * на клиента всё что аннотированно @ResponseBody , т.е выведет сообщение
 *
 */
package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "It's work!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}

