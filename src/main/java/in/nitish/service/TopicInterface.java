package in.nitish.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import in.nitish.pojo.Topic;

public interface TopicInterface {
	public List<Topic> topicList();
	public Topic getTopicsById(String id);
	public String updateTopic( Topic topic, String id);
	public String deleteTopics(String id);
	public String addPost(@RequestBody Topic topic);

}
