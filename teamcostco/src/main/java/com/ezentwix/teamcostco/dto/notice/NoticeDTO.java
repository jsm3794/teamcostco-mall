package com.ezentwix.teamcostco.dto.notice;

import java.util.Date;

import lombok.Data;

@Data
public class NoticeDTO {

    private Integer notice_id;
    private String title;
    private String content;
    private String job_title;
    private Date create_date;
    private Date update_date;
}
