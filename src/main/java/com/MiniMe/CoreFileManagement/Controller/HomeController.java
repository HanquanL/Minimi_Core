package com.MiniMe.CoreFileManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    /**
     * Forwards all non-API, non-static requests to the React app's index.html so
     * that client-side routing (React Router) works on page refresh / deep links.
     *
     * The pattern {path:[^\\.]*} matches any single path segment that does NOT
     * contain a dot, so requests for real static assets (e.g. /static/app.js,
     * /favicon.ico) are still handled by Spring's resource handler instead of
     * being forwarded here.
     */
    @RequestMapping(value = {"/", "/{path:[^\\.]*}"})
    public String index() {
        return "forward:/index.html";
    }
}