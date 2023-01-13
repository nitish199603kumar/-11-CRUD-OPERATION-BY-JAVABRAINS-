package in.nitish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.nitish.pojo.Topic;
import in.nitish.service.TopicServiceImpl;

@RestController
public class TopicController {
	
	
	
	
	@Autowired
	private TopicServiceImpl topicServiceImpl;

	@RequestMapping("/topiclist")
	public List<Topic> topicList()
	{
		List<Topic> topicList = topicServiceImpl.topicList();
		return topicList;
				
	}
	
	@RequestMapping("/topiclistbyid/{topicid}")
	public Topic getTopicsById(@PathVariable("topicid") String id) {
		
		return topicServiceImpl.getTopicsById(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addpost")
	public String addPost(@RequestBody Topic topic)
	{
		String addPost = topicServiceImpl.addPost(topic);
		return addPost;
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/updatetopic/{id}")
	public String updateTopic(@RequestBody Topic topic,@PathVariable String id)
	{
		String updateTopic = topicServiceImpl.updateTopic(topic, id);
		return updateTopic;
				
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteTopic/{id}")
	public String deleteTopics(@PathVariable String id) {
		
		String deleteTopics = topicServiceImpl.deleteTopics(id);
		return deleteTopics;
	}
}
