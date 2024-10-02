package com.cityzen.supercityzen.service;

import com.cityzen.supercityzen.entity.Discussion;
import com.cityzen.supercityzen.entity.Idea;
import com.cityzen.supercityzen.entity.User;
import org.springframework.stereotype.Service;

@Service
public class DiscussionService {
    Discussion postToSubject(User user, Idea idea, String message) {
        return null;
    }

    Discussion respondToDiscussion(User user, Discussion discussion) {
        return null;
    }

    Discussion editDiscussion(int discussionId, User user, Discussion discussion) {
        return null;
    }
}
