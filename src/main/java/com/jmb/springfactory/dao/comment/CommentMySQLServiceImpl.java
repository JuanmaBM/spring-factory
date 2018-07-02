package com.jmb.springfactory.dao.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.jmb.springfactory.dao.GenericMySQLServiceImpl;
import com.jmb.springfactory.model.entity.Comment;

@Service
public class CommentMySQLServiceImpl extends GenericMySQLServiceImpl<Comment, Integer> implements CommentMySQLService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public JpaRepository<Comment, Integer> getRepository() {
        return commentRepository;
    }

    @Override
    public List<Comment> findByTask(final Integer idTask) {
        return commentRepository.findByTask_Id(idTask);
    }
}
