package com.example.demo.app.inquiry;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
 * This is completed in Easy mode. If you want to practice, please delete this file.
 * イージーモードではこちらは完成させてあります。作成を練習したい場合は一度ファイルごと削除してください。
 */
public class InquiryForm{

	@Size(min = 1, max = 20, message = "Please input 20characters or less")
	private String name;

	@NotNull
	@Email(message = "invalid E-mail Format")
	private String email;

	@NotNull
	private String contents;

	public InquiryForm() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
}