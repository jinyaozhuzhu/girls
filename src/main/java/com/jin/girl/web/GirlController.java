package com.jin.girl.web;

import com.jin.girl.entity.Girl;
import com.jin.girl.entity.Result;
import com.jin.girl.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by jinyao on 2017/1/12.
 */

@RestController
public class GirlController {

    @Autowired
    private GirlService girlService;

    /**
     * 查询女生列表
     *
     * @return
     */
    @GetMapping("/girls")
    public List<Girl> girlList() {
        return girlService.findAll();
    }

    /**
     * 添加一个女孩
     *
     * @param girl
     * @return
     */
    @PostMapping("/girls")
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            String errorMessage = bindingResult.getFieldError().getDefaultMessage();
            return new Result<>(-1, errorMessage, null);
        }
        return new Result<>(1, "成功", null);
    }

    /**
     * 查询一个女生
     *
     * @param id
     * @return
     */
    @GetMapping("/girls/{id}")
    public Girl findById(@PathVariable("id") Integer id) {
        System.out.print(id);
        return girlService.findOne(id);
    }


    /**
     * 更新一条记录
     * @param girl
     * @param bindingResult
     * @return
     */
    @PutMapping("/girls/{id}")
    public Result<Girl> girlUpdate(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            String errorMessage = bindingResult.getFieldError().getDefaultMessage();
            return new Result<>(-1, errorMessage, null);
        }
        return new Result<>(1, "成功", null);
    }


    @DeleteMapping("/girls/{id}")
    public void Delete(@PathVariable("id") Integer id) {
        girlService.delete(id);
    }

    /**
     * 异常的统一处理测试，当异常发生时，会直接ExceptionHandle的handler方法
     * 这个请求的结果也就是handler方法的返回结果。
     *
     * @param id
     * @throws Exception
     */
    @GetMapping(value = "girls/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception {
        girlService.getAge(id);
    }

}
