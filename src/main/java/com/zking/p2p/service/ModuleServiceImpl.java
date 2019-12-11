package com.zking.p2p.service;

import com.zking.p2p.mapper.ModuleMapper;
import com.zking.p2p.model.Module;
import com.zking.p2p.util.DataProtocol;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dong
 * @create 2019-12-1011:39
 */
@Service
public class ModuleServiceImpl implements ModuleService {


    @Resource
    private ModuleMapper moduleMapper;


       /* @Override
        public List<Module> getModules(String pid) {
            List<Module> myl = moduleMapper.getModulesAll();//第一级

            for (Module m : myl) {
                List<Module> lis = moduleMapper.getModules(m.getId());//子类
                m.setChildrens(lis);

            }

        return myl;
    }*/

    @Override
    public List<Module> getModulesAll() {
        List<Module> myl = moduleMapper.getModulesAll();//第一级

        for (Module m : myl) {
            List<Module> lis = moduleMapper.getModules(m.getId());//子类
            m.setChildrens(lis);

        }

        return myl;
    }
}
