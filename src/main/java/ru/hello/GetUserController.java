package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUserController {

    private final AtomicLong counter = new AtomicLong();
    @RequestMapping("/get_user")
    public String get() {
        return  " <!DOCTYPE html> <html lang='en'> <head> <title>Yourapp</title> <meta http-equiv=Content-Type content='text/html; charset=UTF-8'/> </head> <body> <h1> HELLO WORLeeeeD </h1> </body> </html> " ;
    }
}