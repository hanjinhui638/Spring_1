package com.jh.s1.notice;

import java.util.List;

public class NoticeService {

	/* noticeservice는 dao객체 필요 */
	
	private NoticeDAO noticeDAO;
	
	public NoticeService() {
			this.noticeDAO = new NoticeDAO();
	}
	
	
	
	public void noticeWrite()throws Exception{
				
			  
		
	}
	
	public NoticeDTO noticeSelect()throws Exception{
		int num = 0;
		NoticeDTO noticeDTO = noticeDAO.noticeSelect(num);
		return noticeDTO;
		
	}
	
	public List<NoticeDTO> noticeList()throws Exception{
		List<NoticeDTO> ar= noticeDAO.noticeList();
		return ar;
		
	}
}
