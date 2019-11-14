package cn.archforce.report.demo.service;

import cn.archforce.report.demo.dao.TestDao;
import cn.archforce.report.demo.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao ;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }
}
