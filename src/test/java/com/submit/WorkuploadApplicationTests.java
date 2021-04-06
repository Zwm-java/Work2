package com.submit;

import com.submit.dao.studentMapper;
import com.submit.dao.teachclassMapper;
import com.submit.pojo.job;
import com.submit.service.studentService;
import com.submit.service.teacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkuploadApplicationTests {

//    Logger logger= LoggerFactory.getLogger(WorkuploadApplicationTests.class);
//    @Autowired(required = false)
//    studentMapper studentMapper;
    @Autowired(required = false)
    private teachclassMapper teachclassMapepr;
    @Autowired(required = false)
//    studentService service;
   private teacherService teacherService;
    @Test
    public void contextLoads() {
        List<job> list = teacherService.getjobbyteachclaid(Integer.parseInt("100"));
        System.out.println(list);
    }




}
