package com.controllers;

import com.dao.CliDao;
import com.models.Client;
import com.validators.CliValidator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CliController {

    CliDao userDao;
    CliValidator userVal;

    public CliController() {
        this.userVal = new CliValidator();
        this.userDao = new CliDao();
    }

    //Method to View All Users
    /**
     *
     * @return this method return a ModelAndView object
     *
     */
    @RequestMapping(value = "view_all.htm", method = RequestMethod.GET)
    public ModelAndView viewTeachers() {
        ModelAndView mav = new ModelAndView();
        List listTeach = userDao.viewAllTeacher();
        mav.addObject("teachers", listTeach);
        mav.setViewName("views/view_all");
        return mav;
    }

    //This method call the view to add a teacher
    @RequestMapping(value = "add.htm", method = RequestMethod.GET)
    public ModelAndView addTeacher() {
        ModelAndView mav = new ModelAndView();
        Client newTeacher = new Client();
        mav.addObject("newTeacher", newTeacher);
        mav.setViewName("views/add");

        return mav;
    }

    //This method allow add user in the DB
    /**
     * @param cli receives a client that create a new user.
     * @return this method return a ModelAndView object
     *
     */
    @RequestMapping(value = "add.htm", method = RequestMethod.POST)
    public ModelAndView addTeacher(Client cli) {
        ModelAndView mav = new ModelAndView();
        userDao.addTeacher(cli);
        mav.setViewName("redirect:/view_all.htm");
        return mav;
    }

    //This method call the view to update a teacher.
    /**
     * @param req this param receives the user's id 
     * @return this method return a ModelAndView object
     *
     */
    @RequestMapping(value = "update.htm", method = RequestMethod.GET)
    public ModelAndView updateTeacher(HttpServletRequest req) {
        ModelAndView mav = new ModelAndView();
        int user_id = Integer.parseInt(req.getParameter("id"));
        Client userInfo = userDao.updateTeacherGet(user_id);
        mav.addObject("teach", new Client(user_id, userInfo.getTh_name(), userInfo.getTh_lastname(), userInfo.getTh_mail(), userInfo.getTh_phone(), userInfo.getTh_subject()));
        //error when I add '.htm', but in the url, shows htm
        mav.setViewName("views/update");

        return mav;
    }

    //This method update a user in the database.
    /**
     * @param cli arrives with the new data to update.
     * @param result help to verify the new fields
     * @return this method return a ModelAndView object
     *
     */
    @RequestMapping(value = "update.htm", method = RequestMethod.POST)
    public ModelAndView updateTeacher(@ModelAttribute("teach") Client cli, BindingResult result) {
        userVal.validate(cli, result);
        if (result.hasErrors()) {
            ModelAndView mav = new ModelAndView();
            mav.addObject("teach", cli);
            mav.setViewName("views/update");
            return mav;
        } else {
            ModelAndView mav = new ModelAndView();
            userDao.updateTeacherPost(cli);
            mav.setViewName("redirect:/view_all.htm");
            return mav;
        }

    }

    //Allow to delete a user in the database.
    /**
     * @param req receives the user's id
     * @return this method return a ModelAndView object
     */
    @RequestMapping(value = "delete.htm")
    public ModelAndView deleteTeacher(HttpServletRequest req) {
        ModelAndView mav = new ModelAndView();
        int user_id = Integer.parseInt(req.getParameter("id"));
        userDao.deleteTeacher(user_id);
        mav.setViewName("redirect:/view_all.htm");
        return mav;
    }

}
