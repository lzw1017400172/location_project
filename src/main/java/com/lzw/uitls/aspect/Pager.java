package com.lzw.uitls.aspect;

import java.io.Serializable;
import java.util.List;

public class Pager<T> implements Serializable {

    @Override
    public String toString() {
        return "Pager [pageNO=" + pageNO + ", startIndex=" + startIndex
                + ", pageSize=" + pageSize + ", totalCount=" + totalCount
                + ", result=" + result + ", totalPage=" + totalPage + "]";
    }

    private int pageNO;

    private int startIndex;

    private int pageSize = 12;

    private int totalCount;

    private List<T> result;

    private int totalPage;


    public Pager(){

    }
    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }



    public Pager(int startIndex, int pageSize,int totalCount,List<T> result){
        this.startIndex = startIndex;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.result = result;


    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        //算出总页数
        if ((totalCount%pageSize) > 0) {
            this.totalPage = (totalCount / pageSize) + 1;
        } else {
            this.totalPage = totalCount / pageSize;
        }

        this.totalCount = totalCount;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getPageNO() {
        return pageNO;
    }

    public void setPageNO(int pageNO) {
        if (pageNO <=1 ) {
            this.startIndex = 0;
        } else {
            this.startIndex = (pageNO -1)* pageSize;
        }
        this.pageNO = pageNO;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

}
