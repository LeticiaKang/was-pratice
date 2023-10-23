package org.example;

import java.io.BufferedReader;
import java.io.IOException;

public class HttpRequest {
    private final RequestLine requestLine;
//    private final HttpHeaders httpHeaders;
//    private final Body body;

    // read보다 BufferedReader가 더 속도가 빠르다. 특히 대용량에서.
    public HttpRequest(BufferedReader br) throws IOException {
        this.requestLine = new RequestLine(br.readLine());
    }

    public boolean isGetRequest() {
        // http 요청이 get 요청인가?
        // 다시 requestLine에 get요청인가를 물어봄
        return requestLine.isGetRequest();
    }

    public boolean matchPath(String requestPath) {
        // http 요청에 path가 calculate인가?
        // 다시 requestLine에  path가 calculate인가를 다시 물어봄
        return requestLine.matchPath(requestPath);
    }

    public QueryStrings getQueryStrings() {
        return requestLine.getQueryStrings();
    }

}