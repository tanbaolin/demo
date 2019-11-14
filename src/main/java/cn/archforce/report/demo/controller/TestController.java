package cn.archforce.report.demo.controller;


import cn.archforce.report.demo.entity.TestEntity;
import cn.archforce.report.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/test")
public class TestController {

    @Autowired
    private TestService testService ;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public TestEntity test(@PathVariable Integer id){
        System.out.println("id:" + id);
        return testService.getById(id);
    }

}
