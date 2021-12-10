package com.quangnv.uet.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
	private UserDto userDto;
	private String content;
	private Date createAt;
	private Integer rate;
}
