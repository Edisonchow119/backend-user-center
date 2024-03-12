package com.potato.ucenter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
class UCenterApplicationTests {

    @Test
    void testDigest() throws NoSuchFieldException {
        String newPassword= DigestUtils.md5DigestAsHex(("potato" + "myPassword").getBytes());
        System.out.println(newPassword);
    }
    @Test
    void contextLoads() {
    }

}
