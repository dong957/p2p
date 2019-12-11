package com.zking.p2p.controller;

import com.zking.p2p.model.Module;
import com.zking.p2p.service.ModuleService;
import com.zking.p2p.util.DataProtocol;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dong
 * @create 2019-12-1012:10
 */
@RestController
public class ModuleController {
    @Resource
    private ModuleService ModuleService;

    @RequestMapping("/root/module")
    public Object getModules(){

        List<Module> myl=ModuleService.getModulesAll();//根据pid查询
        DataProtocol data=new DataProtocol();
       /*  if(myl !=null && myl.size()>=0){
            for(Module m:myl) {
                if (m.getPid().equals("-1")) {
                    List<Module> lis = ModuleService.getModules(m.getId());
                    m.setChildrens(lis);'
                      data.setCode(DataProtocol.success);
                      data.setData(myl);
                      data.setMessage("操作成功");


                }
            }
        }else {

         }
*/
        data.setCode(DataProtocol.success);
        data.setData(myl);
        data.setMessage("操作成功");


        return data;

    }

}
