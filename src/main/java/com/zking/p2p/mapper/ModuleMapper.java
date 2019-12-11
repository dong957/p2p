package com.zking.p2p.mapper;

import com.zking.p2p.model.Module;

import java.util.List;

/**
 * @author dong
 * @create 2019-12-1011:37
 */
public interface ModuleMapper {


    /**
     * 树形菜单
     * @param pid
     * @return
     */
    public List<Module> getModules(String pid) ;

    public List<Module> getModulesAll();//第一级


}
