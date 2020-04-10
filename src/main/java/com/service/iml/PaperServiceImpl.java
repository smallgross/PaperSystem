package com.service.iml;

import com.pojo.Paper;
import com.service.PaperService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {


    @Override
    public int addPaper(Paper paper) {
        return 0;
    }

    @Override
    public int deletePaperById(long id) {
        return 0;
    }

    @Override
    public int updatePaper(Paper paper) {
        return 0;
    }

    @Override
    public Paper queryById(long id) {
        return null;
    }

    @Override
    public List<Paper> queryAllPaper() {
        return null;
    }
}
