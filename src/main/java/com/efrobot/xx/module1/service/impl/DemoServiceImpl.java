package com.efrobot.xx.module1.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efrobot.xx.baseapi.module1.PersonMapper;
import com.efrobot.xx.baseapi.module1.pojo.Person;
import com.efrobot.xx.module1.service.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService {
    private static final Logger log = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Autowired
    private PersonMapper personMapper;

    @Override
    public Person queryAppByAppId(int id) throws Exception {
        return personMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return personMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Person record) {
        return personMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Person record) {
        return personMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Person> queryPerson4ServerDemo() {
        return personMapper.queryPerson4ServerDemo();
    }
}
