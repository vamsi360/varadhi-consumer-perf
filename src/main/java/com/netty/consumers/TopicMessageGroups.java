package com.netty.consumers;

import com.netty.domain.MessageGroup;
import com.netty.domain.Topic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by vamsi on 10/7/17.
 */
public class TopicMessageGroups {

    private final Topic topic;
    private final Set<MessageGroup> messageGroups = new HashSet<>();

    public TopicMessageGroups(Topic topic) {
        this.topic = topic;
    }

    public void addMessageGroup(MessageGroup messageGroup) {
        this.messageGroups.add(messageGroup);
    }

    public void addMessageGroups(List<MessageGroup> messageGroups) {
        this.messageGroups.addAll(messageGroups);
    }

    public Set<MessageGroup> getMessageGroups() {
        return this.messageGroups;
    }

    public Topic getTopic() {
        return this.topic;
    }
}
