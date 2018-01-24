package cn.elevator.service.messageRecord;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.elevator.dao.messageRecord.MessageRecordMapper;
import cn.elevator.entity.MessageRecord;

@Service
public class MessageRecordServiceImpl implements MessageRecordService {
	@Resource
	private MessageRecordMapper messageRecordMapper;

	@Override
	public Boolean saveMessageRecord(MessageRecord messageRecord)
			throws Exception {
		Boolean flag = false;
		if (messageRecordMapper.saveMessageRecord(messageRecord) > 0)
			flag = true;
		return flag;
	}
/**
 * 如果数据库有多条验证码记录，取最新的那条，判断是否过期
 */
	@Override
	public MessageRecord getMessageRecordByPhone(String phoneNumber)
			throws Exception {
		// TODO Auto-generated method stub
		List<MessageRecord> recordList=messageRecordMapper.getMessageRecordByPhone(phoneNumber);
		MessageRecord messageRecord=null ;
		long gap=Long.MAX_VALUE;
		Date currDate=new Date();
		if(recordList.size()>0){
			for (MessageRecord record : recordList) {
				 long tm=Math.abs(currDate.getTime()-record.getSendTime().getTime());
				 if(gap>tm){
			            gap=tm;
			            messageRecord=record;
			        }
			}
		}
		return messageRecord;
	}

}
