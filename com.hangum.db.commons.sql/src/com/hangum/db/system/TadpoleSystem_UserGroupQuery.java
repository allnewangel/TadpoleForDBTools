package com.hangum.db.system;

import java.util.List;

import org.apache.log4j.Logger;

import com.hangum.db.commons.session.SessionManager;
import com.hangum.db.commons.sql.TadpoleSQLManager;
import com.hangum.db.dao.system.UserDBDAO;
import com.hangum.db.dao.system.UserGroupDAO;
import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * user_db table 관련 
 * 
 * @author hangum
 *
 */
public class TadpoleSystem_UserGroupQuery {
	private static final Logger logger = Logger.getLogger(TadpoleSystem_UserGroupQuery.class);
	
	/**
	 * user group이 있는지 검사한다.
	 * 
	 * @param name
	 * @return
	 */
	public static boolean isUserGroup(String name) {
		UserGroupDAO group = new UserGroupDAO();
		group.setName(name);
		
		try {
			SqlMapClient sqlClient = TadpoleSQLManager.getInstance(TadpoleSystemConnector.getUserDB());
			List<UserGroupDAO> isUserDB = (List<UserGroupDAO>)sqlClient.queryForList("isUserGroup", group);
			
			if(isUserDB.size() >= 1) {
				return true;
			} else {
				return false;
			}
		} catch(Exception e) {
			return false;
		}
		
	}
	
	/**
	 * 신규 유저를 등록합니다.
	 * @param email
	 * @param pass
	 * @param name
	 * @param type user-type
	 */
	public static int newUserDB(String name) throws Exception {
		UserGroupDAO group = new UserGroupDAO();
		group.setName(name);
		
		// 기존에 등록 되어 있는지 검사한다
		SqlMapClient sqlClient = TadpoleSQLManager.getInstance(TadpoleSystemConnector.getUserDB());
		List<UserGroupDAO> isUserDB = (List<UserGroupDAO>)sqlClient.queryForList("isUserGroup", group); //$NON-NLS-1$
		
		// 존재하
		if(isUserDB.size() >= 1) {
			return -999;
		}

		// 신규 유저를 등록합니다.
		Integer seq = (Integer)sqlClient.insert("newGroup", group); //$NON-NLS-1$
		
		return seq.intValue();
	}
	
	public static List<UserGroupDAO> getGroup() throws Exception {
		SqlMapClient sqlClient = TadpoleSQLManager.getInstance(TadpoleSystemConnector.getUserDB());
		return (List<UserGroupDAO>)sqlClient.queryForList("userDBList"); //$NON-NLS-1$
	}
	
//	public static void removeUserDB(int seq) throws Exception {
//		SqlMapClient sqlClient = TadpoleSQLManager.getInstance(TadpoleSystemConnector.getUserDB());
//		sqlClient.delete("userDBDelete", seq); //$NON-NLS-1$
//		sqlClient.delete("userDBErdDeleteAtDB", seq); //$NON-NLS-1$
//	}
}
