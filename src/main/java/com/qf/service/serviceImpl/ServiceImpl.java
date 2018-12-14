package com.qf.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.qf.mapper.ShowList;
import com.qf.pojo.po.ListPo;
import com.qf.pojo.vo.EditVo;
import com.qf.pojo.vo.PageVo;
import com.qf.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    /**
     *
     * @param pageVo
     * @return Json count总页数 当前页集合
     */
    @Autowired
    private ShowList showList;
    @Override
    public JSONObject ListByVo(PageVo pageVo) {
        //创建JSONobject 封装数据
        JSONObject json=new JSONObject();
        Long count = showList.countByVo(pageVo);
        List<ListPo> list = showList.showListByVo(pageVo);
        json.put("count",count);
        json.put("list",list);
        return json;
    }
    //增加
    @Override
    public int addList(ListPo addPo) {
        DateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date = dateFormat.format(new Date());
        addPo.setUpdated(date);
        addPo.setCreated(date);
        System.out.println(addPo);
        return showList.addList(addPo);
    }

    @Override
    public int edit(EditVo editVo) {
        DateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date = dateFormat.format(new Date());
        editVo.setUpdated(date);
        System.out.println(editVo);
        return showList.edit(editVo);
    }

    @Override
    public int delAll(ArrayList<Integer> ids) {
        return showList.delAll(ids);
    }

    @Override
    public int delOne(Integer id) {
        return showList.delOne(id);
    }


}

