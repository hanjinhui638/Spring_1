package com.jh.s1.notice;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
	/* noticeservice는 dao객체 필요 */
	
	@Inject
	@Qualifier("n1")
	private NoticeDAO noticeDAO;
	
	//@Inject
	public NoticeService(NoticeDAO noticeDAO) {
		this.noticeDAO = noticeDAO;
	}
	
	
	
	/*
	 * @Inject public void setNoticeDAO(NoticeDAO noticeDAO) { this.noticeDAO =
	 * noticeDAO; }
	 */

	public int noticeWrite(NoticeDTO noticeDTO)throws Exception{
			int result = noticeDAO.noticeWrite(noticeDTO);
			  return result;
		
	}
	
	public NoticeDTO noticeSelect(int num)throws Exception{
		NoticeDTO noticeDTO = noticeDAO.noticeSelect(num);
		return noticeDTO;
		
	}
	
	public List<NoticeDTO> noticeList()throws Exception{
		List<NoticeDTO> ar= noticeDAO.noticeList();
		return ar;
		
	}
}
