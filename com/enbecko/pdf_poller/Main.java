package com.enbecko.pdf_poller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by enbec on 04.12.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.ilias.uni-koeln.de/ilias/ilias.php?ref_id=1930379&cmdClass=ilrepositorygui&cmdNode=8c&baseClass=ilRepositoryGUI");
        BufferedReader br = new BufferedReader(new InputStreamReader((InputStream) url.getContent()));
        String tmp;
        while ((tmp = br.readLine()) != null) {
            System.out.println(tmp);
        }
        br.close();
    }
}
