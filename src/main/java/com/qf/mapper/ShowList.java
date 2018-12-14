package com.qf.mapper;


import com.qf.pojo.po.ListPo;
import com.qf.pojo.vo.EditVo;
import com.qf.pojo.vo.PageVo;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface ShowList {
    //通过vo查询当前页集合
    List<ListPo> showListByVo(@Param("pageVo") PageVo pageVo);
    //所有总页数
    Long countByVo(@Param("pageVo") PageVo pageVo);
    //增加
    int addList(ListPo addPo);
    //更改
    int edit(EditVo editVo);
    //删除
    int delAll(ArrayList<Integer> ids);
    //删除一个
    int delOne(Integer id);

}
