package cn.elevator.dao.messageRecord;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.MessageRecord;


public interface MessageRecordMapper {
	public int saveMessageRecord(MessageRecord messageRecord)throws Exception;
	
	public List<MessageRecord> getMessageRecordByPhone(@Param("phoneNumber")String phoneNumber)throws Exception;
}
