
package Workings.work.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author HP
 */
@Controller
public class work {
    
    @GetMapping ("/")
    public String work(){ 
        return "work";
    }
}
