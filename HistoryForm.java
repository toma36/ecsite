package jp.co.internous.ecsite.model.form;

import java.io.Serializable;
//照会する購入者の情報
public class HistoryForm implements Serializable {
	private static final long serialVersionUID=1L;

	private String userId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId=userId;
	}
}
