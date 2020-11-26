package com.project.crm.settings.service.impl;

import com.project.crm.base.bean.DictionaryType;
import com.project.crm.base.bean.DictionaryValue;
import com.project.crm.settings.mapper.DictionaryTypeMapper;
import com.project.crm.settings.mapper.DictionaryValueMapper;
import com.project.crm.settings.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.settings.service.impl
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/21 20:52
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Autowired
    private DictionaryTypeMapper dictionaryTypeMapper;

    @Autowired
    private DictionaryValueMapper dictionaryValueMapper;

    @Override
    public List<DictionaryType> queryDictionary() {

        //先查询字典类型
         List<DictionaryType> dictionaryTypes = dictionaryTypeMapper.selectAll();
        for (DictionaryType dictionaryType : dictionaryTypes) {
            //取出每个字典类型的主键,查询该类型下的所有字典类型对应的values
            Example example = new Example(DictionaryValue.class);
            example.createCriteria().andEqualTo("typeCode",dictionaryType.getCode());
            List<DictionaryValue> dictionaryValues = dictionaryValueMapper.selectByExample(example);

            //还要将dictionaryValues设置到每个字典类型中
            dictionaryType.setDictionaryValues(dictionaryValues);
        }
        return dictionaryTypes;
    }
}
