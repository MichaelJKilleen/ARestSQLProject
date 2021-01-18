package com.bottomfeedersoftware.web;

public class GreeterService implements IGreeterService
{
   public String greet(final String name)
   {
      return "Hello " + name;
   }
}
