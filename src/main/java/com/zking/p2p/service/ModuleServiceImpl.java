package com.zking.p2p.service;

import com.zking.p2p.mapper.ModuleMapper;
import com.zking.p2p.model.Module;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dong
 * @create 2019-12-1011:39
 */
@Service
public class ModuleServiceImpl implements ModuleService{


    @Resource
    private ModuleMapper moduleMapper;


    @Override
    public List<Module> getModules(int pid) {
        return moduleMapper.getModules(-1);
    }
}
