package lk.ijse.gdse63.demo1.api;

import lk.ijse.gdse63.demo1.dto.jsondata;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jsonhandle")//expose a endpoint
public class JSONHandler {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <jsondata> getJsondata(){
        return new ResponseEntity<>(new jsondata("J001","shaili","Panadura"), HttpStatus.CREATED);
    }
}
