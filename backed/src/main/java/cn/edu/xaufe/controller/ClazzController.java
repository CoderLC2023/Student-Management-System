package cn.edu.xaufe.controller;

import cn.edu.xaufe.common.ServerResponse;
import cn.edu.xaufe.entity.Clazz;
import cn.edu.xaufe.service.IClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ Author     ：Negen
 * @ Date       ：Created in 16:27 2020/3/6
 * @ Description：班级信息控制类
 * @ Modified By：
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "clazz")
public class ClazzController {
    @Autowired
    IClazzService clazzService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    ServerResponse addClazz(@RequestBody Clazz clazz){
        return clazzService.addClazz(clazz);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    ServerResponse listClazz(){
        return clazzService.listAllClazz();
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    ServerResponse updateClazz(@RequestBody Clazz clazz){
        return clazzService.updateClazz(clazz);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    ServerResponse deleteClazz(@PathVariable("id")Long id){
        return clazzService.deleteClazz(id);
    }

    @RequestMapping(value = "grades", method = RequestMethod.GET)
    ServerResponse getAllGrade(){return clazzService.getAllGrade();}

    @RequestMapping(value = "clazzs", method = RequestMethod.GET)
    ServerResponse getAllCalzz(@RequestParam("grade") String grade){return clazzService.getAllClazz(grade);}

}
