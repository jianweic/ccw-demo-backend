package org.affinityproject;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic;

import affinidi.aws.jsiisamples.jsii.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try
        {
        Object  h = new HelloWorld();
        HelloWorld objWorld = (HelloWorld) h;
        System.out.println( objWorld.fibonacci(9));
        System.out.println( "Hello World!" );
        }
        catch (Error e)
        {
            System.out.println(e);
        }
    }
}
