package sec06.exam03;

import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","ȫ�浿"));
		messageQueue.offer(new Message("sendSMS","�ſ��"));
		messageQueue.offer(new Message("sendKakaotalk","ȫ�β�"));
		
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;

			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
				
			case "sendKakaotalk":
				System.out.println(message.to + "������ īī������ �����ϴ�.");
				break;
			}
		}
	}

}
