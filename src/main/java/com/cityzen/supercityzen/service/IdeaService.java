package com.cityzen.supercityzen.service;

import com.cityzen.supercityzen.entity.Category;
import com.cityzen.supercityzen.entity.Idea;
import com.cityzen.supercityzen.entity.Project;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class IdeaService {

    Idea createIdea(Long userId, Idea idea) {
        return null;
    }

    Idea createIdea(Long userId, Idea idea, List<Category> categories) {
        return null;
    }

    Idea updateIdea(Long ideaId, Long userId, Idea idea) {
        return null;
    }

    void updateIsClosed(Long ideaId, boolean isClosed) {

    }

    void addCategory(Idea idea, Category category) {

    }

    void removeCategory(Idea idea, Category category) {

    }

    void closeIdea(Idea idea) {

    }

    Project toProject(Long userId, Long ideaId, LocalDate votationEndDate) {
        return null;
    }
}
