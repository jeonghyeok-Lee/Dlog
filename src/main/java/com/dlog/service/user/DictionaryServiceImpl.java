package com.dlog.service.user;

import com.dlog.domain.dao.user.DictionaryDAO;
import com.dlog.domain.vo.user.DictionaryVO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service("DictionaryServiceImpl")
public class DictionaryServiceImpl implements DictionaryService{

    @Inject
    private DictionaryDAO dictionaryDAO;

    @Override
    public List<DictionaryVO> getDictionaryList(int userNo) throws Exception {
        return dictionaryDAO.getDictionaryList(userNo);
    }

    @Override
    public List<DictionaryVO> getDictionaryListAll() throws Exception {
        return dictionaryDAO.getDictionaryListAll();
    }

    @Override
    public DictionaryVO getDictionaryInfo(int dNo) throws Exception {
        return dictionaryDAO.getDictionaryInfo(dNo);
    }

    @Override
    public void insertDictionary(DictionaryVO dictionaryVO) throws Exception {
        dictionaryDAO.insertDictionary(dictionaryVO);
    }

    @Override
    public void updateDictionary(DictionaryVO dictionaryVO) throws Exception {
        dictionaryDAO.updateDictionary(dictionaryVO);
    }

    @Override
    public void deleteDictionary(int dNo) throws Exception {
        dictionaryDAO.deleteDictionary(dNo);
    }
}
