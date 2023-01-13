package in.nitish.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import in.nitish.pojo.Topic;

@Service
public class TopicServiceImpl implements TopicInterface {
	
	List<Topic> listTopic=Arrays.asList(
			new Topic("spring","Spring Framework","Spring is a java Framework"),
			new Topic("java","Core Java","Java is a programming language"),
			new Topic("Hibernate","Hibernate Framework","Hibernate is also a framework of db")
			
			);
	
//	List<Topic> listTopic=new ArrayList<Topic>();
//	
//	Topic topic1=new Topic("spring","Spring Framework","Spring is a java Framework");
//	Topic topic2=new Topic("java","Core Java","Java is a programming language");
//	Topic topic3=new Topic("Hibernate","Hibernate Framework","Hibernate is also a framework of db");
//	
//	listTopic.

	@Override
	public List<Topic> topicList() {
		
		return listTopic ;
	}

	@Override
	public Topic getTopicsById(String id) {
//		List<Topic> lst=null;
//		for(Topic topic:listTopic)
//		{
//			if(topic.getId().equals(id))
//			{
//			//	ArrayList lst = new ArrayList<>();
//				System.out.println(topic.getId());
//				System.out.println(topic.getName());
//				System.out.println(topic.getDescription());
//			}
//		}
//		
		
		return listTopic.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
		
	}

	@Override
	public String updateTopic(Topic topic, String id) {
		for(int i=0;i<listTopic.size();i++)
		{
			Topic topiclst = listTopic.get(i);
			if(topiclst.getId().equals(id))
			{
				listTopic.set(i, topic);
			}
			
		}
		return "Updated" ;
			
	}

	@Override
	public String deleteTopics(String id) {
		for(int i=0;i<listTopic.size();i++)
		{
			Topic topic = listTopic.get(i);
			if(topic.getId().equals(id))
			{
				listTopic.remove(i);
			}
		
			
		}
		return id;
	}

	@Override
	public String addPost(Topic topic) {
		boolean add = listTopic.add(topic);
		return "Record Inserted";
	}

}
