package com.project.fatcat.catBoard.comment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("comment")
public class CommentController {
	
	private final CommentService commentService;
	
	

}
