package unitTrans;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class controller {
    @GetMapping({"/centimeter"})
    public double inch2centimeter(@RequestParam Double inch){
        return inch * 2.54;
    }
    @GetMapping({"/meter"})
    public double yard2meter(@RequestParam Double yard ){
        return yard/1.094;
    }
}
