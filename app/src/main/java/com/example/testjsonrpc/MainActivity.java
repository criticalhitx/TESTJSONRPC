package com.example.testjsonrpc;
// The JSON-RPC 2.0 classes
import com.thetransactioncompany.jsonrpc2.*;
// We'll need the standard Map and HashMap classes too
import java.util.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Map<String,Object> params = new HashMap<String,Object>();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // The remote method to call
    String method = "makePayment";

    // The required named parameters to pass

    public MainActivity() {
        params.put("recipient", "Penny Adams");
        params.put("amount", 175.05); }

    // The mandatory request ID
    String id = "req-001";

    // Create a new JSON-RPC 2.0 request
    JSONRPC2Request reqOut = new JSONRPC2Request(method, params, id);

    // Serialise the request to a JSON-encoded string
    String jsonString = reqOut.toString();

// jsonString can now be dispatched to the server...

}