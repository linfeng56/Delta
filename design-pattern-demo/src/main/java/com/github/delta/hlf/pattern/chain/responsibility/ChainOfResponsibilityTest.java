package com.github.delta.hlf.pattern.chain.responsibility;

import com.github.delta.hlf.pattern.chain.responsibility.Request.RequestBuilder;

import sun.font.CreatedFontTracker;

public class ChainOfResponsibilityTest {

    public static void main(String[] args) {
        Request request = new RequestBuilder().frequentOk(true).loggedOn(true).containsSensitiveWords(true).build();

        RequestFrequentHandler requestFrequentHandler =
                new RequestFrequentHandler(new RequestLoggingHandler(new RequestWordsHandler(null)));
        if (requestFrequentHandler.process(request)) {
            System.out.println("正常处理");
        } else {
            System.out.println("异常");
        }
    }
}

class Request {

    private boolean loggedOn;
    private boolean frequentOk;
    private boolean isPermits;
    private boolean containsSensitiveWords;
    private String requestBody;


    public boolean isLoggedOn() {
        return loggedOn;
    }

    public boolean isFrequentOk() {
        return frequentOk;
    }

    public boolean isPermits() {
        return isPermits;
    }

    public boolean isContainsSensitiveWords() {
        return containsSensitiveWords;
    }

    public Request(boolean loggedOn, boolean frequentOk, boolean isPermits, boolean containsSensitiveWords) {
        this.loggedOn = loggedOn;
        this.frequentOk = frequentOk;
        this.isPermits = isPermits;
        this.containsSensitiveWords = containsSensitiveWords;
    }

    static class RequestBuilder {

        private boolean loggedOn;
        private boolean frequentOk;
        private boolean isPermits;
        private boolean containsSensitiveWords;

        RequestBuilder loggedOn(boolean loggedOn) {
            this.loggedOn = loggedOn;
            return this;
        }

        RequestBuilder frequentOk(boolean frequentOk) {
            this.frequentOk = frequentOk;
            return this;
        }

        RequestBuilder isPermits(boolean isPermits) {
            this.isPermits = isPermits;
            return this;
        }

        RequestBuilder containsSensitiveWords(boolean containsSensitiveWords) {
            this.containsSensitiveWords = containsSensitiveWords;
            return this;
        }

        public Request build() {
            Request request = new Request(loggedOn, frequentOk, isPermits, containsSensitiveWords);
            return request;
        }
    }
}


abstract class Handler {

    Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    abstract boolean process(Request request);
}

class RequestFrequentHandler extends Handler {

    public RequestFrequentHandler(Handler next) {
        super(next);
    }

    @Override
    boolean process(Request request) {
        System.out.println("访问频率控制。");
        if (request.isFrequentOk()) {
            Handler next = getNext();
            if (null == next) {
                return true;
            } else {
                return next.process(request);
            }
        }
        return false;
    }
}


class RequestLoggingHandler extends Handler {

    public RequestLoggingHandler(Handler next) {
        super(next);
    }

    @Override
    boolean process(Request request) {
        System.out.println("登录认证。");
        if (request.isLoggedOn()) {
            Handler next = getNext();
            if (null == next) {
                return true;
            } else {
                return next.process(request);
            }
        }
        return false;
    }
}

class RequestWordsHandler extends Handler {

    public RequestWordsHandler(Handler next) {
        super(next);
    }

    @Override
    boolean process(Request request) {
        System.out.println("敏感词控制。");
        if (request.isContainsSensitiveWords()) {
            Handler next = getNext();
            if (null == next) {
                return true;
            } else {
                return next.process(request);
            }
        }
        return false;
    }
}
