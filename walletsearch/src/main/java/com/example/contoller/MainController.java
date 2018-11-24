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
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class MainController {
    @RequestMapping(value= "/wallettowallet")
    public String wallet(Model model, HttpServletRequest request, HttpServletResponse response,@ModelAttribute("wallet")Wallet wallet) throws IOException {
       /* HttpSession session = request.getSession(true);
        session.setAttribute("WalletMsg", " ");*/
        return "wallet";
    }
    @RequestMapping(value= "/executewalletowallet")
    public String executewallet(Model model, HttpServletRequest request, HttpServletResponse response,@ModelAttribute("wallet")Wallet wallet) throws IOException {
        /*HttpSession session = request.getSession(true);
        String outCode="";
        String outMessage="";
        String userID = (String) session.getAttribute("GSMAILID");
        CloseableHttpResponse closeableHttpResponse = null;
        CloseableHttpClient httpclient = HttpClients.createDefault();;
        HttpPost httpPost = new HttpPost("http://10.11.201.169:8080/ERAPAY/waltowaltransfer.do");
        DateFormat df = new SimpleDateFormat("yyyy-MM-DD");
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);
        String walletId = (String) session.getAttribute("WALLETID");
        String amount= (String) session.getAttribute("WALLETAMOUNT");
        String narration= (String) session.getAttribute("WALLETNarration");
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("api_pass","D"));
        params.add(new BasicNameValuePair("docnum","123"));
        params.add(new BasicNameValuePair("doctyp","FND"));
        params.add(new BasicNameValuePair("oprcod","1"));
        params.add(new BasicNameValuePair("trndat",reportDate));
        params.add(new BasicNameValuePair("debit_walletid","WL000034"));
        params.add(new BasicNameValuePair("narration",narration));
        params.add(new BasicNameValuePair("emailID","akm_a.alam@yahoo.com"));
        params.add(new BasicNameValuePair("drcrcd","D"));
        params.add(new BasicNameValuePair("curcde","BDT"));
        params.add(new BasicNameValuePair("exrate","1"));
        params.add(new BasicNameValuePair("trnamt",wallet.getAmount()));
        params.add(new BasicNameValuePair("destwalletid",""));
        params.add(new BasicNameValuePair("srcrefno1",""));
        params.add(new BasicNameValuePair("srcrefno2",""));
        params.add(new BasicNameValuePair("srcrefno3",""));
        params.add(new BasicNameValuePair("srcrefno4",""));
        params.add(new BasicNameValuePair("narration",""));
        params.add(new BasicNameValuePair("terminalId",""));
        params.add(new BasicNameValuePair("oprstamp",userID));
        params.add(new BasicNameValuePair("timestamp",reportDate));
        System.out.println(params);
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(params));
            closeableHttpResponse = httpclient.execute(httpPost);
            String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
            System.out.println("Response ===== >>>>> "+responseString);
        }catch(Exception e){
            e.printStackTrace();

        } finally {
            httpclient.close();
        }
        String amt=wallet.getAmount();
        System.out.println("DD"+amt);
        CloseableHttpResponse closeableHttpResponse1 = null;
        CloseableHttpClient httpclient1 = HttpClients.createDefault();;
        HttpPost httpPost1 = new HttpPost("http://10.11.201.169:8080/ERAPAY/waltowaltransfer.do");
        List<NameValuePair> params1 = new ArrayList<>();
        params1.add(new BasicNameValuePair("api_pass","C"));
        params1.add(new BasicNameValuePair("emailID","akm_a.alam@yahoo.com"));
        params1.add(new BasicNameValuePair("debit_walletid"," "));
        params1.add(new BasicNameValuePair("narration",narration));
        params1.add(new BasicNameValuePair("docnum","123"));
        params1.add(new BasicNameValuePair("doctyp","FND"));
        params1.add(new BasicNameValuePair("oprcod","1"));
        params1.add(new BasicNameValuePair("trndat",reportDate));
        params1.add(new BasicNameValuePair("walletid",wallet.getDebit_walletid()));
        params1.add(new BasicNameValuePair("drcrcd","C"));
        params1.add(new BasicNameValuePair("curcde","BDT"));
        params1.add(new BasicNameValuePair("exrate","1"));
        params1.add(new BasicNameValuePair("trnamt",wallet.getAmount()));
        params1.add(new BasicNameValuePair("destwalletid",""));
        params1.add(new BasicNameValuePair("srcrefno1",""));
        params1.add(new BasicNameValuePair("srcrefno2",""));
        params1.add(new BasicNameValuePair("srcrefno3",""));
        params1.add(new BasicNameValuePair("srcrefno4",""));
        params1.add(new BasicNameValuePair("narration",""));
        params1.add(new BasicNameValuePair("terminalId",""));
        params1.add(new BasicNameValuePair("oprstamp",userID));
        params1.add(new BasicNameValuePair("timestamp",reportDate));

        System.out.println(params1);
        try {
            httpPost1.setEntity(new UrlEncodedFormEntity(params1));
            closeableHttpResponse1 = httpclient1.execute(httpPost1);
            String responseString = EntityUtils.toString(closeableHttpResponse1.getEntity(),"UTF-8");
            System.out.println("Response ===== >>>>> "+responseString);
            //json return
            JSONObject json = new JSONObject(responseString);
            outCode=json.getString("Response_Code");
            outMessage=json.getString("Response_Status");


        }catch(Exception e){

            e.printStackTrace();

        } finally {
            httpclient1.close();
        }
        if (outCode.equals("0")) {
            session.setAttribute("WalletMsg",outMessage);
            return "wallet";
        }
        else
        {
            session.setAttribute("WalletMsg",outMessage);

        }*/
        return "wallet";
    }
}


