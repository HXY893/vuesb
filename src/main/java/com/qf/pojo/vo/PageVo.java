package com.qf.pojo.vo;

public class PageVo {

    private int pagesize;
    private int page;
    private String select_word;

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getSelect_word() {
        return select_word;
    }

    public void setSelect_word(String select_word) {
        this.select_word = select_word;
    }
    public int getOffset(){
        return  (page-1)*pagesize ;
    }
}
