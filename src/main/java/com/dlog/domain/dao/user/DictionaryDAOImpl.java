package com.dlog.domain.dao.user;

import com.dlog.domain.vo.user.DictionaryVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class DictionaryDAOImpl implements DictionaryDAO{

    @Inject
    private SqlSession sqlSession;

    @Override
    public List<DictionaryVO> getDictionaryList(int userNo) throws Exception {
        return sqlSession.selectList("DictionaryService.getDictionaryList",userNo);
    }

    @Override
    public List<DictionaryVO> getDictionaryListAll() throws Exception {
        return sqlSession.selectList("DictionaryService.getDictionaryListAll");
    }

    @Override
    public DictionaryVO getDictionaryInfo(int dNo) throws Exception {
        return sqlSession.selectOne("DictionaryService.getDictionaryInfo",dNo);
    }

    @Override
    public int insertDictionary(DictionaryVO dictionaryVO) throws Exception {
        return sqlSession.insert("DictionaryService.insertDictionary",dictionaryVO);
    }

    @Override
    public int updateDictionary(DictionaryVO dictionaryVO) throws Exception {
        return sqlSession.update("DictionaryService.updateDictionary",dictionaryVO);
    }

    @Override
    public int deleteDictionary(int dNo) throws Exception {
        return sqlSession.delete("DictionaryService.deleteDictionary",dNo);
    }
}
