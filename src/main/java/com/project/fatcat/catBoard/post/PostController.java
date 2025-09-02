package com.project.fatcat.catBoard.post;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("post")
public class PostController {
	
	private final PostService postService;
	
	

}
