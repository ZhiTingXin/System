package data.advicefeedback_data;

import java.util.ArrayList;

import PO.advicePO;
import PO.resultMessage;
import dataservice.advicefeedback_dataservice.adviceFeedBack_dataService;

public class adviceList implements adviceFeedBack_dataService {
	ArrayList<PO.advicePO> adviceList;

	@Override
	public resultMessage add_advice(advicePO advice1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public advicePO find_advice(advicePO advice1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<advicePO> show_advice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public resultMessage modify_advice(advicePO advice1) {
		// TODO Auto-generated method stub
		return null;
	}
}
