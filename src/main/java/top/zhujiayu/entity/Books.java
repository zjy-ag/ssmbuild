package top.zhujiayu.entity;

import java.io.Serializable;

/**
 * (Books)实体类
 *
 * @author makejava
 * @since 2020-06-29 21:35:59
 */
public class Books implements Serializable {

    private static final long serialVersionUID = -66433493216712843L;
    /**
    * 书id
    */
    private Integer bookid;
    /**
    * 书名
    */
    private String bookname;
    /**
    * 数量
    */
    private Integer bookcounts;
    /**
    * 描述
    */
    private String detail;


    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Integer getBookcounts() {
        return bookcounts;
    }

    public void setBookcounts(Integer bookcounts) {
        this.bookcounts = bookcounts;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}