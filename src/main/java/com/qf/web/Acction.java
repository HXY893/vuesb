package com.qf.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qf.pojo.po.ListPo;
import com.qf.pojo.vo.EditVo;
import com.qf.pojo.vo.PageVo;
import com.qf.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class Acction {
    @Autowired
    private Service service;
    /**
     *
     * @param pageVo page pagesize search参数
     * @return 表格Json
     */
    @RequestMapping("/userLists")
    @ResponseBody
    public JSONObject List(@RequestBody PageVo pageVo){
//        System.out.println(pageVo.getSelect_word());
//        System.out.println(pageVo.getPagesize());
//        System.out.println(pageVo.getPage());
        JSONObject json = service.ListByVo(pageVo);
//        System.out.println(json);
        return json;
    }
    //批量删除
    @ResponseBody
    @RequestMapping("/deleteUsers")
    @Transactional
    public int delUser(@RequestBody JSONObject jsonObject){
        Object ids = jsonObject.get("ids");
        ArrayList<Integer> arrayList= (ArrayList<Integer>) ids;
        System.out.println(ids);
        //条件判断
        int delAll = service.delAll((ArrayList<Integer>) ids);
        if(delAll>0){
            return 1;
        }
        return 0 ;
    }
    //删除
    @RequestMapping("/deleteUser")
    @ResponseBody
    public int delOne(@RequestBody JSONObject jsonObject){
        JSONObject data = jsonObject.getJSONObject("data");
        Integer id = data.getInteger("id");
        int i = service.delOne(id);
        return i;
    }

    //编辑
    @RequestMapping("/editUser")
    @ResponseBody
    public int edit(@RequestBody EditVo editVo){
        //System.out.println(editVo);
        int editNum = service.edit(editVo);
        return 1;
    }
    //增加
    @RequestMapping("/addUser")
    @ResponseBody
    public int add(@RequestBody ListPo addPo){
        System.out.println(addPo.getReceiver_name());
        int addNum = service.addList(addPo);
        return addNum;
    }








    //批量删除
//    @ResponseBody
//    @DeleteMapping(value = "/deleteUsers",produces = "application/json;charset=UTF-8")
//    @Transactional
//    public int deleteUsers(@RequestBody JSONObject jsonObject){
//        String str = jsonObject.getString("ids");
//        String[] str_split = str.split(",");
//
//        try{
//            for(String s: str_split){
//                int id= Integer.parseInt(s);
//                service.removeUser(id);
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//            return 0;
//        }
//        return 1 ;
//    }


}
