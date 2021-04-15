package com.board.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
	
	/** 번호 (PK) */
	private Long idx;
	
	/** ID */
	private String userId;
	
	/** 제목 */
	private String title;

	/** 내용 */
	private String content;

	/** 작성자 */
	private String userName;
	
	/** 비고 */
	private String remark;

	/** 조회 수 */
	private int viewCnt;

	/** 공지 여부 */
	private String noticeYn;

	/** 비밀 여부 */
	private String secretYn;

	/** 삭제 여부 */
	private String deleteYn;

	/** 등록일 */
	private LocalDateTime insertTime;

	/** 수정일 */
	private LocalDateTime updateTime;

	/** 삭제일 */
	private LocalDateTime deleteTime;
	
	
	
}
