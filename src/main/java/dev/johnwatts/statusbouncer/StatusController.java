package dev.johnwatts.statusbouncer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StatusController {
    @GetMapping(value = "/{status}")
    @ResponseBody
    public ResponseEntity<String> returnStatusCode(@PathVariable("status") int status) {
        return new ResponseEntity<>("" + status, HttpStatus.valueOf(status));
    }
}
