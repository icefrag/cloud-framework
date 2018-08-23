package com.efrobot.xx.module1.service;

import java.util.List;

import com.efrobot.xx.baseapi.module1.pojo.Person;

public interface DemoService {
    public Person queryAppByAppId(int id) throws Exception;

    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int updateByPrimaryKeySelective(Person record);

    List<Person> queryPerson4ServerDemo();
}
