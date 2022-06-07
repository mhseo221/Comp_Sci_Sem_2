import java.util.*;
import java.util.Scanner;

class starter {
	import java.io.*;
import okhttp3.*;

public class main {
  public static void main(String []args) throws IOException{
    OkHttpClient client = new OkHttpClient().newBuilder().build();

    Request request = new Request.Builder()
      .url("https://api.apilayer.com/currency_data/live?source={source}&currencies={currencies}")
      .addHeader("apikey", "Qtp2nrtC9WVsy1nvySE4ZWG9LiHmLVnU")
      .method("GET", })
      .build();
    Response response = client.newCall(request).execute();
    System.out.println(response.body().string());
  }
}

