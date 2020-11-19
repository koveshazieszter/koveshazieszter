package com.company;



public class UrlFixer {
    public static void main(String[] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";
        String improvedUrl = url.replace("bots", "odds");
        String rapair = improvedUrl.substring(0,5);
        String urlPiece1 = rapair.concat(":");
        String urlPiece2 = improvedUrl.substring(5);
        String correctUrl =  urlPiece1.concat(urlPiece2);
        System.out.println(correctUrl);

    }
}


