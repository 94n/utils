package com.mySampleApplication.server;

import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.apphosting.api.ApiProxy;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * User: makstitoff
 * Date: 04.04.2014
 * Time: 22:40
 */
public class GwtHostingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.append("<html><head>");
        ApiProxy.setEnvironmentForCurrentThread(new MyEnvironment());
        ApiProxy.setDelegate(new MyDelegate());
        UserService userService = UserServiceFactory.getUserService();
        if (userService.isUserLoggedIn()) {
            // Add a <script> tag to serve your app's generated JS code
            writer.append("<script type=\"text/javascript\" src=\"MySampleApplication/MySampleApplication.nocache.js\"></script>");
            writer.append("</head><body>");
            // Add a link to log out
            writer.append("<a href=\"" + userService.createLogoutURL("/") + "\">Log out</a>");
        } else {
            writer.append("</head><body>");
            // Add a link to log in
            writer.append("<a href=\"" + userService.createLoginURL("/") + "\">Log in</a>");
        }
        writer.append("</body></html>");
    }

    private class MyDelegate implements ApiProxy.Delegate {

        @Override
        public byte[] makeSyncCall(ApiProxy.Environment environment, String packageName, String methodName, byte[] request) throws ApiProxy.ApiProxyException {
            return new byte[0];
        }

        @Override
        public Future<byte[]> makeAsyncCall(ApiProxy.Environment environment, String packageName, String methodName, byte[] request, ApiProxy.ApiConfig apiConfig) {
            return null;
        }

        @Override
        public void log(ApiProxy.Environment environment, ApiProxy.LogRecord record) {

        }

        @Override
        public void flushLogs(ApiProxy.Environment environment) {

        }

        @Override
        public List<Thread> getRequestThreads(ApiProxy.Environment environment) {
            return null;
        }
    }

    private class MyEnvironment implements ApiProxy.Environment{


        @Override
        public String getAppId() {
            return null;
        }

        @Override
        public String getModuleId() {
            return null;
        }

        @Override
        public String getVersionId() {
            return null;
        }

        @Override
        public String getEmail() {
            return null;
        }

        @Override
        public boolean isLoggedIn() {
            return false;
        }

        @Override
        public boolean isAdmin() {
            return false;
        }

        @Override
        public String getAuthDomain() {
            return null;
        }

        @Override
        public String getRequestNamespace() {
            return null;
        }

        @Override
        public Map<String, Object> getAttributes() {
            return null;
        }

        @Override
        public long getRemainingMillis() {
            return 0;
        }
    }

}
