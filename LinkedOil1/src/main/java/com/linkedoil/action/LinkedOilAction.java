package com.linkedoil.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LinkedOilAction {
	public String proRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
