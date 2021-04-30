package com.wade.mybatisnote.mapper;

import com.wade.mybatisnote.model.NodeModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NodeMapper {

    List<NodeModel> getNodeTree();


}