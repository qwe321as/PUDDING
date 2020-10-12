package Music.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Music.model.Dj;
import Music.model.DjDao;
import Music.model.Music;
import Music.model.MusicDao;


@Controller
public class Dj_add {
	final String command = "addDj.ms";
	final String getPage = "add_Dj";
	final String gotoPage = "redirect:/Djlist.ms";
	@Autowired
	MusicDao dao;
		@Autowired
	DjDao daodj;
	
@RequestMapping(value = command,method = RequestMethod.GET)
public ModelAndView doAction() {
	ModelAndView mav = new ModelAndView();
	List<Music> lists = dao.getDataList();
	mav.addObject("lists", lists);
	mav.setViewName(getPage);
	return mav;
	}
@RequestMapping(value = command,method = RequestMethod.POST)
public ModelAndView doAction(Dj dj) {
	System.out.println(dj.getDj_list());
	ModelAndView mav = new ModelAndView();
	daodj.insertData(dj);
	mav.setViewName(gotoPage);
	return mav;
}

}
