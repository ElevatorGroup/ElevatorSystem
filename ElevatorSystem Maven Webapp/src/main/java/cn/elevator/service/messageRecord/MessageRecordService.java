package cn.elevator.service.messageRecord;

import java.util.List;


import cn.elevator.entity.MessageRecord;

public interface MessageRecordService {
	public Boolean saveMessageRecord(MessageRecord messageRecord) throws Exception;
	
	public MessageRecord getMessageRecordByPhone(String phoneNumber)throws Exception;
}
