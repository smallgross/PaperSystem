package com.service;

import com.pojo.Paper;

import java.util.List;

public interface PaperService {
    /**
     * 增加接口
     * @param paper
     * @return
     */
    int addPaper(Paper paper);
    /**
     * 删除接口
     */
    int deletePaperById(long id);
    /**
     * 修改接口
     */
    int updatePaper(Paper paper);

    /**
     *
     */
    Paper queryById(long id);
    /**
     *
     */
    List<Paper> queryAllPaper();
}
