package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDto {

	
	private String id;
	@JsonProperty("Name")
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
