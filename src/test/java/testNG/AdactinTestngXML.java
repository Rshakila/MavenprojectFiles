package testNG;

public class AdactinTestngXML {<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test name="Test">
  <parameter name="Username" value="sakifaiz555"></parameter>
  <parameter name="Password" value="sathya25"></parameter>
  
  <parameter name="Check In Date" value="25-4-22"></parameter>
    <parameter name="Check Out Date" value="22-5-22"></parameter>
      <parameter name="first_name" value="shakila"></parameter>
      <parameter name="last_name" value="Rajendran"></parameter>
      <parameter name="address" value="24,first cross st,chennai"></parameter>
      <parameter name="cc_num" value="4567667366145678"></parameter>
      <parameter name="cc_cvv" value="202"></parameter>
    
  
    <classes>
      <class name="testNG.Adactin"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->


}
