package edu.eci.cvds.servlet.bean;

import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import org.springframework.stereotype.Component;

@Component
@ManagedBean
@SessionScoped
public class UserBean {
   private String userName;

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }
   
}
