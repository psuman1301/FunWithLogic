package com.suman.ashish.service;

import java.util.List;

public interface LogicalService {
    public String getStringSolution(String id,String str);

    public String getNumberSolution(String id, Integer no);

    public List<Integer> getArraySolution(String id, List arr);
}
