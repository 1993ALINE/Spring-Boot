package com.example.contoller;

import com.example.model.Wallet;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

@Controller
public class SearchController {
    @RequestMapping(value= "/search")
    public String walletsearch(Model model, @ModelAttribute("wallet")Wallet wallet, HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(true);
        CloseableHttpResponse closeableHttpResponse = null;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://10.11.201.169:8080/ERAPAY/searchDestinationWalletID.do");
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("api_pass", "serachwalletid"));
        params.add(new BasicNameValuePair("walletID", ""));
        params.add(new BasicNameValuePair("Name", ""));
        params.add(new BasicNameValuePair("MobileNo", ""));
        params.add(new BasicNameValuePair("customerID", ""));

        try {
            httpPost.setEntity(new UrlEncodedFormEntity(params));
            closeableHttpResponse = httpclient.execute(httpPost);
            String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
            System.out.println("Response ---" + responseString);
            ArrayList<Wallet> listOfResponse = new ArrayList<Wallet>();
            int i = 0;
            Wallet wallet1 = new Wallet();
            StringTokenizer multiTokenizer = new StringTokenizer(responseString, ",");
            while (multiTokenizer.hasMoreTokens()) {
                String elem = multiTokenizer.nextToken();
                elem = elem.replace("[", "").replace("]", "").replace("\"", "");
                if (i % 3 == 0) {
                    System.out.println("1 " + elem);
                    wallet1.setWalletID(elem);
                } else if (i % 3 == 1) {
                    wallet1.setName(elem);
                    System.out.println("2" + elem);
                } else if (i % 3 == 2) {
                    System.out.println("3 " + elem);
                    wallet1.setMobileNO(elem);
                    listOfResponse.add(wallet1);
                    wallet1 = new Wallet();
                }

                ++i;
            }
            wallet.setArrayList(listOfResponse);
        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            httpclient.close();
        }
        return "search";
    }
}
