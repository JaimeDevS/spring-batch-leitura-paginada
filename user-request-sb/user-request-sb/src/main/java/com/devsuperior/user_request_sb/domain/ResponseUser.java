package com.devsuperior.user_request_sb.domain;

import java.util.List;

import com.devsuperior.user_request_sb.dto.UserDTO;

public class ResponseUser {

	//OBS: é importante esse nome corresponder ao retorno da API
	private List<UserDTO> content;

	public List<UserDTO> getContent() {
		return content;
	}

}
