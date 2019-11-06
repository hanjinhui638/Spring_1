package com.jh.s1.notice;

import java.util.List;

public class NoticeService {

	/* noticeservice는 dao객체 필요 */
	
	private NoticeDAO noticeDAO;
	
	public NoticeService() {
			this.noticeDAO = new NoticeDAO();
	}
	
	
	
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
