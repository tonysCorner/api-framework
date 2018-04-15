package com.godmn.framework.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

@org.springframework.stereotype.Service(value = "mailService")
public class MailService {

    @Autowired
    MetaMailPkg pkg;

    public boolean sendMail(String subject, String toMail, String content, String... files) {

        boolean isFlag = false;
        try {
            Properties props = new Properties();

            props.put("mail.smtp.host", pkg.getSmtp());
            props.put("mail.smtp.auth", true);

            Session session = Session.getDefaultInstance(props);
            session.setDebug(false);

            MimeMessage message = new MimeMessage(session);

            try {
                message.setFrom(new InternetAddress(pkg.getUsername(), "QQ邮件测试"));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(toMail));
                message.setSubject(subject);
                message.addHeader("charset", "UTF-8");

                /*添加正文内容*/
                Multipart multipart = new MimeMultipart();
                BodyPart contentPart = new MimeBodyPart();
                contentPart.setText(content);

                contentPart.setHeader("Content-Type", "text/html; charset=UTF-8");
                multipart.addBodyPart(contentPart);

                /*添加附件*/
                for (String file : files) {
                    MimeBodyPart fileBody = new MimeBodyPart();
                    String fileName = "test";
                    if (file.startsWith("http")) {
                        URL url = new URL(file);
                        fileBody.setDataHandler(new DataHandler(url));
                        fileName = file.substring(file.lastIndexOf("/") + 1);
                    } else {
                        File usFile = new File(file);
                        fileName = usFile.getName();
                        DataSource source = new FileDataSource(file);
                        fileBody.setDataHandler(new DataHandler(source));
                    }

                    fileBody.setFileName(MimeUtility.encodeText(fileName));  //得到文件名同样至入BodyPart );
                    multipart.addBodyPart(fileBody);
                }

                message.setContent(multipart);
                message.setSentDate(new Date());
                message.saveChanges();
                Transport transport = session.getTransport("smtp");

                transport.connect(pkg.getSmtp(), pkg.getUsername(),pkg.getPassword());
                transport.sendMessage(message, message.getAllRecipients());
                transport.close();
                isFlag = true;
            } catch (Exception e) {
                e.printStackTrace();
                isFlag = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isFlag;

    }

}
