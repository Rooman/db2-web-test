package com.study.webtest.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.study.webtest.entity.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Person> personList = Arrays.asList(new Person("Ann", 25), new Person("John", 15));
        String json = objectMapper.writeValueAsString(personList);

        resp.getWriter().write(json);
    }
}
