package issueReproducer;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.NotificationType;

public class NoticationGroupNPEDemo {

    public static void main(String[] args) {
        System.out.println("Started");

        NotificationGroup group = new NotificationGroup("Display ID", NotificationDisplayType.NONE, true, "somid", null);
        group.createNotification();
        Notification notification = group.createNotification("myTitle", "myMessage", NotificationType.INFORMATION, null);
        System.out.println("Title: " + notification.getTitle());

    }
}
