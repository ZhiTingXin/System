package dataservice.userInfo_dataservcie;

import java.util.ArrayList;

import PO.resultMessage;

public interface userInfo_dataService {
	public resultMessage add_UserInfo(PO.userPO userA);
	public resultMessage find_UserInfoList(String userID);
	public resultMessage modify_UserInfoList(PO.userPO userA);
	public resultMessage delete_UserInfoList(String userID);
	public ArrayList<PO.orderPO> getHistory_UserInfoList (String userID);
}
