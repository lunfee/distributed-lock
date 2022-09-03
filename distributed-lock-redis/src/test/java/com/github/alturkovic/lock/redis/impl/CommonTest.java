package com.github.alturkovic.lock.redis.impl;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author lunfee@qq.com
 * @date 2022/9/3 13:27
 */
@AllArgsConstructor
@Slf4j
public class CommonTest {

  @Test
  void test0 () {
    log.info(UUID.randomUUID().toString());
  }
}
