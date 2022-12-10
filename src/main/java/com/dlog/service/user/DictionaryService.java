package com.dlog.service.user;

import com.dlog.domain.vo.user.DictionaryVO;

import java.util.List;

public interface DictionaryService {
    // 해당 유저의 사전리스트 가져오기
    public List<DictionaryVO> getDictionaryList(int userNo) throws Exception;

    // 모든 사전 리스트 가져오기
    public List<DictionaryVO> getDictionaryListAll() throws Exception;

    // 해당 사전번호에 해당하는 사전 내용가져오기
    public DictionaryVO getDictionaryInfo(int dNo) throws Exception;

    // 사전 추가
    public void insertDictionary(DictionaryVO dictionaryVO) throws Exception;

    // 사전 수정
    public void updateDictionary(DictionaryVO dictionaryVO) throws Exception;

    // 사전 삭제
    public void deleteDictionary(int dNo) throws Exception;
}
