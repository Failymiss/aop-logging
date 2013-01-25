/***********************************************************************************
 * Copyright (c) 2013. Nickolay Gerilovich. Russia.
 *   Some Rights Reserved.
 ************************************************************************************/

package net.ng.xspring.core.log.aop.service;

import java.io.IOException;

import net.ng.xspring.core.log.aop.annotation.Lp;

/**
 * Service interface.
 */
public interface FooService {

    void voidMethodZero();

    String stringMethodOne(String first);

    String stringMethodTwo(String first, String second);

    String stringMethodThree(String first, String second, String third);

    String stringMethodTwoVarargs(String first, @Lp String... second);

    void voidExcMethodZero() throws IOException;
}
