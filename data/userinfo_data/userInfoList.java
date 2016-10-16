package data.userinfo_data;

import java.util.ArrayList;

import PO.orderPO;
import PO.resultMessage;
import dataservice.userInfo_dataservcie.userInfo_dataService;


public class userInfoList implements userInfo_dataService{
	ArrayList<PO.userPO> userPO;

	@Override
	public resultMessage add_UserInfo(PO.userPO userA) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public resultMessage find_UserInfoList(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public resultMessage modify_UserInfoList(PO.userPO userA) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public resultMessage delete_UserInfoList(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<orderPO> getHistory_UserInfoList(String userID) {
		// TODO Auto-generated method stub
		return null;
	}
}
