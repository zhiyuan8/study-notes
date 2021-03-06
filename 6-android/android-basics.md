# Android Basics

Android Studio tutorials:
https://developer.android.com/codelabs/build-your-first-android-app#3
https://developer.android.com/guide


# 1. Overview
<p align="center">
![Android Module](android-frame.png)
</p>

Application components:
*Intent*: Android Intent is the message that is passed between components such as activities, content providers, broadcast receivers, services etc. It is generally used with startActivity() method to invoke activity, broadcast receivers etc. The glue that simplifies implementation of Apps that reuse existing components.
*Activity*: provide a screen which users can interact in order to do something. They dictate the UI and handle the user interaction to the smart phone screen.
*Broadcast Receiver*: They handle communication between Android OS and applications.  
*Services*: run in background to perform long-running operations or access remote resources. They handle background processing associated with an application.
*Content Provider*: manage access to structured data & provide data security mechanism. They handle data and database management issues.  

## 1.1 Activity
An activity represents a single screen with a user interface,in-short Activity performs actions on the screen. For example, an email application might have one activity that shows a list of new emails, another activity to compose an email, and another activity for reading emails.  
```
public class MainActivity extends Activity {
}
```

## 1.2 Service
A service is a component that runs in the background to perform long-running operations.  
```
public class MyService extends Service {
}
```

## 1.3 Broadcast Receivers
Broadcast Receivers simply respond to broadcast messages from other applications or from the system.  
```
public class MyReceiver  extends  BroadcastReceiver {
   public void onReceive(context,intent){}
}
```

## 1.4 Content Providers

```
public class MyContentProvider extends  ContentProvider {
   public void onCreate(){}
}
```
## 1.5 Service

# 2. Intent
#2.1 Intent overview
An intent is a message one component uses to interact with—or request functionality from—other component(s)
ACTION_VIEW
ACTION_CALL

An intent is implemented as a “passive” data structure. It just consists of fields & field accessor/ mutator methods & isn’t “object-oriented”.

startActivity
startActivityForResults
sendBroadcast
startService, bindService


Apps can use intents to describe two types of things:
(1) An operation to perform
(2) An event that has occurred

late run-time binding: components can be discovered & used at runtime vs. compile-time

The component->process mapping can be configured declaratively via the AndroidManifest.xml file

#2.2 Intent components
Name: Name for a component to handle intent (optional). Intent with name (explicit), Intent w.o. name (implicit)  

Action
A string naming the operation to perform or in case of broadcast intents the event that has occurred & is being reported

Data
URI of data to be acted on & the MIME type of that data

Category
String giving additional info about the action to execute

Extras
Key-value pairs for additional information that should be delivered to component handling the intent

Flags
Flags of various sorts


#2.3 Intent coding example
The Intent API is used for a similar purpose as passing parameters to a method call
```java
Intent intent = new Intent(ACTION_VIEW,data); 
intent.putExtra("Today", "July 18, 2016"); 
intent.putExtra("Pi", 3.1416); 
intent.putExtra("isHot", true); 
intent.putExtra("Answer", 42);
startActivity(intent);
```
versus
```java
startActivity(ACTION_VIEW, data, param1, param2, param3, param4);
```

The component receiving an intent uses getter methods to extract data inserted by the sender
```java
Intent i = getIntent();
Uri data = i.getData();
String s = i.getStringExtra("Today"); Float f = i.getFloatExtra("Pi"); Boolean b = i.getBooleanExtra("isHot"); Integer n = i.getIntegerExtra("Answer");
```

A named (“explicit”) intent is sent to an instance of the given class
```java
Intent intent = new Intent(this, C.class);
Intent intent = new Intent() .setComponent(name) .setClass(this, C.class);
```

An unnamed (“implicit”) intent uses other information in the intent to locate the target class.
An action is designated by a Java String.
```java


```

### 1.4.2 action (explicit vs implicit)
broadcast receiver


intent in AndroidManifest.xml:





