package test.bwie.com.volley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    private RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获得Volley对象
        requestQueue = Volley.newRequestQueue(this);
        Log.e("》》》》》》》》》", Url.url_ceshi);
        //设置请求方法，传递一个url，请求到一个字符串
        StringRequest request = new StringRequest(Url.url_ceshi, new Response.Listener<String>() {
            @Override//请求成功的返回结果
            public void onResponse(String response) {
                Toast.makeText(MainActivity.this, "" + response, Toast.LENGTH_SHORT).show();
                Log.e("=============", response);
            }
        }, new Response.ErrorListener() {
            @Override//请求失败的返回结果
            public void onErrorResponse(VolleyError error) {

            }
        });
        //给添加Volley请求方法
        requestQueue.add(request);
        /*
        注：Volley请求回来的数据，直接传递给主线程(吐司一下有效果，就是证明)
         */
    }
}
