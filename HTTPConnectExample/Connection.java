package HTTPConnectExample;

import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.net.HttpURLConnection;
        import java.net.URL;
        import java.util.Scanner;

public class Connection {

    public static void main(String[] args) throws Exception {

        // Creates new Connection object from Connection class
        Connection testing = new Connection();

        testing.sendGet();
    }

    // sendGet() method
    private void sendGet() throws Exception {
        try {
            @SuppressWarnings("resource")
            Scanner input = new Scanner(System.in);

            // asks for website
            System.out.print("Enter website for get request.\n");
            System.out.print("Full URL (including http:// or https://) :");
            String website = input.next();

            URL object = new URL(website);
            HttpURLConnection connect = (HttpURLConnection) object.openConnection();

            // Sets the request method to GET
            connect.setRequestMethod("GET");



            // Checks response code
            // If HTTP response code is a 200 it results in a pass

            int response = connect.getResponseCode();
            String message;
            if (response == 200)
            {
                message = "passed";
            }
            else
            {
                //if response var is modified it needs to be an int data type
                // using message here to simplify
                message = "faled";
                ;
            }
            System.out.println("\nSending (GET) request to URL: " + website);
            System.out.println("Response Code: " + response + " Test " + message);

            // Reads into HTML
            BufferedReader read = new BufferedReader(new InputStreamReader(connect.getInputStream()));

            String input2;

            // Use while loop to print output
            System.out.println("Response from (GET) request: ");
            while ((input2 = read.readLine()) != null) {
                System.out.println(input2);
            }
            // Closes the input stream
            read.close();
        }
        catch(Exception e){
            //Print oout the thrown exception if we don't return 200 as an HTTP response.
            System.out.println(e);
        }
    }
}