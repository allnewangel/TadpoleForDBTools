package com.hangum.db.dao.system;

import java.util.Date;


/**
 * user_db_resource dao
 * 
 * @author hangum
 *
 */
public class UserDBResourceDAO {
	int seq;
	/** sql, erd */
	String type;
	int user_seq;
	int db_seq;
	String filepath;
	String filename;
	Date create_time;
	String delYn;
	
	// db object tree 표현을 위해
	UserDBDAO parent;
	
	public UserDBResourceDAO() {
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUser_seq() {
		return user_seq;
	}

	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}

	public int getDb_seq() {
		return db_seq;
	}

	public void setDb_seq(int db_seq) {
		this.db_seq = db_seq;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public UserDBDAO getParent() {
		return parent;
	}

	public void setParent(UserDBDAO parent) {
		this.parent = parent;
	}
	
	

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	@Override
	public String toString() {
		return "UserDBResourceDAO [seq=" + seq + ", type=" + type
				+ ", user_seq=" + user_seq + ", db_seq=" + db_seq
				+ ", filepath=" + filepath + ", filename=" + filename
				+ ", create_time=" + create_time + ", parent=" + parent + "]";
	}

}
