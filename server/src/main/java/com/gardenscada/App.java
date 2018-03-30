package com.gardenscada;

import java.io.*;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.Properties;
import java.util.Hashtable;

/**
 * Main entry point for GardenSCADA server
 * @version 1.0
 * @author Erik Lee (erikjlee@hotmail.com)
 *
 * Alarm class (severity, AlarmAction[])
 * Sensor class (temp, humidity, composite)
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Starting GardenSCADA server..." );
        Properties appProps = new Properties();
        //String dir = System.getProperty("user.dir");
        String currDir = new File(".").getAbsolutePath() ;
        System.out.println("Current directory: " + currDir);

        try {
            FileInputStream in = new FileInputStream("properties");
            appProps.load(in);
        }
        catch(IOException f) {
            System.out.println("Properties file 'properties' not found. Exiting...");
            return;
        }

        Logger log = LogManager.getLogManager().getLogger("MAIN");

        //Any command args?
        for(String arg:args) {

        }

        //Handle console input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            System.out.print("[GSCADA]: ");
            String input = br.readLine();
            //is it a property? if so, print it out
            //TODO: how to update property?

            switch(String input.toUpperCase())
            {
                case "EXIT":
                    //TODO: clean up, save Peoperties
                    break;

                default:

            }
            System.out.println("IN: " + input);
        }

    }
}




