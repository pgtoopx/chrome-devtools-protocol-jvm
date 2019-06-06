package com.pgtoopx;

public class BuilderMessages {

    public static String buildNetWorkEnableMessage(){
        String message = "{\"id\":1,\"method\":\"Network.enable\",\"params\":{\"maxTotalBufferSize\":10000000,\"maxResourceBufferSize\":5000000}}";
        System.out.println(message);
        return message;
    }

    public static String buildGeoLocationMessage(String latitude, String longitude){
        String message = String.format("{\"id\":3,\"method\":\"Emulation.setGeolocationOverride\",\"params\":{\"latitude\":%s,\"longitude\":%s,\"accuracy\":100}}",latitude,longitude);
        System.out.println(message);
        return message;
    }

    public static String buildRequestInterceptorEnabledMessage(){
        String message = String.format("{\"id\":4,\"method\":\"Network.setRequestInterceptionEnabled\",\"params\":{\"enabled\":true}}");
        System.out.println(message);
        return message;
    }

    public static String buildRequestInterceptorPatternMessage(String pattern, String documentType){
        String message = String.format("{\"id\":5,\"method\":\"Network.setRequestInterception\",\"params\":{\"patterns\":[{\"urlPattern\":\"%s\",\"resourceType\":\"%s\"}]}}",pattern,documentType);
        System.out.println(message);
        return message;
    }
/*
    public static String buildBasicHttpAuthenticationMessage(String username,String password){
        byte[] encodedBytes = Base64.encodeBase64(String.format("%s:%s",username,password).getBytes());
        String base64EncodedCredentials = new String(encodedBytes);
        String message = String.format("{\"id\":2,\"method\":\"Network.setExtraHTTPHeaders\",\"params\":{\"headers\":{\"Authorization\":\"Basic %s\"}}}",base64EncodedCredentials);
        System.out.println(message);
        return message;
    }*/

    public static String buildNetworkEmulationOffline(){
        String message = String.format("{\"id\": 7,\"method\": \"Network.emulateNetworkConditions\",\"params\": {\"offline\": true,\"latency\": 300,\"downloadThroughput\": -1,\"uploadThroughput\": -1}}");
        System.out.println(message);
        return message;
    }
}
