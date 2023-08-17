
import org.springframework.bind.annotation.GetMapping;
@RestController
public class ApiController {
    @GetMapping("/welcome")
    public String Welcome()
    {
        return "Welcome String Boot";
    }
}
