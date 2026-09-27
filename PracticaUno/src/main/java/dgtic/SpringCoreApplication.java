package dgtic;

import dgtic.modelo.Role;
import dgtic.modelo.SellerProfile;
import dgtic.modelo.User;
import dgtic.modelo.UserRole;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreApplication {
    public static void main(String[] args) {
        ApplicationContext contexto=
                new ClassPathXmlApplicationContext(new String[] {
                        "role.xml",
                        "sellerprofile.xml",
                        "user.xml",
                        "userrole.xml"
                });
        Role role = contexto.getBean("role", Role.class);
        role.setRoleId(1);
        role.setName("Cliente");
        System.out.println(role);

        User user = contexto.getBean("user", User.class);
        user.setUserId(1);
        user.setName("Fatima");
        user.setLastName("N");
        user.setUsername("fat123");
        user.setPassword("12345678");
        user.setEmail("fati@example.com");
        user.setActive(true);
        user.setCreateAt(new java.util.Date());
        System.out.println(user);

        UserRole userRole = contexto.getBean("userrole", UserRole.class);
        userRole.setRoleId(role);
        userRole.setUserId(user);
        System.out.println(userRole);


        SellerProfile sellerProfile = contexto.getBean("sellerprofile", SellerProfile.class);
        sellerProfile.setUserId(user);
        sellerProfile.setStoreName("Fatima's Store");
        sellerProfile.setVerified(true);
        System.out.println(sellerProfile);

        ((ClassPathXmlApplicationContext) contexto).close();
    }
}
