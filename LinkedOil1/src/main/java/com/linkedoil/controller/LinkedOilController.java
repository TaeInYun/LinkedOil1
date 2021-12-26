package com.linkedoil.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.linkedoil.action.LinkedOilAction;

/**
 * Servlet implementation class controller
 */
@WebServlet("*.do")
public class LinkedOilController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	HashMap<String, LinkedOilAction> map;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LinkedOilController() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig config) throws ServletException {
    	map = new HashMap<String, LinkedOilAction>();
    	try {
			String path = config.getServletContext().getRealPath("WEB-INF");
			FileReader fr = new FileReader(path+"/linkedoil.properties");
			Properties prop = new Properties();
			prop.load(fr);
			Iterator keyList = prop.keySet().iterator();
			while(keyList.hasNext()) {
				String key = (String)keyList.next();
				String clsName = prop.getProperty(key);
				LinkedOilAction obj = (LinkedOilAction)Class.forName(clsName).newInstance();
				map.put(key, obj);
			}
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
    	
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		proRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		proRequest(request, response);
	}
	
	public void proRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		
		String cmd = uri.substring( uri.lastIndexOf("/")+1); //listBoard.do
		LinkedOilAction action = map.get(cmd);   //new ListBoardAction()
		String viewPage = action.proRequest(request, response); //listBoard.jsp
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
}
