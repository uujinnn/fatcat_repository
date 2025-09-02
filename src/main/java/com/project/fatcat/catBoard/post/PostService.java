package com.project.fatcat.catBoard.post;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.fatcat.catBoard.board.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
	
	private final PostRepository postRepository;
	private final BoardRepository boardRepository;
	
	public List<Post> postList(Integer id){
		return postRepository.findAllBy
	}

}
