package com.example.contoller;

import com.example.model.BankAccount;
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
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class AccountController {
    @RequestMapping(value = "/addbank")
    public String acount(Model model, @ModelAttribute("bankAccount")BankAccount bankAccount, HttpServletRequest request, SessionStatus status, HttpServletResponse response) throws Exception{
      /*  HttpSession session = request.getSession(true);
        session.setAttribute("Message", "");
        CloseableHttpResponse closeableHttpResponse1 = null;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://10.11.201.169:8080/ERAPAY/getAllBankforRegistration.do");
        List<NameValuePair> par = new ArrayList<>();
        par.add(new BasicNameValuePair("api_pass","getallbank"));
        par.add(new BasicNameValuePair("bankName",""));

        try {
            httpPost.setEntity(new UrlEncodedFormEntity(par));
            closeableHttpResponse1 = httpclient.execute(httpPost);
            String responseString = EntityUtils.toString(closeableHttpResponse1.getEntity(),"UTF-8");
            System.out.println("Response:"+responseString);
            Map<String,String> map = new HashMap<String,String>();
            model.addAllAttributes(map);
            bankAccount.setBankMapValue(map);
        }catch(Exception e){
            e.printStackTrace();
        } finally {
            httpclient.close();
        }*/
        return "bankaccount";
    }
}
