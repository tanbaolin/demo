package cn.archforce.report.demo.dao;

import cn.archforce.report.demo.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    TestEntity getById(Integer id);

}
