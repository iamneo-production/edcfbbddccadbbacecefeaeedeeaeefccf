public class ApiController {
    @RequestMapping()
    public String Welcome()
    {
        return "Welcome Spring Boot!";
    }
}
