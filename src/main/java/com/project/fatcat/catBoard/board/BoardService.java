package com.project.fatcat.catBoard.board;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	
	private final BoardRepository boardRepository;
	
	public List<Board> boardList(){
		
		return boardRepository.findAll();
	}
	
	public Board getBoard(Integer id) {
		
		return boardRepository.getById(id);
		
	}

}
