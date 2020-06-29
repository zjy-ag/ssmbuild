package top.zhujiayu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import top.zhujiayu.entity.Books;
import top.zhujiayu.service.BooksService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Books)表控制层
 *
 * @author makejava
 * @since 2020-06-29 21:36:03
 */
@Controller
public class BooksController {
    /**
     * 服务对象
     */
    @Resource
    private BooksService booksService;

    @RequestMapping("/selectOne")
    public String selectOne(Model model) {
        Books book = booksService.queryById(1);
        model.addAttribute("book", book);
        return "selectOne";
    }

}