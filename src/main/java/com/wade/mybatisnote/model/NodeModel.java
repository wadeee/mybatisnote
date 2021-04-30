package com.wade.mybatisnote.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NodeModel implements Serializable {

    private Integer id;
    private String name;
    private List<NodeModel> children;

}
