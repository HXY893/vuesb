package com.qf.service;

import com.alibaba.fastjson.JSONObject;
import com.qf.pojo.po.ListPo;
import com.qf.pojo.vo.EditVo;
import com.qf.pojo.vo.PageVo;

import java.util.ArrayList;

public interface Service {
    //查询 分页
    JSONObject ListByVo(PageVo pageVo);
    //增加
    int addList(ListPo addPo);
    //更改
    int edit(EditVo editVo);
    //删除所有
    int delAll(ArrayList<Integer> ids);
    //删除一个
    int delOne(Integer id);

}
