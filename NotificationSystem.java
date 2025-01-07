// Notification interface

interface Notification {

void sendNotification();
}
// EmailNotification class implementing Notification interface
class EmailNotification implements Notification {

private String emailAddress;

// Constructor to initialize the email address
public EmailNotification(String emailAddress) {
this.emailAddress = emailAddress;
}
// Implementation of the sendNotification method for email notifications
@Override
public void sendNotification() {
System.out.println("Email notification sent to: " + emailAddress);
}
}
// SMSNotification class implementing Notification interface
class SMSNotification implements Notification {
private String phoneNumber;
// Constructor to initialize the phone number
public SMSNotification(String phoneNumber) {
this.phoneNumber = phoneNumber;
}
// Implementation of the sendNotification method for SMS notifications
@Override
public void sendNotification() {
System.out.println("SMS notification sent to: " + phoneNumber);
}
}
// PushNotification class implementing Notification interface
class PushNotification implements Notification {
private String deviceId;
// Constructor to initialize the device ID
public PushNotification(String deviceId) {
    this.deviceId = deviceId;

}

// Implementation of the sendNotification method for push notifications
@Override
public void sendNotification() {
System.out.println("Push notification sent to device ID: " + deviceId);
}
}
// Main class for testing the notification system
public class NotificationSystem {
public static void main(String[] args) {
// Create instances of different types of notifications
Notification emailNotification = new EmailNotification("gripsy@psgrkcw.ac.in");
Notification smsNotification = new SMSNotification("+123456789");
Notification pushNotification = new PushNotification("device123");
// Send notifications
emailNotification.sendNotification();
smsNotification.sendNotification();
pushNotification.sendNotification();
}
}
