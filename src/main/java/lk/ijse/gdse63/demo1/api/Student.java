package lk.ijse.gdse63.demo1.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
    @GetMapping("student/{id:S\\d{3}}")
    public String getStudentDetails(@PathVariable String id){
        return "Get Student Data of "+id;
    }

    @GetMapping("student")
    public String getAllStudent(){
        return "get all Students";
    }

    @GetMapping("student/{id}*")
    public String getAllStudentWithAll(@PathVariable String id){
        return "Get all Student Data with "+id;
    }

    @GetMapping("student/{id}/{code}")
    public String getStudentDataWithTwoParams(@PathVariable String id,@PathVariable String code){
        return "Get student data with multi param as id:"+id+" and code:"+code;
    }

}
