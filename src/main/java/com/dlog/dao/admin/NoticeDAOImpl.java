package com.dlog.dao.admin;

import com.dlog.vo.admin.NoticeVO;
import com.dlog.vo.admin.NoticeViewVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class NoticeDAOImpl implements NoticeDAO {

    @Inject
    private SqlSession sqlSession;

    @Override
    public List<NoticeViewVO> getNoticeList() throws Exception {
        return sqlSession.selectList("NoticeService.getNoticeList");
    }

    @Override
    public List<NoticeVO> getNoticeListNum() throws Exception {
        return sqlSession.selectList("NoticeService.getNoticeListNum");
    }


    @Override
    public NoticeVO getNoticeInfo(int noticeNo) throws Exception {
        return sqlSession.selectOne("NoticeService.getNoticeInfo",noticeNo);
    }

    @Override
    public int insertNotice(NoticeVO noticeVO) throws Exception {
        return sqlSession.selectOne("NoticeService.insertNotice",noticeVO);
    }

    @Override
    public int updateNotice(NoticeVO noticeVO) throws Exception {
        return sqlSession.update("NoticeService.updateNotice",noticeVO);
    }

    @Override
    public int deleteNotice(int noticeNo) throws Exception {
        return sqlSession.delete("NoticeService.deleteNotice", noticeNo);
    }
}
